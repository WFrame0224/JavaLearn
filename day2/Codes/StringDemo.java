public class StringDemo
{
	public static void main(String[] args) 
	{
		String ltr = "----------------------";

		System.out.println("Hello World!");
		String name = "Fei";
		System.out.println("name="+name);
		System.out.println(ltr);

		//输出带双引号的字符串,采用转义符 \ 
		System.out.println("\"name\" = "+name+"_Wall");
		System.out.println(17+" love "+18);
		String str = 17 + "ABC";
		System.out.println(str);
		System.out.println(ltr);
		
		//boolean b = 17;//失败
		//int b = 17;//成功
		//char b = 17;//不算成功
		//short b = 17;//成功
		//long b = 17;//成功
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
		System.out.println("随机生成的6位随机字母为：" + result);

	}
}
