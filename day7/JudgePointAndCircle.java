//需求：判断一个点和圆的关系(在圆外，圆周上，圆内)

//定义了一个点的类
class Point
{
	private double x,y;//横纵坐标

	public void setX(double x)
	{
		this.x = x;
	}
	public double getX()
	{
		return this.x;
	}
	public void setY(double y)
	{
		this.y = y;
	}
	public double getY()
	{
		return this.y;
	}
	//显示该点
	public void showPoint()
	{
		System.out.print("点" + "(" + this.x + " , " + this.y + ")");
	}
	//得到两点间的距离
	public static double getP2PDistance(Point p1,Point p2)
	{
		double distance = Math.sqrt(Math.pow((p1.x - p2.x),2.0)+Math.pow((p1.y - p2.y),2.0));

		return distance;
	}
}
//定义了一个圆的类
class Circle
{
	private Point center = new Point();
	private double radius;

	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	public double getRadius()
	{
		return this.radius;
	}

	public void setCenter(Point center)
	{
		this.center.setX(center.getX());
		this.center.setY(center.getY());
	}
	public Point getCenter()
	{
		 return this.center;
	}
}
//测试实现类
public class  JudgePointAndCircle
{
	//用来判断点和圆的关系
	static void judgePAC(Point p1,Circle c1)
	{
		double dis = Point.getP2PDistance(p1,c1.getCenter());
		if(dis < c1.getRadius())
		{
			p1.showPoint();
			System.out.println(" 在圆外");

		}else if(dis > c1.getRadius())
		{
			p1.showPoint();
			System.out.println(" 在圆内");
		}else
		{
			p1.showPoint();
			System.out.println(" 在圆上");
		}
	}
	public static void main(String[] args) 
	{
		//创建一个点对象
		Point p = new Point();
		p.setX(3.0);
		p.setY(4.0);
		System.out.print("输入的点为：");
		p.showPoint();
		System.out.println("\n----------------------");

		//创建一个圆(圆心+半径)
		Point center = new Point();
		center.setX(0.0);
		center.setY(0.0);
		Circle c = new Circle();
		c.setCenter(center);
		c.setRadius(5.0);

		//判断点和圆的关系
		judgePAC(p,c);
	}
}
