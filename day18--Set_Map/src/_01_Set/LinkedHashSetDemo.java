package _01_Set;

/**
 * List接口：允许元素重复，记录先后添加顺序
 * Set接口：不允许元素重复，不记录先后添加顺序
 * 需求：不允许元素重复，但是需要保证先后添加顺序
 * 		LinkedHashSet：底层具有哈希表和链表算法
 * 					哈希表算法：来保证唯一性，此时就是HashSet，在哈希表中元素没有先后顺序
 * 					链    表算法：来记录元素的先后添加顺序
 */
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

//使用哈希表和链表算法，保证了HashSet中元素的先后添加顺序
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
