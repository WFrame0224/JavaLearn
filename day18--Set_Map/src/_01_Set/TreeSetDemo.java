package _01_Set;
/**TreeSet集合
 * 底层采用红黑树算法，会对存储的元素默认使用自然排序（从小到大）
 * 	必须保证TreeSet集合中的元素对象是相同的数据类型，否则报错

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
