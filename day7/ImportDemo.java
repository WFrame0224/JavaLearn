//import java.util.Arrays;
import java.util.*;//ʹ����ͨ������浼��������Ҫ����

class ImportDemo 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[]{1,-2,3,4,-5,6,7,-8,9,-10};
		//��ӡ
		//String ret = java.util.Arrays.toString(arr);
		String ret = Arrays.toString(arr);//ʹ����import��䣬ֱ�ӿ��Բ��� ����.������
		/**
			û��ʹ��import֮ǰ����������ͬһ�����е��࣬��ʹ�� ȫ�޶��� ������
			���������ʹ��impotr��䣬ֱ�Ӱ�ĳ�����µ��ർ�뵱ǰ�ļ�����ȥ
			�﷨��ʽ��import ��Ҫ�������-ȫ�޶���
		*/
		System.out.println(ret);
		//����
		java.util.Arrays.sort(arr);
		//ret = java.util.Arrays.toString(arr);
		ret = Arrays.toString(arr);//�˴�ͬ��
		System.out.println(ret);

	}
}
