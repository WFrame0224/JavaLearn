package com.handle;
/**ʹ��try-catch�������쳣
 * try{
 * 		��д�쳣���ܻ���ֵĴ���
 * }catch(�쳣����A e){ ��try�г���A�����쳣������catch������
 * 		�����쳣�Ĵ���		
 * 		//��¼��־����ӡ�쳣��Ϣ�������׳��쳣�Ȳ���
 * }catch(�쳣����B e){ ��try�г���B�����쳣������catch������
 * 		�����쳣�Ĵ���		
 * 		//��¼��־����ӡ�쳣��Ϣ�������׳��쳣�Ȳ���
 * }..
 * ע�⣺
 * 		1����һ��catch��䣬ֻ�ܲ���һ�����͵��쳣�������Ҫ��������쳣���͵�ʹ�ö��catch���
 * 		2����������һ˲��ֻ�ܳ���һ�����͵��쳣��ֻ��Ҫһ��catch���񣬲�����ͬʱ���ֶ���쳣
 *
 */
public class MutiCatchDemo {

	public static void main(String[] args) {
		System.out.println("Beging........");
		String sNum1 = "10";//�û�����ı�����
		String sNum2 = "0";//�û�����ĳ���
		try{
			//��Stringת��Ϊint����
			int num1 = Integer.parseInt(sNum1);
			int num2 = Integer.parseInt(sNum2);
			System.out.println("---------------");
			//�����������
			int ret = num1 / num2;
			System.out.println("��� = " + ret);
		}catch(ArithmeticException e){
			System.out.println("����Ϊ0");
			e.printStackTrace();
		}catch(NumberFormatException e){
			System.out.println("����ת��������");
			e.printStackTrace();
		}catch(Exception e){//�����������������쳣��ִ������ģ����ҷ���������catch
			e.printStackTrace();
		}
		System.out.println("ending........");
	}

}
