package day16._01_array;

import java.util.Arrays;

//安排篮球运动员上场
public class BasketballPlayerDemo {

	//测试程序
	public static void main(String[] args) {
		PlayerList.print();
		//1）：初始化容量为5的线性列表
		PlayerList.init(1);
		PlayerList.print();
		//2）：安排5个球员上场[11,22,33,44,55]
		PlayerList.add(11);
		PlayerList.add(22);
		PlayerList.add(33);
		PlayerList.add(44);
		PlayerList.add(55);
		PlayerList.add(66);
		PlayerList.print();
		//3）：查询指定位置的球员的球衣的号码是多少，查询索引位置为2的球衣号码是：33
		Integer num = PlayerList.get(2);
		System.out.println(num);
		//4）：根据球衣号码查询该球员在场上的索引位置，44球衣号的球员在场上的索引位置是：3
		int index = PlayerList.getIndex(44);
		System.out.println(index);
		//5）：替换场上索引位置为2的球员，替换之后该位置的球衣编号为333，333把33替换了
		PlayerList.replacePlayer(2, 333);
		num = PlayerList.get(2);
		System.out.println(num);
		//6）：替换球衣号码为22的球员，替换之后为222.
		PlayerList.replacePlayerNumber(22, 222);
		PlayerList.print();
		//7）：把场上索引位置为2的球员罚下场（注意：罚下，没有补位）
		PlayerList.deletePlayer(2);
		PlayerList.print();
	}

}
