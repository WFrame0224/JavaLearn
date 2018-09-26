//类A A--基类
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
//类B B-->A
class B extends A
{
    public String show(B obj)
	{
        return ("B and B");
    }
    
    public String show(A obj)//属于对父类方法的重写，注意多态
	{
        return ("B and A");
    } 
}
//类C C-->B
class C extends B
{

}
//类D D-->B
class D extends B
{

}

public class PolyMorphicDemo2 
{
    public static void main(String[] args) 
	{
        A a1 = new A();//创建了 指向A类型的A类类型引用变量
        A a2 = new B();//创建了 指向B类型的A类类型引用变量 + 对A类方法的重写+继承 -->多态
        B b = new B(); //创建了 指向B类型的B类类型引用变量
        C c = new C(); //创建了 指向C类型的C类类型引用变量
        D d = new D(); //创建了 指向D类型的D类类型引用变量
        
        System.out.println("1--" + a1.show(b));//这两行由于A类方法中没有参数类型为Ｂ和Ｃ类，
        System.out.println("2--" + a1.show(c));//但是这两类是继承Ａ类关系，所以调用参数为Ａ类型的方法	
												
        System.out.println("3--" + a1.show(d));//直接调用参数类型为D类的方法

        System.out.println("4--" + a2.show(b));//-->多态，调用了B类方法的参数类型为A类的方法
        System.out.println("5--" + a2.show(c));//同上
        System.out.println("6--" + a2.show(d));//-->多态，B类方法中没有参数类型为D类的方法，选择器父类A中的方法

        System.out.println("7--" + b.show(b));//直接调用B类中参数类型为B类的方法
        System.out.println("8--" + b.show(c));//同上
        System.out.println("9--" + b.show(d));//因B类中没有参数类型为D类的方法，所以直接调用其继承的父类中的参数类型为D类的方法      
    }
}
/**输出
---------- 运行Java ----------
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
关键思想：
	当超类对象引用变量引用子类对象时，被引用对象的类型而不是引用变量的类型决定了调用谁的成员方法，
	但是这个被调用的方法必须是在超类中定义过的，也就是说被子类覆盖的方法
		其实在继承链中对象方法的调用存在一个优先级：
		this.show(O)、super.show(O)、this.show((super)O)、super.show((super)O)。

*/