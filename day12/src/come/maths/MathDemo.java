package come.maths;
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
//演示Math类中的常量和静态方法
public class MathDemo {
	public static void main(String[] args) {
		System.out.println(Math.max(10, 99));
		//public static double random() 返回带正号的 double 值，该值大于等于 0.0 且小于 1.0-->[0,1)
		double rand = Math.random()*100;
		System.out.println((int)rand);
	}
}
