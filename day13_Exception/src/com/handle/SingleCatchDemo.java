package com.handle;
/**try-catch捕获单个异常语法如下
 * try{
 * 		//编写可能会出现异常的代码
 * }catch(异常类型 e){
 * 		处理异常的代码		
 * 		//记录日志、打印异常信息，继续抛出异常等操作
 * }
 * 如何获取异常信息，Throwable类的方法
 * 1）：String getMessage():获取异常的描述信息，原因(提示给用户的时候，就提示错误原因)
 * 2）：String toString():获取异常的类型和异常的描述信息,一般不用
 * 3）：void printStackTrace():打印异常的跟踪信息并输出到控制台，包含了异常的类型，异常的原因，还包括异常出现的位置，在开发和调试阶段都得使用
 * 记住：现在在catch语句块中，必须写：e.printStackTrace();目的：查看异常的具体信息，方便调试和修改
 */
//使用try-catch捕获单个异常
public class SingleCatchDemo {

	public static void main(String[] args) {
		System.out.println("begin.......");
		try{
			int ret = 10 / 0;
			System.out.println("结果= " + ret);
		}catch(ArithmeticException e){
/*			System.out.println("异常消息：" + e.getMessage());
			System.out.println("异常消息：" + e.toString());*/
			System.out.println("-------------------------");
			e.printStackTrace();//一般都使用这个
			System.out.println("除数为0，请检查！！！");
		}
		System.out.println("ending.......");
		
	}

}
