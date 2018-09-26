package day16._01_array;

import java.util.Arrays;

//���������˶�Ա�ϳ�
public class BasketballPlayerDemo {

	//���Գ���
	public static void main(String[] args) {
		PlayerList.print();
		//1������ʼ������Ϊ5�������б�
		PlayerList.init(1);
		PlayerList.print();
		//2��������5����Ա�ϳ�[11,22,33,44,55]
		PlayerList.add(11);
		PlayerList.add(22);
		PlayerList.add(33);
		PlayerList.add(44);
		PlayerList.add(55);
		PlayerList.add(66);
		PlayerList.print();
		//3������ѯָ��λ�õ���Ա�����µĺ����Ƕ��٣���ѯ����λ��Ϊ2�����º����ǣ�33
		Integer num = PlayerList.get(2);
		System.out.println(num);
		//4�����������º����ѯ����Ա�ڳ��ϵ�����λ�ã�44���ºŵ���Ա�ڳ��ϵ�����λ���ǣ�3
		int index = PlayerList.getIndex(44);
		System.out.println(index);
		//5�����滻��������λ��Ϊ2����Ա���滻֮���λ�õ����±��Ϊ333��333��33�滻��
		PlayerList.replacePlayer(2, 333);
		num = PlayerList.get(2);
		System.out.println(num);
		//6�����滻���º���Ϊ22����Ա���滻֮��Ϊ222.
		PlayerList.replacePlayerNumber(22, 222);
		PlayerList.print();
		//7�����ѳ�������λ��Ϊ2����Ա���³���ע�⣺���£�û�в�λ��
		PlayerList.deletePlayer(2);
		PlayerList.print();
	}

}
