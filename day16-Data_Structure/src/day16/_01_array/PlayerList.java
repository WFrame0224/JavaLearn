package day16._01_array;

import java.util.Arrays;

public class PlayerList {
	//�洢������Ա�����º���
	private static Integer[] players = null;
	//������Ա�ĸ���
	private static int size = 0;

	//1������ʼ����Ϊ5�������б�׼�������洢����5�����º���
	public static void init(int initialCapacity) {
		if (initialCapacity < 0) {
			throw new NegativeArraySizeException("��������Ϊ��������");
		}
		players = new Integer[initialCapacity];
	}

	//2��������5����Ա�ϳ�[11,22,33,44,55].
	public static void add(Integer playerNumber) {
		//�жϺ�����
		if (size == players.length) {
			players = Arrays.copyOf(players, players.length * 2);
		}
		players[size] = playerNumber;
		size++;
	}

	//3������ѯָ��λ�õ���Ա�����µĺ����Ƕ��٣���ѯ����λ��Ϊ2�����º����ǣ�33
	public static Integer get(int index) {
		if (index < 0 || index > size - 1) {
			throw new ArrayIndexOutOfBoundsException("�����������鷶Χ����");
		}
		return players[index];
	}

	//4�����������º����ѯ����Ա�ڳ��ϵ�����λ�ã�44���ºŵ���Ա�ڳ��ϵ�����λ���ǣ�3
	public static int getIndex(Integer playerNumber) {
		for (int i = 0; i < size; i++) {
			if (players[i].equals(playerNumber)) {
				return i;
			}
		}
		return -1;
	}

	//5�����滻��������λ��Ϊ2����Ա���滻֮���λ�õ����±��Ϊ333��333��33�滻��
	public static void replacePlayer(int index, Integer replacePlayerNumber) {
		if (index < 0 || index > size - 1) {
			throw new ArrayIndexOutOfBoundsException("�����������鷶Χ����");
		}
		players[index] = replacePlayerNumber;
	}

	//6�����滻���º���Ϊ22����Ա���滻֮��Ϊ222.
	public static void replacePlayerNumber(Integer playerNumber, Integer replacePlayerNumber) {
		replacePlayer(getIndex(playerNumber), replacePlayerNumber);
	}

	//7�����ѳ�������λ��Ϊ2����Ա���³���ע�⣺���£�û�в�λ��
	public static void deletePlayer(int index) {
		if (index < 0 || index > size - 1) {
			throw new ArrayIndexOutOfBoundsException("�����������鷶Χ����");
		}
		for (int i = index; i < size - 1; i++) {
			players[i] = players[i + 1];
		}
		players[size - 1] = null;
		size = size - 1;
	}

	//8����������Ա�ڳ��ϵ�λ�ã���ӡ�����º��룬��ӡ���[11,22,33,44,55]
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
