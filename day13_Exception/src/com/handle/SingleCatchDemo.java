package com.handle;
/**try-catch���񵥸��쳣�﷨����
 * try{
 * 		//��д���ܻ�����쳣�Ĵ���
 * }catch(�쳣���� e){
 * 		�����쳣�Ĵ���		
 * 		//��¼��־����ӡ�쳣��Ϣ�������׳��쳣�Ȳ���
 * }
 * ��λ�ȡ�쳣��Ϣ��Throwable��ķ���
 * 1����String getMessage():��ȡ�쳣��������Ϣ��ԭ��(��ʾ���û���ʱ�򣬾���ʾ����ԭ��)
 * 2����String toString():��ȡ�쳣�����ͺ��쳣��������Ϣ,һ�㲻��
 * 3����void printStackTrace():��ӡ�쳣�ĸ�����Ϣ�����������̨���������쳣�����ͣ��쳣��ԭ�򣬻������쳣���ֵ�λ�ã��ڿ����͵��Խ׶ζ���ʹ��
 * ��ס��������catch�����У�����д��e.printStackTrace();Ŀ�ģ��鿴�쳣�ľ�����Ϣ��������Ժ��޸�
 */
//ʹ��try-catch���񵥸��쳣
public class SingleCatchDemo {

	public static void main(String[] args) {
		System.out.println("begin.......");
		try{
			int ret = 10 / 0;
			System.out.println("���= " + ret);
		}catch(ArithmeticException e){
/*			System.out.println("�쳣��Ϣ��" + e.getMessage());
			System.out.println("�쳣��Ϣ��" + e.toString());*/
			System.out.println("-------------------------");
			e.printStackTrace();//һ�㶼ʹ�����
			System.out.println("����Ϊ0�����飡����");
		}
		System.out.println("ending.......");
		
	}

}
