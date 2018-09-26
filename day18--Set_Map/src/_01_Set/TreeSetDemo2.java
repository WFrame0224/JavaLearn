package _01_Set;
/**
 * TreeSet���������
 * 		@__@��Ȼ����:TreeSetǿ�����ϵ�CompareTo�������Ƚ�Ԫ�صĴ�С��ϵ��Ȼ�󽫼���Ԫ�ذ����������У���С����
 * 			Ҫ��TreeSet������Ԫ�ص�ʵ��java.util.Comparable�ӿ�,����public int compareTo(Object o)�������ڸ÷����б�д�ȽϹ���
 * 		�ڸ÷����У��Ƚϵ�ǰ����(this)�Ͳ�������o���Ƚ�(�ϸ�����˵�ǱȽ϶�������ݣ����簴�ն������������)
 * 				this > o ������������1��
 * 				this > o : ���ظ�����-1��
 * 				this == o: ��ʱ��Ϊ����������ͬһ������
 * 		@__@����������TreeSet�������д���java.lang.Comparator���󣬲�����public int compare(Object o1,Object o2)�ٱ�д�ȽϹ���
 *                     ****   *****                **********
 *      --------------------------------------------
 *      ����TreeSet������˵��Ҫôʹ����Ȼ����Ҫôʹ�ö�������
 *      �ж����������Ƿ���ȵĹ���
 *      	��Ȼ����compareTo�������� 0��
 *      	��������compare�������� 0��
 */
import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;

class Person implements Comparable<Person> {
	String name;
	int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "person [name=" + name + ", age=" + age + "]";
	}

	//��д�ȽϹ���
	@Override
	public int compareTo(Person other) {
		if (this.age > other.age) {
			return 1;
		} else if (this.age < other.age) {
			return -1;
		} else {
			return 0;
		}
	}
}

public class TreeSetDemo2 {
	public static void main(String[] args) {
		//����Person�������������Ȼ����
		Set<Person> set1 = new TreeSet<>();
		set1.add(new Person("Wialen", 17));
		set1.add(new Person("Fill", 11));
		set1.add(new Person("Wil", 13));
		set1.add(new Person("Nilal", 19));
		System.out.println(set1);
		System.out.println("---------------------------------");
		//����Person��������ֳ���������������
		Set<Person> set2 = new TreeSet<>(new NameLengthComparator());
		set2.add(new Person("Wialen", 17));
		set2.add(new Person("Fill", 11));
		set2.add(new Person("Wil", 13));
		set2.add(new Person("Nilal", 19));
		System.out.println(set2);
	}
}
//���ֳ��̱Ƚ���
class NameLengthComparator implements Comparator<Person>{
	//��д�ȽϹ���
	@Override
	public int compare(Person o1, Person o2) {
		if(o1.name.length() > o2.name.length()){
			return 1;
		}else if(o1.name.length() < o2.name.length()){
			return -1;
		}
		return 0;
	}
}
