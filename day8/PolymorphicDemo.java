class Wine 
{
	// ������ʵ������
    public int wine = 100;
	public void fun1()
	{
        System.out.println("Wine ��Fun.....");
        fun2();
    }
    
    public void fun2()
	{
        System.out.println("Wine ��Fun2...");
    }
}

class JNC extends Wine
{
	// ���¶���һ�� wine ʵ�����������ظ����wineʵ������
    public String wine = "JNC";
	/**
     * @desc �������ظ��෽��
     *        �����в����ڸ÷���������ת�ͺ󣬸����ǲ������ø÷�����
     * @param a
     * @return void
     */
    public void fun1(String a)
	{
        System.out.println("JNC �� Fun1...");
        fun2();
	}
    
    /**
     * ������д���෽��
     * ָ������ĸ������õ���fun2ʱ���ض��ǵ��ø÷���
     */
    public void fun2()
	{
        System.out.println("JNC ��Fun2...");
    }
	/**
     * ����һ������û�еķ������������еķ���
	 * ָ������ĸ������õ��ø÷���ʱ����������
	 */
	 public void fun3()
	 {
		 System.out.println("I am special function, my father doesn't have me!");
	 }
}

public class PolymorphicDemo 
{
    public static void main(String[] args) 
	{
        Wine a = new JNC();//ָ������ĸ�����������
        a.fun1();
		// �������д����������
		// a.fun3();

		// ���100���������ʵ��Ǹ����ʵ������
		System.out.println(a.wine);
		/**
			�뷽����ͬ���ǣ������ ʵ���������߱���̬�ԣ����������a���ñ������������������wine����ʱ��
			��δ���������JNC��ʵ����������������丸���ʵ������
		*/
		
		/**
		���������������������JNC�����˸���Wine�ķ���fun1()����дfun2()���������غ��fun1(String a)
		�� fun1()����ͬһ�����������ڸ�����û�и÷���������ת�ͺ�ᶪʧ�÷�����
		����ִ��JNC��Wine���������ǲ�������fun1(String a)������
		������JNC��д��fun2() ����ôָ��JNC��Wine���û����JNC��fun2()����
		
		--->�ܽ����£�
		ָ������ĸ���������������ת���ˣ���ֻ�ܷ��ʸ�����ӵ�еķ��������ԣ�
		�����������д��ڶ������в����ڵķ������������ǲ���ʹ�õģ����������ظ÷�����
		��������д�˸����е�ĳЩ�������ڵ��ø�Щ������ʱ�򣬱ض���ʹ�������ж������Щ��������̬���ӡ���̬���ã�
		*/
		System.out.println("==============");
		JNC b = new JNC();// ������ָ������ĸ������͵����ã���˲����ڶ�̬
		b.fun1();
		// ������ָ������ĸ������͵����ã������ڶ�̬�����õ�ֱ������������з���
		b.fun3();
		System.out.println(b.wine);
    }
}