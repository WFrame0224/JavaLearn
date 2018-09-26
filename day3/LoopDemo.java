class LoopDemo 
{
	public static void main(String[] args) 
	{
		int i = 0,j = 0,num = 1;
		for(i=0;i <= 100/5;i ++)
		{
			
			System.out.println(num+" "+(num+1)+" "+(num+2)+" "+(num+3)+" "+(num+4));
			num += 5;
		}
	}
}
