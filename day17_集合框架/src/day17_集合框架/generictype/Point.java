package day17_���Ͽ��.generictype;

//����
//�ڱ�����T��ʾһ�����ͣ������;�����ʲô������ĵ�����������
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
//���ù��Ϸ��ͷ���T��type   E��Elements	K��Key		V��Value