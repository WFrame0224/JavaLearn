package com.handle;
/**使用try-catch捕获多个异常
 * try{
 * 		编写异常可能会出现的代码
 * }catch(异常类型A e){ 当try中出现A类型异常，就用catch来捕获
 * 		处理异常的代码		
 * 		//记录日志、打印异常信息，继续抛出异常等操作
 * }catch(异常类型B e){ 当try中出现B类型异常，就用catch来捕获
 * 		处理异常的代码		
 * 		//记录日志、打印异常信息，继续抛出异常等操作
 * }..
 * 注意：
 * 		1）：一个catch语句，只能捕获一种类型的异常，如果需要捕获多种异常，就得使用多个catch语句
 * 		2）：代码在一瞬间只能出现一种类型的异常，只需要一个catch捕获，不可能同时出现多个异常
 *
 */
public class MutiCatchDemo {

	public static void main(String[] args) {
		System.out.println("Beging........");
		String sNum1 = "10";//用户输入的被除数
		String sNum2 = "0";//用户输入的除数
		try{
			//把String转换为int类型
			int num1 = Integer.parseInt(sNum1);
			int num2 = Integer.parseInt(sNum2);
			System.out.println("---------------");
			//两个整数相除
			int ret = num1 / num2;
			System.out.println("结果 = " + ret);
		}catch(ArithmeticException e){
			System.out.println("除数为0");
			e.printStackTrace();
		}catch(NumberFormatException e){
			System.out.println("类型转换有问题");
			e.printStackTrace();
		}catch(Exception e){//都不属于上述两种异常则执行下面的，而且放在最后面的catch
			e.printStackTrace();
		}
		System.out.println("ending........");
	}

}
