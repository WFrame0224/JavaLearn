class CodeBlockDemo 
{
	{
		System.out.println("��ʼ�������");
	}
	/**
		����Ϊ��ʼ������飬ÿ�δ�������ʱ����ִ�г�ʼ�������:
			ÿ�δ������󶼻���ù��������ڵ��ù�����֮ǰ����ִ�б����еĳ�ʼ�������
		ͨ�������빤�ߣ���ʼ�������Ҳ��Ϊ��������������
		-->һ���ʼ�������û��ʲô����
	*/
	CodeBlockDemo()
	{
		System.out.println("������������");
	}

	static
	{
		System.out.println("��̬�����...\r\n");
	}
	/**�����������������ִ��֮ǰִ�о�̬����飬����ִֻ��һ��
		��Ϊ����̬��Ա�����ֽ���ļ���Ҳ�ӽ�JVM����ʱMain������δִ�У�
		�򷽷���ҪJVM���ã��Ȱ��ֽ�����ؽ�JVM������JVM�ٵ���main����
		һ��ģ�������������ʼ��������������Դ�����������ļ��� 
	*/

	public static void main(String[] args) 
	{
		/**
		{ 
			//�ֲ������
			int age = 27;
			System.out.println(age);
		}
		//System.out.println(age);//����ַ��ʲ����ֲ�����飬age
		*/
		
		System.out.println("����main����");
		//��������CodeBlockDemo����
		new CodeBlockDemo();
		new CodeBlockDemo();
		new CodeBlockDemo();
	}

}
