//递归方法
//求斐波那契数列，其通项公式：F(n) = F(n-1) + F(n-2),F(0) = 0,F(1) = 1
class  RecursionDemo
{
	
	static int fn(int n)
	{
		if(n == 0)
		{
			return 0;
		}
		else if(n == 1)
		{
			return 1; 
		}
		else
		{
			return fn(n-1) + fn(n-2);
		}		
	}
	public static void main(String[] args) 
	{
		int ret = fn(6);
		System.out.println(ret);
	}

} 
