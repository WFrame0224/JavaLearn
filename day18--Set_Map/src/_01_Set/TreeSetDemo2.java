package _01_Set;
/**
 * TreeSet的排序规则：
 * 		@__@自然排序:TreeSet强调集合的CompareTo方法来比较元素的大小关系，然后将集合元素按照升序排列（从小到大）
 * 			要求TreeSet集合中元素得实现java.util.Comparable接口,覆盖public int compareTo(Object o)方法，在该方法中编写比较规则
 * 		在该方法中，比较当前对象(this)和参数对象o做比较(严格上来说是比较对象的数据，比如按照对象的年龄排序)
 * 				this > o ：返回正整数1；
 * 				this > o : 返回负整数-1；
 * 				this == o: 此时认为两个对象是同一个对象
 * 		@__@定制排序：在TreeSet构造器中传递java.lang.Comparator对象，并覆盖public int compare(Object o1,Object o2)再编写比较规则
 *                     ****   *****                **********
 *      --------------------------------------------
 *      对于TreeSet集合来说，要么使用自然排序，要么使用定制排序
 *      判断两个对象是否相等的规则：
 *      	自然排序：compareTo方法返回 0；
 *      	定制排序：compare方法返回 0；
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

	//编写比较规则
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
		//按照Person对象的年龄做自然排序
		Set<Person> set1 = new TreeSet<>();
		set1.add(new Person("Wialen", 17));
		set1.add(new Person("Fill", 11));
		set1.add(new Person("Wil", 13));
		set1.add(new Person("Nilal", 19));
		System.out.println(set1);
		System.out.println("---------------------------------");
		//按照Person对象的名字长短来做定制排序
		Set<Person> set2 = new TreeSet<>(new NameLengthComparator());
		set2.add(new Person("Wialen", 17));
		set2.add(new Person("Fill", 11));
		set2.add(new Person("Wil", 13));
		set2.add(new Person("Nilal", 19));
		System.out.println(set2);
	}
}
//名字长短比较器
class NameLengthComparator implements Comparator<Person>{
	//编写比较规则
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
