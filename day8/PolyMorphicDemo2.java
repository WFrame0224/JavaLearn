//��A A--����
class A
{
    public String show(D obj) 
	{
        return ("A and D");
    }

    public String show(A obj) 
	{
        return ("A and A");
    } 

}
//��B B-->A
class B extends A
{
    public String show(B obj)
	{
        return ("B and B");
    }
    
    public String show(A obj)//���ڶԸ��෽������д��ע���̬
	{
        return ("B and A");
    } 
}
//��C C-->B
class C extends B
{

}
//��D D-->B
class D extends B
{

}

public class PolyMorphicDemo2 
{
    public static void main(String[] args) 
	{
        A a1 = new A();//������ ָ��A���͵�A���������ñ���
        A a2 = new B();//������ ָ��B���͵�A���������ñ��� + ��A�෽������д+�̳� -->��̬
        B b = new B(); //������ ָ��B���͵�B���������ñ���
        C c = new C(); //������ ָ��C���͵�C���������ñ���
        D d = new D(); //������ ָ��D���͵�D���������ñ���
        
        System.out.println("1--" + a1.show(b));//����������A�෽����û�в�������Ϊ�ºͣ��࣬
        System.out.println("2--" + a1.show(c));//�����������Ǽ̳У����ϵ�����Ե��ò���Ϊ�����͵ķ���	
												
        System.out.println("3--" + a1.show(d));//ֱ�ӵ��ò�������ΪD��ķ���

        System.out.println("4--" + a2.show(b));//-->��̬��������B�෽���Ĳ�������ΪA��ķ���
        System.out.println("5--" + a2.show(c));//ͬ��
        System.out.println("6--" + a2.show(d));//-->��̬��B�෽����û�в�������ΪD��ķ�����ѡ��������A�еķ���

        System.out.println("7--" + b.show(b));//ֱ�ӵ���B���в�������ΪB��ķ���
        System.out.println("8--" + b.show(c));//ͬ��
        System.out.println("9--" + b.show(d));//��B����û�в�������ΪD��ķ���������ֱ�ӵ�����̳еĸ����еĲ�������ΪD��ķ���      
    }
}
/**���
---------- ����Java ----------
1--A and A
2--A and A
3--A and D

4--B and A
5--B and A
6--A and D

7--B and B
8--B and B
9--A and D

Output completed (0 sec consumed) - Normal Termination
�ؼ�˼�룺
	������������ñ��������������ʱ�������ö�������Ͷ��������ñ��������;����˵���˭�ĳ�Ա������
	������������õķ����������ڳ����ж�����ģ�Ҳ����˵�����า�ǵķ���
		��ʵ�ڼ̳����ж��󷽷��ĵ��ô���һ�����ȼ���
		this.show(O)��super.show(O)��this.show((super)O)��super.show((super)O)��

*/