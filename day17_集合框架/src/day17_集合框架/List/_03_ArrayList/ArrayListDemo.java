package day17_集合框架.List._03_ArrayList;
/**ArrayList类是java集合框架出现之后用来取代Vector类的
 * 二者底层原理都是基于数组的算法，一模一样
 * -----------------------------------------
 * 	Vector：所有的方法都使用了synchronized修饰符  ，             线程安全，但是较ArrayList性能较低，适用于多线程环境
 * 	ArrayList:所有的方法都没有使用synchronized修饰符，      线程不安全，但是较Vector性能较高，不适用于多线程环境
 * 
 * ****即使以后在多线程环境下，我们也不使用Vector类：****
 * 	ArrayList list = Collections.synchronizedList(new ArrayList(...)); 
 * --------------------------------------------------------------------
 * 常用方法参照Vector类,但是自java7开始之后，从设计上考虑，重新修改了代码
 * 
 * 	有时候，某个方法需要返回一个ArrayList对象：
 * 	但是在该方法中，如果一个都没有查询到，我们不会返回null，我们会返回一个空集对象（没有元素的集合）
 * 	public ArrayList getAll()
 * 	{
 * 		//TODO
 * 		//return Collection.emptyList();//最好的方式
 * 		return new ArrayList();//但是很多人最直观，最简单选用的方式
 * 	}
 * 	在java7之前，即使使用new ArrayList创建对象，一个元素都不存储，但是在堆空间依然初始化了长度为10的Object数组，没必要
 * 	从Java7开始，优化了这个设计，new ArrayList，其实底层创建的使用一个空数组
 * 		Object[] elementData = new Object[]{};
 * 		在第一次调用add方法的时候，才会重新初始化数组
 *
 */
public class ArrayListDemo {

}
