package come.randclass;

import java.util.Random;

/**���������������ɵ������һ�����������Ͻ����в���Ԥ֪�ԣ�
 * Random�ࣺ���ڲ���һ��α�����,ͨ����ͬ�����ӣ����������������ͬ��
 * 				public Random():ʹ��Ĭ�ϵ����ӣ��Ե�ǰϵͳʱ��Ϊ���ӣ�
 *				public Random(long seed):����ָ��������
 */
public class RandDemo {
	public static void main(String[] args) {
		Random r1 = new Random(10);//����ָ��������
		System.out.println(r1.nextBoolean());
		System.out.println(r1.nextInt());
		System.out.println(r1.nextFloat());
		System.out.println(r1.nextDouble());
		System.out.println(r1.nextGaussian());
		System.out.println("--------------------------------");
		Random r2 = new Random();//ʹ��Ĭ�ϵ�����
		System.out.println(r2.nextBoolean());
		System.out.println(r2.nextInt());
		System.out.println(r2.nextFloat());
		System.out.println(r2.nextDouble());
		System.out.println(r2.nextGaussian());
		
		//��������34��179֮��������  
		//int nextInt(int n) ������һ��α�����������ȡ�Դ���������������еġ��� 0����������ָ��ֵ����������֮����ȷֲ��� int ֵ��
		 int num = new Random().nextInt(145) + 34;
		 System.out.println(num);
		
	}
}
