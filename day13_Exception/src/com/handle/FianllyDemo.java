package com.handle;
/**finally语句块表示最终都会执行的代码，无论有没有异常
 * 当我们在try语句中打开了一些物力资源（磁盘文件/网络连接/数据库连接等）我们都在使用完之后，最终关闭打开的资源。
 * 当只有try或者catch中调用退出JVM的相关方法，此时finally才不会执行，例如system.exit(0);
 * 		否则finally会永远执行 
 *------------------------------------------------------------------------------------------------
 * 两种语法：
 * 1）：try...finally：此时没有catch来捕获异常，因为此时根据应用场景，我们会抛出异常，自己不处理
 * 2）：try...catch...finally：自身需要处理异常，最终还得关闭资源
 * 注：1：finally不能单独使用
 * 	   2：如果finally有return语句，永远返回finally中的结果，避免该情况
 *
 */
public class FianllyDemo {

	public static void main(String[] args) {
		try{
			int ret = 10 / 0;
			System.out.println("结果= " + ret);
		}catch(ArithmeticException e){
			System.out.println("除数为0，请检查！！！");
			//throw e;
			System.exit(0);//退出JVM虚拟机，finally语句不执行
		}finally{
			System.out.println("关闭资源");//无论有没有异常，该语句都会执行，真正确保资源关闭
		}
		System.out.println("ending.......");

	}

}
