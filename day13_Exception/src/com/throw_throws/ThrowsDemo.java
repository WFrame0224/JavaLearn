package com.throw_throws;
/**
 * throws: �����ڷ�������֮�ϣ����ڱ�ʾ��ǰ�����������쳣���������Ѹ÷����ĵ������������쳣(�׳��쳣)��
 * �﷨�����η� ������([�����б�]) throws Exception{}
 * 		��ʾ���ڱ������в�����ĳ�����͵��쳣,���ѵ�������Ҫ������쳣 
 *			ע�⣺���ÿ�����������������쳣����ֱ��ͨ��throws�����׳�������쳣���׳���main�����������ʱmain����������
 *					�����׸�JVM���ײ�Ĵ�����ƾ��Ǵ�ӡ�쳣�ĸ���ջ��Ϣ��runtime�쳣Ĭ�Ͼ������ִ���ʽ
 */
public class ThrowsDemo {

	public static void main(String[] args) {
		try {
			divide(10,0);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//��ʾ���ڱ������в�����ĳ�����͵��쳣,���ѵ�������Ҫ������쳣 
	private static int divide(int num1,int num2) throws Exception{
		if(num2 == 0){
			throw new Exception("��������Ϊ0");
		}
		int ret = num1 / num2;	
		return ret;
	}
}
