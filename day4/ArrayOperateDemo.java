//数组的基本操作
class  ArrayOperateDemo
{
	public static void main(String[] args) 
	{
		int[] num = new int[]{0,2,3,4,5,6,50,9,11};
		//求数组的长度
		System.out.println("数组的长度："+num.length);
		System.out.println("----------------");
		//获取数组的元素
		System.out.print("数组的第一个元素是：" + num[0]);
		System.out.print("\t数组的最后一个元素是：" + num[num.length-1]);
		System.out.println("\n-----------------");
		//设置数组的元素
		num[0] = 100;
		System.out.println("修改后的第一个元素是：" + num[0]);
		//获取数组的所有元素--遍历
		for(int i = 0;i < num.length;i++)
			System.out.print(num[i] + "\t");
		System.out.println("\n-----------------");

		//boolean[] bs = new boolean[3];
		String[] bs = new String[3];
		for(int i = 0;i < bs.length;i++)
			System.out.print(bs[i] + "\t");
		System.out.println("\n-----------------");
	}
}
