class BitOperatorDemo 
{
	public static void main(String[] args) 
	{
		System.out.println(-2 >>> 2);

		System.out.println(-2 >> 2 );
		System.out.println(-2 << 2);

		System.out.println(7 >> 2);
		System.out.println(-5 >> 2);

		// ����int���͵�������λ a>>b,��b>32ʱ��ϵͳ����b��32���࣬�õ��Ľ��������������λ��
		System.out.println((5 >> 33) == (5 >> 1)); 
		// ����long���͵�������λ a>>b,��b>64ʱ��ϵͳ����b��64���࣬�õ��Ľ��������������λ��
		System.out.println((5L >> 65) == (5L >> (65 % 64)));

		int a = 5;
		int b = 4;
		int c = a++ - --b*++a/b-->>2%a--;
		System.out.println("" + a + "," + b + "," + c);
	}
}
