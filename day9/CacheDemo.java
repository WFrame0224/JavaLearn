/**
	包装类中的缓存设计(享元模式)，本质就是缓存设计：
	Byte、Short、Integer、Long：缓存[-128,127]区间的数据
	Character：缓存[0,127]区间的数据
*/
class CacheDemo 
{
	public static void main(String[] args) 
	{
		Integer i1 = new Integer(123);
		Integer i2 = new Integer(123);
		System.out.println(i1 == i2);//false,两个包装类的比较是引用类型对象的比较，只有两个包装类对象指向同一个对象时才会返回true

		Integer i3 = Integer.valueOf(123);
		Integer i4 = Integer.valueOf(123);
		System.out.println(i3 == i4);//true：在[-128,127]范围，就获取缓存中的数据
		
		Integer i5 = 123;//自动装箱，底层：Integer.valueOf(123)
		Integer i6 = 123;
		System.out.println(i5 == i6);//true 
		System.out.println("-------------------");

		Integer i11 = new Integer(250);
		Integer i21 = new Integer(250);
		System.out.println(i11 == i21);//false

		Integer i31 = Integer.valueOf(250);//250不在[-128,127]之间，就得new Integer()
		Integer i41 = Integer.valueOf(250);
		System.out.println(i31 == i41);//
		
		Integer i51 = 250;
		Integer i61 = 250;
		System.out.println(i51 == i61);// 
		System.out.println(i51.equals(i61));
		

	}
}
 