package come.systems;

import java.util.Arrays;

public class SystemDemo {
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("�ұ�������");
	}
	public static void main(String[] args) {
		int[] src = new int[] { 1, 9, 8, 2, 7, 3, 4, 6, 5, 0 };
		int[] dest = new int[10];
		System.out.println(Arrays.toString(dest));
		//����Ŀ������� arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
		System.arraycopy(src, 3, dest, 4, 4);
		System.out.println(Arrays.toString(dest));

		//currentTimeMillis() �����Ժ���Ϊ��λ�ĵ�ǰʱ�� ��������ĳһ�����������ʱ�� 
		System.out.println(System.currentTimeMillis());
		
		//static void exit(int status) ��ֹ��ǰ�������е� Java �����,һ��ģ�����0��ʾ����������������ʾ�쳣����
		//System.exit(0);
		//static void gc() ǿ���������������� һ�㲻ʹ��
		new SystemDemo();
		new SystemDemo();
		System.gc();
		System.out.println("Ending....");//���ڲ��Ը�����Ƿ񻹻�ִ��

	}

}
