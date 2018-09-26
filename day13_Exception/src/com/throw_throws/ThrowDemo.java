package com.throw_throws;
/**抛出异常
 * throw:
 * 		运用于方法内部，抛出一个具体的异常对象,和return一样会结束当前方法。
 * 		throw new 异常类(“异常信息”); 终止方法
 * 		一般的，当一个方法不出现正常情况的时候，我们不知道该方法该返回什么，此时就返回一个错误，在catch语句中继续向上抛出异常
 * 		   **  return 是返回一个值，throw 是返回一个错误，返回给该方法的调用者  **
 * throws: 运用于方法声明之上，用于表示当前方法不处理异常，而是提醒该方法的调用者来处理异常(抛出异常)。
 * ---------------------------------------------------------------------------------------
 * 
 *
 */
public class ThrowDemo {
	public static void main(String[] args) {
		//System.out.println("ABCDEF".charAt(-1));
		
		System.out.println("begin.......");
		try{
			int ret = divide(10 , 0);
			System.out.println(ret);
		}catch(ArithmeticException e){ 
			System.out.println(e.getMessage());
		}	
		System.out.println("ending.......");		
	}
	private static int divide(int num1,int num2){
		if(num2 == 0){
			throw new ArithmeticException("除数不能为0");
		}
		int ret = num1 / num2;	
		return ret;
	}
}
