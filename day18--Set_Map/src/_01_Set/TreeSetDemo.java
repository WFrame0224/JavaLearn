package _01_Set;
/**TreeSet����
 * �ײ���ú�����㷨����Դ洢��Ԫ��Ĭ��ʹ����Ȼ���򣨴�С����
 * 	���뱣֤TreeSet�����е�Ԫ�ض�������ͬ���������ͣ����򱨴�

 */
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
		set.add("Y");
		set.add("D");
		set.add("A");
		set.add("1");
		set.add("6");
		set.add("c");
		set.add("b");
		System.out.println(set);
		System.out.println(set.first());
		System.out.println(set.last());
		System.out.println(set.headSet("D"));
		System.out.println(set.tailSet("D"));
		System.out.println(set.subSet("6", "Y"));
	}
}
