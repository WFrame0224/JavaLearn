package day17_���Ͽ��.List._01_Vector;

import java.util.Vector;

/**Vector��洢ԭ��
 * 		ͨ��Դ�����������Vector������һ��Object[]��������
 * 		protected Object[] elementData;
 * 	1):�����ϰ����ݴ洢��Vector�����У���ʵ�ײ���Ȼ�ǰ����ݴ洢��Object�����еģ�
 * 	2):���Ƿ��ָ������Ԫ��������Object���ͣ���ζ�� ������ֻ�ܴ洢�������͵Ķ���
 *  3):�������д洢�Ķ��󣬴洢���Ƕ�������ã������Ƕ�����
 * ***************************************************************************

 */

public class VectorDemo {

	public static void main(String[] args) {
		Vector v = new Vector(5);
		v.addElement(123);
		v.addElement(Integer.valueOf(123));
		System.out.println(v);
		
		StringBuilder sb = new StringBuilder("ABC");
		v.addElement(sb);
		System.out.println(v);//[123, 123, ABC]
		sb.append("SeeMyGo");
		System.out.println(v);//[123, 123, ABCSeeMyGo]
		
		
	}

}
