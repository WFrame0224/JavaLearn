/**����
		
*/
//����ѧ������
class Student
{
	String name;//����
	boolean isFee = false;//ѧ���Ľɷ�״̬��Ĭ��Ϊδ�ɷ�

	void fees()
	{
		isFee = true;//����Ϊ�Ѿ���ѧ��
	}

}
//������
class  StudentDemo
{
	public static void main(String[] args) 
	{
		//����4��ѧ������
		Student s1 = new Student();
		s1.name = "��һ";
		s1.isFee = true;

		Student s2 = new Student();
		s2.name = "���";
		s2.isFee = false;
		
		Student s3 = new Student();
		s3.name = "����";
		s3.isFee = false;
		
		Student s4 = new Student();
		s4.name = "����";
		s4.isFee = true;
		
		//����һ�����飬���ڴ�����е�ѧ��������ʵ�ʴ�ŵ����ö���ĵ�ַ����ַָ���ڴ�ռ�
		Student[] students = new Student[]{s1,s2,s3,s4};
		//System.out.println(students.length);

		//ʹ��ѭ�����������е�ÿһ��Ԫ��
		for(Student ele : students)
		{
			System.out.println(ele.name + ", " + ele.isFee);
			//�жϵ�ǰѧ�������Ƿ�ɷѣ����û�У�����ýɷѷ���
			if(!ele.isFee)
			{
				ele.fees();
			}
		}
		System.out.println("==========�ɷѼ��==============");
		for(Student ele : students)
		{
			System.out.println(ele.name + ", " + ele.isFee);
		}
	}
}
