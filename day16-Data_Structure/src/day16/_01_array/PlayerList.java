package day16._01_array;

import java.util.Arrays;

public class PlayerList {
	//存储场上球员的球衣号码
	private static Integer[] players = null;
	//场上球员的个数
	private static int size = 0;

	//1）：初始容量为5的线性列表，准备用来存储场上5个球衣号码
	public static void init(int initialCapacity) {
		if (initialCapacity < 0) {
			throw new NegativeArraySizeException("容量不能为负数！！");
		}
		players = new Integer[initialCapacity];
	}

	//2）：安排5个球员上场[11,22,33,44,55].
	public static void add(Integer playerNumber) {
		//判断和扩容
		if (size == players.length) {
			players = Arrays.copyOf(players, players.length * 2);
		}
		players[size] = playerNumber;
		size++;
	}

	//3）：查询指定位置的球员的球衣的号码是多少，查询索引位置为2的球衣号码是：33
	public static Integer get(int index) {
		if (index < 0 || index > size - 1) {
			throw new ArrayIndexOutOfBoundsException("索引超出数组范围！！");
		}
		return players[index];
	}

	//4）：根据球衣号码查询该球员在场上的索引位置，44球衣号的球员在场上的索引位置是：3
	public static int getIndex(Integer playerNumber) {
		for (int i = 0; i < size; i++) {
			if (players[i].equals(playerNumber)) {
				return i;
			}
		}
		return -1;
	}

	//5）：替换场上索引位置为2的球员，替换之后该位置的球衣编号为333，333把33替换了
	public static void replacePlayer(int index, Integer replacePlayerNumber) {
		if (index < 0 || index > size - 1) {
			throw new ArrayIndexOutOfBoundsException("索引超出数组范围！！");
		}
		players[index] = replacePlayerNumber;
	}

	//6）：替换球衣号码为22的球员，替换之后为222.
	public static void replacePlayerNumber(Integer playerNumber, Integer replacePlayerNumber) {
		replacePlayer(getIndex(playerNumber), replacePlayerNumber);
	}

	//7）：把场上索引位置为2的球员罚下场（注意：罚下，没有补位）
	public static void deletePlayer(int index) {
		if (index < 0 || index > size - 1) {
			throw new ArrayIndexOutOfBoundsException("索引超出数组范围！！");
		}
		for (int i = index; i < size - 1; i++) {
			players[i] = players[i + 1];
		}
		players[size - 1] = null;
		size = size - 1;
	}

	//8）：按照球员在场上的位置，打印出球衣号码，打印风格：[11,22,33,44,55]
	public static void print() {
		if (players == null) {
			System.out.println("players is null");
		} else if (size == 0) {
			System.out.println("[]");
		} else {
			StringBuilder sb = new StringBuilder(size * 2 + 1);

			System.out.print("[");
			for (int i = 0; i < size; i++) {
				if (i == size - 1) {
					sb.append(players[i] + "]");
				} else {
					sb.append(players[i] + ",");
				}
			}
			System.out.println(sb.toString());

		}
	}
}
