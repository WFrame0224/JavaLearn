package come.randclass;

import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

//生成随机验证码
public class RandomCodeDemo {
	public static void main(String[] args) {
		//需求：生成一个五位数的随机数
		//方案一：利用UUID，截取前五位，不足之处只有小数和数字
		String randcode1 = UUID.randomUUID().toString().substring(0, 5);
		System.out.println("-----UUID方案------\n"+randcode1);//c7142
		
		//方案二：
		String str = "ABCDEFGHIJKLMOPQRSTUVWXYZ";
		str += str.toLowerCase();
		str += "0123456789";        //完成完整的随机数编码库26个大小写字母+0~9的数字
		//System.out.println(str);  //测试拼接效果
		
		ThreadLocalRandom random = ThreadLocalRandom.current();//得到一个随机数
		int intcode = 0;
		//String randcode2 = "";
		StringBuilder randcode2 = new StringBuilder(5); //创建一个存储生成5位随机验证码的对象
		for (int i = 0; i < 5; i++) {
			intcode = random.nextInt(0, str.length());   //得到从[0，str.length() )之间的随机数
			//randcode2 += str.charAt(intcode);           //得到指定随机数位置的字符
			randcode2.append(str.charAt(intcode));           //得到指定随机数位置的字符
			//System.out.print(str.charAt(intcode));		
		}
		System.out.println("\n-----方案二------\n"+randcode2.toString());//0yJ1l

	}
}
