class  ArrayDemo
{
	public static void main(String[] args) 
	{
		//��̬��ʼ������
		//int age[] = {1,3,4,5,6,7};//ֱ�ӳ�ʼ��
		int[] age;
		age =new int[]{1,3,5,7,9};//���������ʼ����ע�ⲻ��дΪ��д age = {1,3,5,7,9};,����ᱨ��
		int[] ags =new int[]{1,2,3,4,5,6};
		System.out.println(age[3]);
		System.out.println(ags[3]);
		System.out.println("age���鳤��Ϊ��"+age.length);//ע��Java�п���ֱ�ӵõ����鳤��
		//��̬��ʼ������
		int[] nums = new int[10];
		System.out.println("----------------------");
		System.out.println("���鳤��Ϊ��"+nums.length);
		nums = new int[3];
		System.out.println("----------------------");
		System.out.println("���鳤��Ϊ��"+nums.length);
		/*
		nums = null;
		System.out.println("----------------------");
		System.out.println("���鳤��Ϊ��"+nums.length);
		//����ע�ʹ�����п�ָ���쳣
		*/

		//int[] num1 = new int[5]{1,3,5,7,9}; //XX Java�в�����̬�;�̬��ϳ�ʼ��
	}
}
