package day17_���Ͽ��.List._01_Vector;

import java.util.Vector;

/**
 * Vector��Ĳ�������--���÷�����
 * 	1��������
 * 			boolean add(Object e) ��ָ��Ԫ����ӵ���������ĩβ
 * 				== addElement(Object e)
 * 			void add(int index,Object element) �ڴ�������ָ��λ�ò���ָ����Ԫ��
 * 			boolean addAll(Collection c) ��c�����е�Ԫ����ӵ���ǰ�ļ��϶�����
 * 	2����ɾ��
 * 			Object remove(int index) ɾ��ָ������λ�õ�Ԫ�أ�������ɾ��֮���Ԫ��
 * 			boolean remove(Object o):ɾ��ָ����Ԫ��
 * 			boolean removeAll(Collection c)���Ӵ˼������Ƴ�������ָ������c�е�����Ԫ��
 * 			boolean retainAll(Collection c) �ڴ˼����н�����������ָ������ c�е�Ԫ��
 * 	3�����޸�
 * 			Object set(int index,Object element):�޸ĵ�ǰ������ָ������λ�õ�Ԫ�أ����ر��滻�ľɵ�Ԫ��
 * 	4������ѯ
 * 			int size() ���ص�ǰ�����д洢��Ԫ�صĸ���
 * 			boolean isEmpty() �жϵ�ǰ������Ԫ�صĸ����Ƿ�Ϊ0
 * 			Object get(int index) ��ѯָ������λ�õ�Ԫ��
 * 			Object[] toArray() �Ѽ��϶���ת��ΪObject����
 *
 */
public class VectorMethodDemo {
	public static void main(String[] args) {
		//testAdd();
		//testRemove();
		testSet();
	}
	//****************�޸Ĳ���****************
	private static void testSet() {
		Vector v1 = new Vector();
		v1.add("1");
		v1.add("2");
		v1.add("3");
		v1.add("4");
		v1.add("5");
		System.out.println("v1-->" + v1);
		System.out.println("------------�޸�ָ��λ�õ�Ԫ��-----------------------");
		Object remove = v1.set(3, "Frame");
		System.out.println("��ɾ����Ԫ���ǣ�" + remove);
		System.out.println("v1-->" + v1);
	}
	//****************ɾ������****************
	private static void testRemove() {
		Vector v1 = new Vector();
		v1.add("1");
		v1.add("2");
		v1.add("3");
		v1.add("4");
		v1.add("5");
		System.out.println("v1-->" + v1);
		System.out.println("------------ɾ������1-----------------------");
		v1.remove(0);
		System.out.println("v1-->" + v1);
		v1.remove("4");
		System.out.println("v1-->" + v1);
		System.out.println("-----------------------------------");
		Vector v2 = new Vector();
		v2.add(1);
		v2.add(2);
		v2.add(3);
		//v2.add(v1);//[1, 2, 3, [A, B, C]]
		v2.addAll(v1);//[1, 2, 3, A, B, C]
		System.out.println("V2-->" + v2);
		System.out.println("------------ɾ������2-----------------------");
		//v2.removeAll(v1);
		v2.retainAll(v1);
		System.out.println("V2-->" + v2);
		
	}
	//****************���Ӳ���****************
	public static void testAdd(){
		Vector v1 = new Vector();
		v1.add("A");
		v1.add("B");
		v1.add("C");
		System.out.println("v1-->" + v1);
/*		v1.add(0, "Frame");
		System.out.println(v1);*/
		Vector v2 = new Vector();
		v2.add(1);
		v2.add(2);
		v2.add(3);
		//v2.add(v1);//[1, 2, 3, [A, B, C]]
		v2.addAll(v1);//[1, 2, 3, A, B, C]
		System.out.println("V2-->" + v2);
	}
}
