/**
	抽象类的注意：
		1.抽象类和抽象方法必须使用 abstract 修饰，含有抽象方法的类只能被定义为抽象类
		2.抽象类不能被实例化，无法通过new调用构造器来创建抽象类实例
		3.抽象类可以包含 成员变量、方法、构造器、初始化块、内部类
		4.final和abstract 永远不能同时使用
 */
abstract class SpeedMeter
{
	// 转速
	private double turnRate;
	public SpeedMeter()
	{
	}
	// 把返回车轮半径的方法定义为抽象方法
	public abstract double getRadius();
	// 定义父类的成员变量的setter方法
	public void setTurnRate(double turnRate)
	{
		this.turnRate = turnRate;
	}
	// 定义计算速度的通用方法
	public double getSpeed()
	{
		// 速度等于 车轮半径 * 2 * PI * 转速
		return java.lang.Math.PI * 2 * getRadius() * turnRate;// 注意：getRadius()方法是抽象方法，推迟到子类中实现，符合逻辑，抽象类无法确定车轮的半径，因而必须在之类中得到
	}
}  
public class CarSpeedMeter extends SpeedMeter
{
	// 实现父类的抽象方法，直接复制，并完成方法体
	public double getRadius()
	{
		return 0.28;
	}
	public static void main(String[] args) 
	{
		CarSpeedMeter csm = new CarSpeedMeter();
		csm.setTurnRate(15);
		System.out.println(csm.getSpeed());
	}
}
/**
 * 模板模式中：
 *		1：抽象父类可以只是定义需要使用的某些方法，把不能实现的部分抽象成抽象方法，留给子类去实现
 *		2：父类中可能包含需要调用其他系列方法的方法，这些被调方法既可以由父类实现，也可以用其子类实现。
 */
