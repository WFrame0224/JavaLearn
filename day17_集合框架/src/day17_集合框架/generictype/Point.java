package day17_集合框架.generictype;

//点类
//在本类中T表示一种类型，该类型具体是什么，由类的调用者来决定
public class Point<T> {
	private T x;
	private T y;
	public T getX() {
		return x;
	}
	public void setX(T x) {
		this.x = x;
	}
	public T getY() {
		return y;
	}
	public void setY(T y) {
		this.y = y;
	}
	
}
//常用公认泛型符：T：type   E：Elements	K：Key		V：Value