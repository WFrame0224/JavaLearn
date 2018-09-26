package come.charsequences;

/**面试题分析
 * 下列代码分别创建了几个String对象：
 * 		String str1 = "ABCD";-->最多创建一个String对象，最少不创建String对象，如果 常量池 中已经存在“ABCD”,那么str1直接引用
 * 							此时不创建String对象，否则先在常量池中创建“ABCD”，再引用
 * 		String str2 = new String("ABCD");-->最多创建两个String对象，至少创建一个String对象new关键字绝对会在堆空间创建内存区域
 * 									所以至少创建一个String对象
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
		
		System.out.println(str1 == str2);//true  编译器优化的结果
		System.out.println(str1 == str3);//true	 编译器优化的结果
		System.out.println(str1 == str4);//flase
		System.out.println(str1 == str5);//flase  变量在编译时期不知道其值，运行时才知道值具体为多少，所以没有编译器优化
		System.out.println(str1 == str6);//flase  方法在编译时期只是检查语法是否正确，只有在运行时才会执行 
		/**String对象比较
		 * 1）：单独使用""引号创建的字符串都是直接量，编译期就已经确定存储到常量池中；
		 * 2）：使用new String("")创建的对象会存储到堆内存中，是运行期才创建
		 * 3）：使用只包含直接量的字符串连接符如"aa" + "bb"创建也是直接量，编译时期就能确定存储在常量池中（str2和str3）
		 * 4）：使用包含String直接量（无final修饰符）的字符串表达式（如"aa" + str）创建对象是运行期才创建的，存储在堆中-->
		 * 						通过变量/调用 方法去连接字符串，都只能在运行时期才能确定变量的值和方法的返回值，不存在编译优化操作
		 */
	}

}
