class  ArrayCopyDemo
{
	public static void main(String[] args) 
	{
		int[] src = new int[]{1,2,3,4,5,6,7,8,9,10};//源数组
		int[] dest = new int[src.length];//目标数组

		System.out.println("源数组为：");
		ArrayCopyDemo.printArray(src);
		System.out.println("拷贝前的目标数组为：");
		ArrayCopyDemo.printArray(dest);
		System.out.println("--------------------");
		//需求：将源数组拷贝到目标数组
		//ArrayCopyDemo.copyArray(src,dest,2,4,4);//自己编写的方法

		/*
		public static native void arraycopy(Object src,  int  srcPos,
                                        Object dest, int destPos,
                                        int length);
		*/
		System.arraycopy(src,2,dest,4,4);//采用了系统自带的方法
		
		System.out.println("拷贝后的目标数组为：");
		ArrayCopyDemo.printArray(dest);
	}

	/*copyArray 拷贝数组，可选拷贝位置，长度，但是缺少必要的数据范围的检查
	参数表：
			src:		源数组
			dest:		目标数组
			srcPos:		在源数组中拷贝开始位置
			destPos:	在目标数组中开始粘贴的位置
			copyLength：拷贝元素的长度
	*/
	static void copyArray(int[] src,int[] dest,int srcPos,int copyLength,int destPos)
	{
		for(int index = srcPos;index < srcPos+copyLength;index ++ )
		{
			//dest[destPos+(index-srcPos)] = src[index];
			dest[destPos] = src[index];
			destPos ++;
		}
	}
	
	//打印出数组
	static void printArray(int[] num)
	{
		if(num == null)
		{
			System.out.println("Error------");
			return;
		}
		System.out.print("[");
		for (int i = 0;i < num.length;i ++ )
		{
			if(i != num.length-1)
			{
				System.out.print(num[i]+",");
			}else
			{
				System.out.print(num[num.length-1]);
			}
		}
		System.out.print("]\n");
	}
}
