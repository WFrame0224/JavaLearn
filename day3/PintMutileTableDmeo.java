/*需求：输出9x9乘法表图案
         1 * 1 =1
		 1 * 2 =2 2 * 2 = 4
		 1 * 3 =3 2 * 3 = 6 3 * 3 = 9
		 1 * 4 =4 2 * 4 = 8 3 * 4 = 12 4 * 4 =16
		 规律：第二个乘数和行数相同，第一个乘数 <= 第二个乘数
*/
class  PintMutileTableDmeo
{
	public static void main(String[] args) 
	{
		int i = 0, //行变量--第一个乘数
			j = 0; //列变量--第二个乘数
		for(i = 1;i <= 9;i ++ )
		{
			for(j = 1;j <= i;j++)
				System.out.print(j +" * "+ i + " = " + (i * j)+"\t");//不换行
			System.out.println();//换行
		}
	}
}