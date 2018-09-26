package com.day15._01_process_communication;

//������Դ��������--�Ա�
public class ShareResource {
	private String name;
	private String gender;
	private boolean isEmpty = true;//������ʾ������Դ�����Ƿ�Ϊ�յ�״̬

	/**
	 * ������������Դ�����д洢����
	 * @param name     �洢������
	 * @param gender   �洢���Ա�
	 */
	synchronized public void push(String name, String gender) {
		try {
			while (!isEmpty) {//��isEmptyΪfalse��ʱ�򣬲��գ�Ӧ�õȴ�����������ȡ
				//ʹ��ͬ�������������ã���ʾ��ǰ�߳��ͷ�ͬ����������ȴ����У�ֻ�ܱ������߳�������
				this.wait();
			}
			//----------������ʼ------------------
			this.name = name;
			Thread.sleep(10);
			this.gender = gender;
			//----------��������------------------
			isEmpty = false;//���ù�����Դ���ݲ�Ϊ��
			this.notifyAll();//����һ��������
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * �����ߴӹ�����Դ������ȡ������
	 */
	synchronized public void popup() {
		try {
			while (isEmpty) {//��isEmptyΪtrue��ʱ��Ϊ�գ�Ӧ�õȴ�����������������
				//ʹ��ͬ�������������ã���ʾ��ǰ�߳��ͷ�ͬ����������ȴ����У�ֻ�ܱ������߳�������
				this.wait();
			}
			//-----------���ѿ�ʼ--------------
			Thread.sleep(10);
			System.out.println(this.name + "-" + this.gender);
			//-----------���ѽ���--------------
			isEmpty = true;//���ù�����Դ����Ϊ��
			this.notifyAll();//����һ��������
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
