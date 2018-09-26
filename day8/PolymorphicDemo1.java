class Wine 
{
    private String name;
    
    public String getName()
	{
        return name;
    }

    public void setName(String name) 
	{
        this.name = name;
    }

    public Wine()
	{
    }
    
    public String drink()
	{
        return "�ȵ��� " + getName();
    }
    
    /**
     * ��дtoString()
     */
    public String toString()
	{
        return null;
    }
}

class JNC extends Wine
{
    public JNC()
	{
        setName("JNC");
    }
    
    /**
     * ��д���෽����ʵ�ֶ�̬
     */
    public String drink()
	{
        return "�ȵ��� " + getName();
    }
    
    /**
     * ��дtoString()
     */
    public String toString()
	{
        return "Wine : " + getName();
    }
}

class JGJ extends Wine
{
    public JGJ()
	{
        setName("JGJ");
    }
    
    /**
     * ��д���෽����ʵ�ֶ�̬
     */
    public String drink()
	{
        return "�ȵ��� " + getName();
    }
    
    /**
     * ��дtoString()
     */
    public String toString()
	{
        return "Wine : " + getName();
    }
}

public class PolymorphicDemo1 
{
    public static void main(String[] args) 
	{
        //���常������
        Wine[] wines = new Wine[2];
        //������������
        JNC jnc = new JNC();
        JGJ jgj = new JGJ();
        
        //���������������
        wines[0] = jnc;
        wines[1] = jgj;
        
        for(int i = 0 ; i < 2 ; i++)
		{
            System.out.println(wines[i].toString() + "--" + wines[i].drink());
        }
        System.out.println("-------------------------------");

		Object o = new JGJ();
		System.out.println(o.toString());
		System.out.println("-------------------------------");
		/**
			Object��Wine��JGJ���߼̳�����ϵ�ǣ�JGJ��>Wine��>Object��
			�������ǿ�������˵����������д����ķ���������ʱ��
			ֻ�ж���̳����е���ĩ�˵ķ����Żᱻ���á�
		*/
		Object o1 = new Wine();
		System.out.println(o1.toString());//Null ��ΪJGJ���������ڸö���̳�����.
    }
}
/**
 ������Ĵ�����JNC��JGJ�̳�Wine��������д��drink()��toString()������
 �������н���ǵ��������з��������JNC��JGJ�����ƣ�����Ƕ�̬�ı��֡�
 ��ͬ�Ķ������ִ����ͬ����Ϊ���������Ƕ���Ҫͨ���Լ���ʵ�ַ�ʽ��ִ�У����Ҫ����������ת����
*/
