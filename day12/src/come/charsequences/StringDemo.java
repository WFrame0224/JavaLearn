package come.charsequences;

/**���������
 * ���д���ֱ𴴽��˼���String����
 * 		String str1 = "ABCD";-->��ഴ��һ��String�������ٲ�����String������� ������ ���Ѿ����ڡ�ABCD��,��ôstr1ֱ������
 * 							��ʱ������String���󣬷������ڳ������д�����ABCD����������
 * 		String str2 = new String("ABCD");-->��ഴ������String�������ٴ���һ��String����new�ؼ��־��Ի��ڶѿռ䴴���ڴ�����
 * 									�������ٴ���һ��String����
 */
public class StringDemo {
	private static String getXx()
	{
		return "AB";
	}
	public static void main(String[] args) {
/*		String str1 = "ABCD";
		String str2 = new String("ABCD");
		System.out.println(str1 == str2);//flase
		System.out.println(str1.equals(str2));//true
		System.out.println("==================================");*/
		String str1 = "ABCD";
		String str2 = "A" + "B" + "C" + "D";
		String str3 = "AB" + "CD";
		String str4 = new String("ABCD");
		String temp = "AB";
		String str5 = temp +"CD";
		String str6 = getXx() + "CD";
		
		System.out.println(str1 == str2);//true  �������Ż��Ľ��
		System.out.println(str1 == str3);//true	 �������Ż��Ľ��
		System.out.println(str1 == str4);//flase
		System.out.println(str1 == str5);//flase  �����ڱ���ʱ�ڲ�֪����ֵ������ʱ��֪��ֵ����Ϊ���٣�����û�б������Ż�
		System.out.println(str1 == str6);//flase  �����ڱ���ʱ��ֻ�Ǽ���﷨�Ƿ���ȷ��ֻ��������ʱ�Ż�ִ�� 
		/**String����Ƚ�
		 * 1��������ʹ��""���Ŵ������ַ�������ֱ�����������ھ��Ѿ�ȷ���洢���������У�
		 * 2����ʹ��new String("")�����Ķ����洢�����ڴ��У��������ڲŴ���
		 * 3����ʹ��ֻ����ֱ�������ַ������ӷ���"aa" + "bb"����Ҳ��ֱ����������ʱ�ھ���ȷ���洢�ڳ������У�str2��str3��
		 * 4����ʹ�ð���Stringֱ��������final���η������ַ������ʽ����"aa" + str�����������������ڲŴ����ģ��洢�ڶ���-->
		 * 						ͨ������/���� ����ȥ�����ַ�������ֻ��������ʱ�ڲ���ȷ��������ֵ�ͷ����ķ���ֵ�������ڱ����Ż�����
		 */
	}

}
