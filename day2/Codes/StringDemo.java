public class StringDemo
{
	public static void main(String[] args) 
	{
		String ltr = "----------------------";

		System.out.println("Hello World!");
		String name = "Fei";
		System.out.println("name="+name);
		System.out.println(ltr);

		//�����˫���ŵ��ַ���,����ת��� \ 
		System.out.println("\"name\" = "+name+"_Wall");
		System.out.println(17+" love "+18);
		String str = 17 + "ABC";
		System.out.println(str);
		System.out.println(ltr);
		
		//boolean b = 17;//ʧ��
		//int b = 17;//�ɹ�
		//char b = 17;//����ɹ�
		//short b = 17;//�ɹ�
		//long b = 17;//�ɹ�
		float b = 17.0f;
		str = "ABC";
		System.out.println(str+b);
		System.out.println(b+str);

		String result = "";
		for (int i = 0; i < 6 ; i++ )
		{
			int intval = (int)(Math.random() * 26 + 97);
			result += (char)intval;
		}
		System.out.println("������ɵ�6λ�����ĸΪ��" + result);

	}
}
