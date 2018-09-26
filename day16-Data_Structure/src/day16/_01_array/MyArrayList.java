package day16._01_array;

import java.util.Arrays;

/**
 * 基于数组的列表（集合）
 */
public class MyArrayList {
	//存储任意类型的元素
	private Object[] elements = null;
	//数组中存储的元素个数
	private int size = 0;
	private final int DEFAULT_INITIAL_CAPACITY = 10;
	//1）：初始容量为5的线性列表，准备用来存储场上5个球衣号码
	public MyArrayList() {
		this(10);
	}

	public MyArrayList(int initialCapacity) {
		if (initialCapacity < 0) {
			throw new NegativeArraySizeException("容量不能为负数！！");
		}
		elements = new Object[initialCapacity];
	}

	//2）：保存新的元素
	public void add(Object ele) {
		//判断和扩容
		if (size == elements.length) {
			elements = Arrays.copyOf(elements, elements.length * 2);
		}
		elements[size] = ele;
		size++;
	}

	//3）：查询指定索引位置的元素
	public Object get(int index) {
		if (index < 0 || index > size - 1) {
			throw new ArrayIndexOutOfBoundsException("索引超出数组范围！！");
		}
		return elements[index];
	}

	//4）：根据球衣号码查询该球员在场上的索引位置，44球衣号的球员在场上的索引位置是：3
	public int getIndex(Object ele) {
		for (int i = 0; i < size; i++) {
			if (elements[i].equals(ele)) {
				return i;
			}
		}
		return -1;
	}

	//5）：替换指定索引位置的元素值
	public void replaceEle(int index, Object replaceEle) {
		if (index < 0 || index > size - 1) {
			throw new ArrayIndexOutOfBoundsException("索引超出数组范围！！");
		}
		elements[index] = replaceEle;
	}

	//6）：替换球衣号码为22的球员，替换之后为222.
	public void replaceEle(Object ele, Object replaceEle) {
		replaceEle(getIndex(ele), replaceEle);
	}
 
	//7）：删除指定位置的元素
	public void deleteEle(int index) {
		if (index < 0 || index > size - 1) {
			throw new ArrayIndexOutOfBoundsException("索引超出数组范围！！");
		}
		for (int i = index; i < size - 1; i++) {
			elements[i] = elements[i + 1];
		}
		elements[size - 1] = null;
		size = size - 1;
	}

	//8）：toString 方法
	public String toString() {
		if (elements == null) {
			return null;
		} else if (size == 0) {
			return "[]";
		} else {
			StringBuilder sb = new StringBuilder(size * 2 + 1);

			sb.append("[");
			for (int i = 0; i < size; i++) {
				if (i == size - 1) {
					sb.append(elements[i] + "]");
				} else {
					sb.append(elements[i] + ",");
				}
			}
			return sb.toString();

		}
	}
	//9）：返回数组列表的个数
	public int size(){
		return size;
	}
	//10）：返回一个列表是否为空的检测
	public boolean isEmpty(){
		if(size != 0){
			return false;
		}else{
			return true;
		}
	}
	//11）：清除集合中的元素
	public void clear(){
		for(int i = 0;i < size;i ++ ){
			elements[i] = null;
		}
		elements = new Object[DEFAULT_INITIAL_CAPACITY];
		size = 0;
	}
}
