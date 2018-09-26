package come.maths;

import java.math.BigDecimal;

/**
 * ����ѧ��ص������ࣺ
 * Math:		��������ִ�л�����ѧ����ķ����������ָ����������ƽ���������Ǻ���,���Ǿ�̬������
 * BigDecimal:	�ṩ���²�������������Ȳ��������롢�Ƚϡ���ϣ�㷨�͸�ʽת��,folat��double�����ܱ�ʾ��ȷ��С����ʹ�ø�����Դ����Ǯ�;���Ҫ��ߵ�����
 * 			  ����BigDecimal add(BigDecimal other)          ����BigDecimal subtract(BigDecimal other)
 * 			  �ˣ�BigDecimal multiply(BigDecimal other)	     ����BigDecimal divide(BigDecimal other)
 * BigInteger:	�ṩ���� Java �Ļ��������������Ķ�Ӧ����ṩ java.lang.Math ��������ط���, ���ṩ�������㣺ģ������GCD ���㡢�������ԡ��������ɡ�λ�����Լ�һЩ��������
 * 				��ʾ�����ͣ��������long���͵����ֵ�����㣬���long��Ҳ�治�£���ʱʹ��BigInteger�����ļӼ��˳�������BigDecimalһ��
 * 			  ����BigDecimal add(BigDecimal other)          ����BigDecimal subtract(BigDecimal other)
 * 			  �ˣ�BigDecimal multiply(BigDecimal other)	     ����BigDecimal divide(BigDecimal other)			
 */
public class BigDecimalDemo {

	public static void main(String[] args) {
		//ʹ��double
		System.out.println("0.09 + 0.01 = " + (0.09 + 0.01));//0.09 + 0.01 = 0.09999999999999999
		System.out.println("1.0 - 0.33 = " + (1.0 - 0.33));//1.0 - 0.33 = 0.6699999999999999
		System.out.println("4.015 * 1000 = " + (4.015 * 1000));//4.015 * 1000 = 4014.9999999999995
		System.out.println("12.3 / 100 = " + (12.3 / 100));//12.3 / 100 = 0.12300000000000001
	
		//ʹ��BigDecimal
		//BigDecimal(double val) �� double ת��Ϊ BigDecimal�������� double �Ķ����Ƹ���ֵ׼ȷ��ʮ���Ʊ�ʾ��ʽ
		/*
		 * ע�⣬�����������У�String���͵Ĵ����ǿɿ���׼ȷ�ģ���ֱ��ֵ���ݱ���㲻��ȷ��
		 */
		BigDecimal num1 = new BigDecimal("0.09"); 
		BigDecimal num2 = new BigDecimal("0.01"); 
		BigDecimal num3 = new BigDecimal("1.0"); 
		BigDecimal num4 = new BigDecimal("0.33"); 
		BigDecimal num5 = new BigDecimal("4.015");
		BigDecimal num6 = new BigDecimal("1000");
		BigDecimal num7 = new BigDecimal("12.3");
		BigDecimal num8 = new BigDecimal("100");
		
		System.out.println("0.09 + 0.01 = " + (num1.add(num2)));//0.09 + 0.01 = 0.10
		System.out.println("1.0 - 0.33 = " + (num3.subtract(num4)));//1.0 - 0.33 = 0.67
		System.out.println("4.015 * 1000 = " + (num5.multiply(num6)));//4.015 * 1000 = 4015.000
		System.out.println("12.3 / 100 = " + (num7.divide(num8)));//12.3 / 100 = 0.123
		
	}

}
