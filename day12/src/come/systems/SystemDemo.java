package come.systems;

import java.util.Arrays;

public class SystemDemo {
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("我被回收了");
	}
	public static void main(String[] args) {
		int[] src = new int[] { 1, 9, 8, 2, 7, 3, 4, 6, 5, 0 };
		int[] dest = new int[10];
		System.out.println(Arrays.toString(dest));
		//数组的拷贝操作 arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
		System.arraycopy(src, 3, dest, 4, 4);
		System.out.println(Arrays.toString(dest));

		//currentTimeMillis() 返回以毫秒为单位的当前时间 常常测试某一个操作的损耗时间 
		System.out.println(System.currentTimeMillis());
		
		//static void exit(int status) 终止当前正在运行的 Java 虚拟机,一般的，传入0表示正常结束，其他表示异常结束
		//System.exit(0);
		//static void gc() 强制运行垃圾回收器 一般不使用
		new SystemDemo();
		new SystemDemo();
		System.gc();
		System.out.println("Ending....");//用于测试该语句是否还会执行

	}

}
