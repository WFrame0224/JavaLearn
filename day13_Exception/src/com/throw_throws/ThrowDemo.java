package com.throw_throws;
/**�׳��쳣
 * throw:
 * 		�����ڷ����ڲ����׳�һ��������쳣����,��returnһ���������ǰ������
 * 		throw new �쳣��(���쳣��Ϣ��); ��ֹ����
 * 		һ��ģ���һ���������������������ʱ�����ǲ�֪���÷����÷���ʲô����ʱ�ͷ���һ��������catch����м��������׳��쳣
 * 		   **  return �Ƿ���һ��ֵ��throw �Ƿ���һ�����󣬷��ظ��÷����ĵ�����  **
 * throws: �����ڷ�������֮�ϣ����ڱ�ʾ��ǰ�����������쳣���������Ѹ÷����ĵ������������쳣(�׳��쳣)��
 * ---------------------------------------------------------------------------------------
 * 
 *
 */
public class ThrowDemo {
	public static void main(String[] args) {
		//System.out.println("ABCDEF".charAt(-1));
		
		System.out.println("begin.......");
		try{
			int ret = divide(10 , 0);
			System.out.println(ret);
		}catch(ArithmeticException e){ 
			System.out.println(e.getMessage());
		}	
		System.out.println("ending.......");		
	}
	private static int divide(int num1,int num2){
		if(num2 == 0){
			throw new ArithmeticException("��������Ϊ0");
		}
		int ret = num1 / num2;	
		return ret;
	}
}
