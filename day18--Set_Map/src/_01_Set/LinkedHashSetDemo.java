package _01_Set;

/**
 * List�ӿڣ�����Ԫ���ظ�����¼�Ⱥ����˳��
 * Set�ӿڣ�������Ԫ���ظ�������¼�Ⱥ����˳��
 * ���󣺲�����Ԫ���ظ���������Ҫ��֤�Ⱥ����˳��
 * 		LinkedHashSet���ײ���й�ϣ��������㷨
 * 					��ϣ���㷨������֤Ψһ�ԣ���ʱ����HashSet���ڹ�ϣ����Ԫ��û���Ⱥ�˳��
 * 					��    ���㷨������¼Ԫ�ص��Ⱥ����˳��
 */
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

//ʹ�ù�ϣ��������㷨����֤��HashSet��Ԫ�ص��Ⱥ����˳��
public class LinkedHashSetDemo {
	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<>();
		set.add("X");
		set.add("C");
		set.add("B");
		set.add("1");
		set.add("2");
		System.out.println(set);
	}
}
