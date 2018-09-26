//�����ж�һ�����Բ�Ĺ�ϵ(��Բ�⣬Բ���ϣ�Բ��)

//������һ�������
class Point
{
	private double x,y;//��������

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
	//��ʾ�õ�
	public void showPoint()
	{
		System.out.print("��" + "(" + this.x + " , " + this.y + ")");
	}
	//�õ������ľ���
	public static double getP2PDistance(Point p1,Point p2)
	{
		double distance = Math.sqrt(Math.pow((p1.x - p2.x),2.0)+Math.pow((p1.y - p2.y),2.0));

		return distance;
	}
}
//������һ��Բ����
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
//����ʵ����
public class  JudgePointAndCircle
{
	//�����жϵ��Բ�Ĺ�ϵ
	static void judgePAC(Point p1,Circle c1)
	{
		double dis = Point.getP2PDistance(p1,c1.getCenter());
		if(dis < c1.getRadius())
		{
			p1.showPoint();
			System.out.println(" ��Բ��");

		}else if(dis > c1.getRadius())
		{
			p1.showPoint();
			System.out.println(" ��Բ��");
		}else
		{
			p1.showPoint();
			System.out.println(" ��Բ��");
		}
	}
	public static void main(String[] args) 
	{
		//����һ�������
		Point p = new Point();
		p.setX(3.0);
		p.setY(4.0);
		System.out.print("����ĵ�Ϊ��");
		p.showPoint();
		System.out.println("\n----------------------");

		//����һ��Բ(Բ��+�뾶)
		Point center = new Point();
		center.setX(0.0);
		center.setY(0.0);
		Circle c = new Circle();
		c.setCenter(center);
		c.setRadius(5.0);

		//�жϵ��Բ�Ĺ�ϵ
		judgePAC(p,c);
	}
}
