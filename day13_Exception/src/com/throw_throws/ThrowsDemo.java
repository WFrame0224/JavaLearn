package com.throw_throws;
/**
 * throws: 运用于方法声明之上，用于表示当前方法不处理异常，而是提醒该方法的调用者来处理异常(抛出异常)。
 * 语法：修饰符 方法名([参数列表]) throws Exception{}
 * 		表示：在本方法中不处理某种类型的异常,提醒调用者需要处理该异常 
 *			注意：如果每个方法都放弃处理异常，都直接通过throws声明抛出，最后异常会抛出到main方法，如果此时main方法不处理，
 *					继续抛给JVM，底层的处理机制就是打印异常的跟踪栈信息。runtime异常默认就是这种处理方式
 */
public class ThrowsDemo {

	public static void main(String[] args) {
		try {
			divide(10,0);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//表示：在本方法中不处理某种类型的异常,提醒调用者需要处理该异常 
	private static int divide(int num1,int num2) throws Exception{
		if(num2 == 0){
			throw new Exception("除数不能为0");
		}
		int ret = num1 / num2;	
		return ret;
	}
}
