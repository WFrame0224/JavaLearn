package com.day15._02_process_communication_lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//������Դ��������--�Ա�
public class ShareResource {
	private String name;
	private String gender;
	private boolean isEmpty = true;
	private final Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	/**
	 * ������������Դ�����д洢����
	 * @param name     �洢������
	 * @param gender   �洢���Ա�
	 */
	public void push(String name, String gender) {
		lock.lock();//���뷽�����������
		try {
			while(!isEmpty){
				condition.await();//���������Դ�в�Ϊ�գ���ȴ���������������
			}
			//----------������ʼ------------------
			this.name = name;
			Thread.sleep(10);
			this.gender = gender;
			//----------��������------------------
			isEmpty = false;//���ù�����Դ״̬Ϊ�ǿ�
			condition.signalAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally{
			lock.unlock();//��������������
		}
	}

	/**
	 * �����ߴӹ�����Դ������ȡ������
	 */
	public void popup() {
		lock.lock();//���뷽�����������
		try {
			while(isEmpty){
				condition.await();//���������Դ����Ϊ�գ���ȴ�����������
			}
			//-----------���ѿ�ʼ--------------
			Thread.sleep(10);
			System.out.println(this.name + "-" + this.gender);
			//-----------���ѽ���--------------
			isEmpty = true;//���ѽ�����������Դ״̬Ϊ��
			condition.signalAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally{
			lock.unlock();//��������������
		}
	}
}
