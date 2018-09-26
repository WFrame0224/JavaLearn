package come.randclass;

import java.util.Random;

/**随机数：随机地生成的任意的一个数（理论上讲具有不可预知性）
 * Random类：用于产生一个伪随机数,通过相同的种子，其产生的种子是相同的
 * 				public Random():使用默认的种子（以当前系统时间为种子）
 *				public Random(long seed):根据指定的种子
 */
public class RandDemo {
	public static void main(String[] args) {
		Random r1 = new Random(10);//根据指定的种子
		System.out.println(r1.nextBoolean());
		System.out.println(r1.nextInt());
		System.out.println(r1.nextFloat());
		System.out.println(r1.nextDouble());
		System.out.println(r1.nextGaussian());
		System.out.println("--------------------------------");
		Random r2 = new Random();//使用默认的种子
		System.out.println(r2.nextBoolean());
		System.out.println(r2.nextInt());
		System.out.println(r2.nextFloat());
		System.out.println(r2.nextDouble());
		System.out.println(r2.nextGaussian());
		
		//需求：生成34到179之间的随机数  
		//int nextInt(int n) ：返回一个伪随机数，它是取自此随机数生成器序列的、在 0（包括）和指定值（不包括）之间均匀分布的 int 值。
		 int num = new Random().nextInt(145) + 34;
		 System.out.println(num);
		
	}
}
