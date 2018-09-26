//抽象类

abstract class Graph
{
	abstract public Double getArea();
	//abstract public void fuckGirl();
}
//三角形
class Triangle extends Graph
{
	private Integer a,b,c;
	Triangle(Integer a,Integer b,Integer c)
	{
		if((a + b < c) || (a + c < b) || (b + c < a))
		{
			System.out.println("Error!!!,Please check your number");
			return;

		}else
		{
			this.a = a;
			this.b = b;
			this.c = c;
		}
	}
	public Double getArea()
	{
		Integer p = (a+b+c)/2;
		return Math.sqrt(p* (p - a) * (p - b) * (p - c));
	}
}
//矩形
class Rectange extends Graph
{
	private Integer length,width;
	Rectange(Integer length,Integer width)
	{
		this.length = length;
		this.width = width;
	}
	public Double getArea() 
	{
		return length.doubleValue() * width.doubleValue();
	}
}
//圆
class Circle extends Graph
{
	private Integer r;
	Circle(Integer r)
	{
		this.r = r;
	}
	//求面积
	public Double getArea()
	{
		return 3.14 * r * r;
	}
}
class GraphDemo 
{ 
	public static void main(String[] args) 
	{
		/**
		Circle c1 = new Circle(10);
		Double Sc1 = c1.getArea();
		System.out.println("圆的面积为" + Sc1);

		Rectange r1 = new Rectange(10,8);
		Integer Sr1 = r1.getArea();
		System.out.println("矩形的面积为" + Sr1);

		Triangle t1 = new Triangle(3,4,5);
		Double St1 = t1.getArea();
		System.out.println("三角形的面积为" + St1);
		*/
		System.out.println("圆的面积为" + new Circle(10).getArea());
		System.out.println("矩形的面积为" + new Rectange(10,8).getArea());
		System.out.println("三角形的面积为" + new Triangle(3,4,5).getArea());
	}
}
