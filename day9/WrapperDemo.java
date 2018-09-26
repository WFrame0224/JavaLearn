class WrapperDemo 
{
	public static void main(String[] args) 
	{
		// 此处演示利用包装类实现字符串和基本类型的相互转换

		// 字符串转为基本类型
		String intStr = "123";
		int it1 = Integer.parseInt(intStr); // 方式一，采用包装类提供的静态方法 parseXxx(String s)
		int it2 = new Integer(intStr);		// 方式二，采用包装类提供的构造器Xxx(String s)

		System.out.println(it1);
		System.out.println(it2);

		String floatStr = "3.1415";
		float ft1 = Float.parseFloat(floatStr);
		System.out.println(ft1);

		// 基本类型转为字符串类型
		String ftStr = String.valueOf(3.14f);	// 将基本类型转为字符串，采用String.valueOf()方法
		System.out.println(ftStr);
		String boolStr = String.valueOf(true);
		System.out.println(boolStr);
		System.out.println(boolStr.toUpperCase());


	}
}
