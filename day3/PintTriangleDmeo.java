/*需求：输出三角形图案
         *
		 **
		 ***
		 ****
*/
class  PintTriangleDmeo
{
	public static void main(String[] args) 
	{
		int i = 0, //行变量
			j = 0; //列变量
		char Logo = '*';
		for(i = 1;i <= 5;i ++ )
		{
			for(j = 1;j <= i;j++)
				System.out.print(Logo);//不换行
			System.out.println();//换行
		}
	}
}
