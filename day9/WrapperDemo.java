class WrapperDemo 
{
	public static void main(String[] args) 
	{
		// �˴���ʾ���ð�װ��ʵ���ַ����ͻ������͵��໥ת��

		// �ַ���תΪ��������
		String intStr = "123";
		int it1 = Integer.parseInt(intStr); // ��ʽһ�����ð�װ���ṩ�ľ�̬���� parseXxx(String s)
		int it2 = new Integer(intStr);		// ��ʽ�������ð�װ���ṩ�Ĺ�����Xxx(String s)

		System.out.println(it1);
		System.out.println(it2);

		String floatStr = "3.1415";
		float ft1 = Float.parseFloat(floatStr);
		System.out.println(ft1);

		// ��������תΪ�ַ�������
		String ftStr = String.valueOf(3.14f);	// ����������תΪ�ַ���������String.valueOf()����
		System.out.println(ftStr);
		String boolStr = String.valueOf(true);
		System.out.println(boolStr);
		System.out.println(boolStr.toUpperCase());


	}
}
