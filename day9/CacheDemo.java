/**
	��װ���еĻ������(��Ԫģʽ)�����ʾ��ǻ�����ƣ�
	Byte��Short��Integer��Long������[-128,127]���������
	Character������[0,127]���������
*/
class CacheDemo 
{
	public static void main(String[] args) 
	{
		Integer i1 = new Integer(123);
		Integer i2 = new Integer(123);
		System.out.println(i1 == i2);//false,������װ��ıȽ����������Ͷ���ıȽϣ�ֻ��������װ�����ָ��ͬһ������ʱ�Ż᷵��true

		Integer i3 = Integer.valueOf(123);
		Integer i4 = Integer.valueOf(123);
		System.out.println(i3 == i4);//true����[-128,127]��Χ���ͻ�ȡ�����е�����
		
		Integer i5 = 123;//�Զ�װ�䣬�ײ㣺Integer.valueOf(123)
		Integer i6 = 123;
		System.out.println(i5 == i6);//true 
		System.out.println("-------------------");

		Integer i11 = new Integer(250);
		Integer i21 = new Integer(250);
		System.out.println(i11 == i21);//false

		Integer i31 = Integer.valueOf(250);//250����[-128,127]֮�䣬�͵�new Integer()
		Integer i41 = Integer.valueOf(250);
		System.out.println(i31 == i41);//
		
		Integer i51 = 250;
		Integer i61 = 250;
		System.out.println(i51 == i61);// 
		System.out.println(i51.equals(i61));
		

	}
}
 