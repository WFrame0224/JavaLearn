package come.maths;
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
//��ʾMath���еĳ����;�̬����
public class MathDemo {
	public static void main(String[] args) {
		System.out.println(Math.max(10, 99));
		//public static double random() ���ش����ŵ� double ֵ����ֵ���ڵ��� 0.0 ��С�� 1.0-->[0,1)
		double rand = Math.random()*100;
		System.out.println((int)rand);
	}
}
