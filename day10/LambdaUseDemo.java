/**
	������ʵ��Lambda���ʽ�ж�Ӧ�ķ������ú͹���������
	������������������ʾ��
		   ����			    ʾ��								˵��										��Ӧ��Lambda���ʽ
		=======================================================================================================================
		�����෽��		����::�෽��		   ����ʽ�ӿ��б�ʵ�ֵķ�����ȫ�������������෽����Ϊ����		(a,b,...)->����.�෽��(a,b,...)
		=======================================================================================================================
		�����ض�����     �ض�����::ʵ������  ����ʽ�ӿ��б�ʵ�ֵķ�����ȫ�����������÷�����Ϊ����		(a,b,...)->�ض�����.ʵ������(a,b,...)
		��ʵ������
		=======================================================================================================================
		����ĳ�����     ����::ʵ������      ����ʽ�ӿ��б�ʵ�ַ����ĵ�һ��������Ϊ�����ߣ������        (a,b,...)->a.ʵ������(b,...)
		��ʵ������                           ����ȫ�������÷�����Ϊ����
		=======================================================================================================================
		���ù�����       ����::new          ����ʽ�ӿ��б�ʵ�ֵķ�����ȫ���������ݸ��ù�������Ϊ����     (a,b,...)->new ����(a,b,...)
		=======================================================================================================================
 */
//�ȴ�������ʽ�ӿڣ�ֻ�ǰ���һ�������෽��
import javax.swing.JFrame;

@FunctionalInterface
interface Conveter
{
	// ���ַ���ת��ΪInteger�ĳ��󷽷�
	Integer convert(String from);
}
@FunctionalInterface
interface Mytest
{
	// �÷����������String��int��int������������һ��String����ֵ
	String test(String a, int b, int c);
}
@FunctionalInterface
interface YourTest
{
	JFrame win(String title);
}
public class LambdaUseDemo
{
	public void FirstUse(String from, Conveter conv)
	{
		System.out.println(conv.convert(from));
	}
	public void ThirdUse(String a, int b, int c,Mytest mt)
	{
		System.out.println(mt.test(a,b,c));
	}
	public void FourthUse(String title,YourTest yt)
	{
		System.out.println(yt.win(title));
	}
	public static void main(String[] args) 
	{
		// �������ʹ��Lambda���ʽ����Conveter����
		LambdaUseDemo lamd1 = new LambdaUseDemo();
		System.out.println("���ó����Lambda���ʽ����");
		// ����Lambda���ʽ����һ��Conveter����,��û�в��á������෽������ģʽ
		Conveter converter1 = from->Integer.valueOf(from);
		lamd1.FirstUse("99",converter1);

		// ���á������෽������ģʽ
		System.out.println("���õ�һ����ʽ�������෽��ʵ��");
		//�����෽��	����::�෽��	
		//����ʽ�ӿ��б�ʵ�ֵķ�����ȫ�������������෽����Ϊ����  ��ʽ����
		Conveter converter2 = Integer::valueOf;
		lamd1.FirstUse("100",converter2);

		// ���� �����ض������ʵ������
		System.out.println("���õڶ�����ʽ�������ض������ʵ������");
		//�����ض������ʵ������     �ض�����::ʵ������
		//����ʽ�ӿ��б�ʵ�ֵķ�����ȫ�����������÷�����Ϊ����
		//Conveter converter3 = from ->"0123456789".indexOf(from);//Lambda���ʽ
		Conveter converter3 = "0123456789"::indexOf;//�ض�����::ʵ������
		lamd1.FirstUse("1",converter3);

		// ����ĳ������ʵ������
		//����ĳ������ʵ������     ����::ʵ������
		//����ʽ�ӿ��б�ʵ�ַ����ĵ�һ��������Ϊ�����ߣ�����Ĳ���ȫ�������÷�����Ϊ����
		System.out.println("���õ�������ʽ������ĳ������ʵ������");
		//Mytest mt = (a,b,c)->a.substring(b,c);//Lambda���ʽ
		Mytest mt = String::substring;
		lamd1.ThirdUse("hello,I am a hero",4,10,mt);//����::ʵ������
		
		// �������ù������ķ���
		// ����::new
		// ����ʽ�ӿ��б�ʵ�ֵķ�����ȫ���������ݸ��ù�������Ϊ����
		System.out.println("���õ�������ʽ�����ù�����");
		//YourTest yt = title->new JFrame(title);
		YourTest yt = JFrame::new;
		lamd1.FourthUse("hello",yt);
		
	}
}
