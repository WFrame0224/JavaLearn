class TypeConvert 
{
	public static void main(String[] args) 
	{
		byte b1 = 12;
		char s1 = (char)b1;
		System.out.println(s1);
		short a1 = (short)s1;
		System.out.println(a1);
		System.out.println('a'+1);
		System.out.println("a"+1);
		System.out.println('a'+'b');
		System.out.println("a"+'b');
	}
}