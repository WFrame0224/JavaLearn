/*需求：输出矩形图案
         *****
		 *****
		 *****
		 *****
*/
class RectangDemo 
{
	public static void main(String[] args) 
	{
		int i = 0,j = 0;
		char Logo = '&';
		for(i = 0;i < 4;i ++ )
		{
			for(j = 0;j < 5;j++)
				System.out.print(Logo);
			System.out.println();
		}
	}
}
