package day17_集合框架.generictype;

public class PointDemo {
	public static void main(String[] args) {
		//使用String类型
		Point<String> p1 = new Point<>();
		p1.setX("0");
		p1.setY("0");
		//使用Integer类型
		Point<Integer> p2 = new Point<>();
 		//使用Double类型
		Point<Double> p3 = new Point<>();
	}
	public static <T> T doWork(T val){
		return null;
	}
}
