//控制外层循环 给外层循环起别名（需要符合标识符规范）
public class  ConLoopDemo
{
	public static void main(String[] args) 
	{
		int i = 0, //行变量--第一个乘数
			j = 0; //列变量--第二个乘数
		outter:for(i = 1;i <= 9;i ++ )
				{
					for(j = 1;j <= i;j++)
					{
						if(i == 5)
						{
							break outter;
						}
						System.out.print(j +" * "+ i + " = " + (i * j)+"\t");//不换行
					}
					System.out.println();//换行
				}
	}
}
