class BitOperatorDemo 
{
	public static void main(String[] args) 
	{
		System.out.println(-2 >>> 2);

		System.out.println(-2 >> 2 );
		System.out.println(-2 << 2);

		System.out.println(7 >> 2);
		System.out.println(-5 >> 2);

		// 对于int类型的整数移位 a>>b,当b>32时，系统先用b对32求余，得到的结果才是真正的移位数
		System.out.println((5 >> 33) == (5 >> 1)); 
		// 对于long类型的整数移位 a>>b,当b>64时，系统先用b对64求余，得到的结果才是真正的移位数
		System.out.println((5L >> 65) == (5L >> (65 % 64)));

		int a = 5;
		int b = 4;
		int c = a++ - --b*++a/b-->>2%a--;
		System.out.println("" + a + "," + b + "," + c);
	}
}
