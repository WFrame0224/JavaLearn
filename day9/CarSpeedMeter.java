/**
	�������ע�⣺
		1.������ͳ��󷽷�����ʹ�� abstract ���Σ����г��󷽷�����ֻ�ܱ�����Ϊ������
		2.�����಻�ܱ�ʵ�������޷�ͨ��new���ù�����������������ʵ��
		3.��������԰��� ��Ա����������������������ʼ���顢�ڲ���
		4.final��abstract ��Զ����ͬʱʹ��
 */
abstract class SpeedMeter
{
	// ת��
	private double turnRate;
	public SpeedMeter()
	{
	}
	// �ѷ��س��ְ뾶�ķ�������Ϊ���󷽷�
	public abstract double getRadius();
	// ���常��ĳ�Ա������setter����
	public void setTurnRate(double turnRate)
	{
		this.turnRate = turnRate;
	}
	// ��������ٶȵ�ͨ�÷���
	public double getSpeed()
	{
		// �ٶȵ��� ���ְ뾶 * 2 * PI * ת��
		return java.lang.Math.PI * 2 * getRadius() * turnRate;// ע�⣺getRadius()�����ǳ��󷽷����Ƴٵ�������ʵ�֣������߼����������޷�ȷ�����ֵİ뾶�����������֮���еõ�
	}
}  
public class CarSpeedMeter extends SpeedMeter
{
	// ʵ�ָ���ĳ��󷽷���ֱ�Ӹ��ƣ�����ɷ�����
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
 * ģ��ģʽ�У�
 *		1�����������ֻ�Ƕ�����Ҫʹ�õ�ĳЩ�������Ѳ���ʵ�ֵĲ��ֳ���ɳ��󷽷�����������ȥʵ��
 *		2�������п��ܰ�����Ҫ��������ϵ�з����ķ�������Щ���������ȿ����ɸ���ʵ�֣�Ҳ������������ʵ�֡�
 */
