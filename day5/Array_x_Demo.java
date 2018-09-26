// 多维数组的理解与操作
public class Array_x_Demo 
{
	public static void main(String[] args) 
	{
		int[][] a; //定义一个二维数组
		a = new int[4][]; // 把a当做一维数组进行初始化，初始化a是一个长度为4的数组，a数组的数组元素又是引用类型
		for (int i = 0 ; i < a.length ; i ++ )
		{
			System.out.println(a[i]);
		}
		//初始化a数组的第一个元素
		a[0] = new int[2];
		// 访问a元素的第一个元素所指数组的第二个元素
		a[0][1] = 6;
		for (int i = 0; i < a[0].length ; i ++)
		{
			System.out.println(a[0][i]);
		}
		// 再次打印出这时的二维数组，可以看到除第一个数组元素不为Null,其他数组元素都为Null
		for (int i = 0 ; i < a.length ; i ++ )
		{
			System.out.println(a[i]);
		}
		int[][] b = new int[3][4];
		for (int i = 0 ; i < b.length ; i++)
		{
			System.out.println(b[i]);
		}

	}
}
