package come.maths;

import java.math.BigDecimal;

/**
 * 和数学相关的三个类：
 * Math:		包含用于执行基本数学运算的方法，如初等指数、对数、平方根和三角函数,都是静态方法。
 * BigDecimal:	提供以下操作：算术、标度操作、舍入、比较、哈希算法和格式转换,folat和double都不能表示精确的小数，使用该类可以处理金钱和精度要求高的数据
 * 			  增：BigDecimal add(BigDecimal other)          减：BigDecimal subtract(BigDecimal other)
 * 			  乘：BigDecimal multiply(BigDecimal other)	     除：BigDecimal divide(BigDecimal other)
 * BigInteger:	提供所有 Java 的基本整数操作符的对应物，并提供 java.lang.Math 的所有相关方法, 还提供以下运算：模算术、GCD 计算、质数测试、素数生成、位操作以及一些其他操作
 * 				表示大整型，如果两个long类型的最大值相运算，结果long再也存不下，此时使用BigInteger，它的加减乘除方法和BigDecimal一样
 * 			  增：BigDecimal add(BigDecimal other)          减：BigDecimal subtract(BigDecimal other)
 * 			  乘：BigDecimal multiply(BigDecimal other)	     除：BigDecimal divide(BigDecimal other)			
 */
public class BigDecimalDemo {

	public static void main(String[] args) {
		//使用double
		System.out.println("0.09 + 0.01 = " + (0.09 + 0.01));//0.09 + 0.01 = 0.09999999999999999
		System.out.println("1.0 - 0.33 = " + (1.0 - 0.33));//1.0 - 0.33 = 0.6699999999999999
		System.out.println("4.015 * 1000 = " + (4.015 * 1000));//4.015 * 1000 = 4014.9999999999995
		System.out.println("12.3 / 100 = " + (12.3 / 100));//12.3 / 100 = 0.12300000000000001
	
		//使用BigDecimal
		//BigDecimal(double val) 将 double 转换为 BigDecimal，后者是 double 的二进制浮点值准确的十进制表示形式
		/*
		 * 注意，构造器方法中，String类型的传递是可控且准确的，而直接值传递本身便不精确了
		 */
		BigDecimal num1 = new BigDecimal("0.09"); 
		BigDecimal num2 = new BigDecimal("0.01"); 
		BigDecimal num3 = new BigDecimal("1.0"); 
		BigDecimal num4 = new BigDecimal("0.33"); 
		BigDecimal num5 = new BigDecimal("4.015");
		BigDecimal num6 = new BigDecimal("1000");
		BigDecimal num7 = new BigDecimal("12.3");
		BigDecimal num8 = new BigDecimal("100");
		
		System.out.println("0.09 + 0.01 = " + (num1.add(num2)));//0.09 + 0.01 = 0.10
		System.out.println("1.0 - 0.33 = " + (num3.subtract(num4)));//1.0 - 0.33 = 0.67
		System.out.println("4.015 * 1000 = " + (num5.multiply(num6)));//4.015 * 1000 = 4015.000
		System.out.println("12.3 / 100 = " + (num7.divide(num8)));//12.3 / 100 = 0.123
		
	}

}
