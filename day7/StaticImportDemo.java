//��̬����--ʵ�ʿ��������ǲ�ʹ�þ�̬���룬��Ϊ��ˣ��ֲ��徲̬�������ֶ�Դ����һ����

import java.util.Arrays;
import static java.util.Arrays.*;

class StaticImportDemo
{
	public static void main(String[] args) 
	{
		int[] arr = new int[]{1,-2,3,4,-5,6,7,-8,9,-10};

		String ret = Arrays.toString(arr);
		System.out.println(ret);
		
		//����
		sort(arr);//�����˾�̬����ķ���������ʡ������
		ret = Arrays.toString(arr);//�˴�ͬ��
		System.out.println(ret);
	}
}
