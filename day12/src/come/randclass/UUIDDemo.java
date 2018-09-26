package come.randclass;

import java.util.UUID;

/**
 * UUID：通用唯一识别：Universally unique Identifier；在一台机械上生成的数字，它保证对同一时空中的所有的机器都是唯一的
 * UUID：是一个128位长的数字，一般用16进制表示。算法的核心思想是结合机器的网卡、当地时间、一个随机数来生成UUID
 * 我们一般用来表示：随机的唯一的字符串
 */
public class UUIDDemo {
	public static void main(String[] args) {
		String uuid = UUID.randomUUID().toString();
		System.out.println(uuid);//2bfa9267-44a1-42f5-93b6-a3b09692b646
	}
}
