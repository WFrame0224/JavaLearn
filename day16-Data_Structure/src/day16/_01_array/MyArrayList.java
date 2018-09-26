package day16._01_array;

import java.util.Arrays;

/**
 * ����������б����ϣ�
 */
public class MyArrayList {
	//�洢�������͵�Ԫ��
	private Object[] elements = null;
	//�����д洢��Ԫ�ظ���
	private int size = 0;
	private final int DEFAULT_INITIAL_CAPACITY = 10;
	//1������ʼ����Ϊ5�������б�׼�������洢����5�����º���
	public MyArrayList() {
		this(10);
	}

	public MyArrayList(int initialCapacity) {
		if (initialCapacity < 0) {
			throw new NegativeArraySizeException("��������Ϊ��������");
		}
		elements = new Object[initialCapacity];
	}

	//2���������µ�Ԫ��
	public void add(Object ele) {
		//�жϺ�����
		if (size == elements.length) {
			elements = Arrays.copyOf(elements, elements.length * 2);
		}
		elements[size] = ele;
		size++;
	}

	//3������ѯָ������λ�õ�Ԫ��
	public Object get(int index) {
		if (index < 0 || index > size - 1) {
			throw new ArrayIndexOutOfBoundsException("�����������鷶Χ����");
		}
		return elements[index];
	}

	//4�����������º����ѯ����Ա�ڳ��ϵ�����λ�ã�44���ºŵ���Ա�ڳ��ϵ�����λ���ǣ�3
	public int getIndex(Object ele) {
		for (int i = 0; i < size; i++) {
			if (elements[i].equals(ele)) {
				return i;
			}
		}
		return -1;
	}

	//5�����滻ָ������λ�õ�Ԫ��ֵ
	public void replaceEle(int index, Object replaceEle) {
		if (index < 0 || index > size - 1) {
			throw new ArrayIndexOutOfBoundsException("�����������鷶Χ����");
		}
		elements[index] = replaceEle;
	}

	//6�����滻���º���Ϊ22����Ա���滻֮��Ϊ222.
	public void replaceEle(Object ele, Object replaceEle) {
		replaceEle(getIndex(ele), replaceEle);
	}
 
	//7����ɾ��ָ��λ�õ�Ԫ��
	public void deleteEle(int index) {
		if (index < 0 || index > size - 1) {
			throw new ArrayIndexOutOfBoundsException("�����������鷶Χ����");
		}
		for (int i = index; i < size - 1; i++) {
			elements[i] = elements[i + 1];
		}
		elements[size - 1] = null;
		size = size - 1;
	}

	//8����toString ����
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
	//9�������������б�ĸ���
	public int size(){
		return size;
	}
	//10��������һ���б��Ƿ�Ϊ�յļ��
	public boolean isEmpty(){
		if(size != 0){
			return false;
		}else{
			return true;
		}
	}
	//11������������е�Ԫ��
	public void clear(){
		for(int i = 0;i < size;i ++ ){
			elements[i] = null;
		}
		elements = new Object[DEFAULT_INITIAL_CAPACITY];
		size = 0;
	}
}
