/**需求：
		
*/
//描述学生对象
class Student
{
	String name;//姓名
	boolean isFee = false;//学生的缴费状态，默认为未缴费

	void fees()
	{
		isFee = true;//设置为已经缴学费
	}

}
//测试类
class  StudentDemo
{
	public static void main(String[] args) 
	{
		//创建4个学生对象
		Student s1 = new Student();
		s1.name = "赵一";
		s1.isFee = true;

		Student s2 = new Student();
		s2.name = "李二";
		s2.isFee = false;
		
		Student s3 = new Student();
		s3.name = "万三";
		s3.isFee = false;
		
		Student s4 = new Student();
		s4.name = "刘四";
		s4.isFee = true;
		
		//创建一个数组，用于存放所有的学生对象，其实际存放的引用对象的地址，地址指向内存空间
		Student[] students = new Student[]{s1,s2,s3,s4};
		//System.out.println(students.length);

		//使用循环迭代数组中的每一个元素
		for(Student ele : students)
		{
			System.out.println(ele.name + ", " + ele.isFee);
			//判断当前学生对象是否缴费，如果没有，则调用缴费方法
			if(!ele.isFee)
			{
				ele.fees();
			}
		}
		System.out.println("==========缴费检查==============");
		for(Student ele : students)
		{
			System.out.println(ele.name + ", " + ele.isFee);
		}
	}
}
