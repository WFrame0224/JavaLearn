package _01_Set;
/**
 * *******************************************************
	1）**HashSet是Set接口最常用的实现类，顾名思义，底层采用了哈希表（散列）算法
   其底层其实也是个数组，存在的意义是提供查询速度，插入速度也是比较快，但是适用于少量数据的插入操作
   
	2）**在HashSet中如何判断两个对象是否是相同问题：
		1）：两个对象的hashCode方法返回值是否相等
		2）：两个对象的equals比较是否相等，返回true，则说明是相同对象
		
		对象的hashCode值决定了元素在哈希表中的存储位置
		     ********** ***        *****    ******
		-->二者缺一不可
		
		当往HashSet集合中添加新的对象的时候，先判断该对象和集合对象中的hashCode值
			1）：不等：直接把该新的对象储存到hashCode指定的位置
			2）：相等：再继续判断对象和集合对象中的equals做比较
				1>hashCode相同，equals为true，则视为是同一个对象，则不保存在哈希表中
				2>hashCode相同，equals为false，非常麻烦，存储在之前对象同槽位的链表上(拒绝，操作比较麻烦)
		》》对象的hashCode和equals方法的重要性：
			每一个存储到hash表中的对象，都得提供hashCode和equals方法，用来判断是否是同一个对象		
		------------------------------------------------
		存储在哈希表中的对象，都应该覆盖equals方法和hashCode方法，并且保证equals相等的时候，hashCode也相等
	
	3）不同的数据类型如何计算hashCode值：
		Eclipse可以自动生成hashCode和equals方法					
   		--如果需要把我们自定义的对象储存到哈希表中，该类型的对象应该覆盖equals和hashCode方法，并在该方法中提供自己的
   		判断规则。（可以使用Eclipse工具自动生成hashCode和equals方法）
	
 */
import java.util.HashSet;
import java.util.Set;

class A {
	@Override
	public boolean equals(Object obj) {
		return true;
	}
}

class B {
	@Override
	public int hashCode() {
		return 1;
	}
}

class C {
	@Override
	public boolean equals(Object obj) {
		return true;
	}
	@Override
	public int hashCode() {
		return 2;
	}
}

public class HashSetDemo2 {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add(new A());
		set.add(new A());
		set.add(new B());
		set.add(new B());
		set.add(new C());
		set.add(new C());//证明需要判断两个元素是否相等，同时需要两个方法equals和hashCode方法
		System.out.println(set.size());
		System.out.println(set);
	}
}
