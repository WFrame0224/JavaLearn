package day17_���Ͽ��.generictype;

public class PointDemo {
	public static void main(String[] args) {
		//ʹ��String����
		Point<String> p1 = new Point<>();
		p1.setX("0");
		p1.setY("0");
		//ʹ��Integer����
		Point<Integer> p2 = new Point<>();
 		//ʹ��Double����
		Point<Double> p3 = new Point<>();
	}
	public static <T> T doWork(T val){
		return null;
	}
}
