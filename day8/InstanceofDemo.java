class InstanceofDemo 
{
	public static void main(String[] args) 
	{
		Object hello = "hello";
		// 注意：Object是所有类、接口的父类，故与所有类和接口存在继承关系，可以强制类型转换
		System.out.println("字符串是否是Object类的实例：" + (hello instanceof Object));
		System.out.println("字符串是否是String类的实例：" + (hello instanceof String));
		System.out.println("字符串是否是Math类的实例：" + (hello instanceof Math));
		System.out.println("字符串是否是Comparable接口的实例：" + (hello instanceof Comparable));

		
		String a = "hello";
		/**
			InstanceofDemo.java:13: 错误: 不兼容的类型: String无法转换为Math
			原因是：String类与Math类没有继承关系，所以下面代码编译无法通过
		*/
		//System.out.println("字符串是否是Math类的实例：" + (a instanceof Math));

	}
}
