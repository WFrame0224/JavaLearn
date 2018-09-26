package upstream;

public class SimulationDemo {
	
	static double Current_speed = 1.5;//用于记录当前速度
	static int Current_height = 0; //用于记录当前高度
	
	public static void main(String[] args) {
		//init();
		//Start();
		SetSpeed(10.0);
		System.out.println();
		SetHeight(6);
		System.out.println();
		Stop();
		System.out.println();
		clear();
	}

	/**上电之后模拟
	 * 时序：
	 * 1>两次停止
	 * 2>查询状态 + 停止 + 给高度0
	 */
	protected static void init(){
		for(int i = 2;i >0 ;i --){
			new SStop();
		}
		new SDiagnose(); 
		new SStop();
		new SHeight(0);
	}
	/**真正的"开始"类，开始只是针对于速度
	 * 开始的时序
	 * 1>两次：查询状态 + 给速度1.5 + 给高度 0
	 * 2>连续三个开始代码 + 给速度 1.5 + 给高度0
	 */
	protected static void Start(){
		for(int i = 2;i >0 ;i --){
			new SDiagnose(); 
			new SSpeed(1.5);
			new SHeight(0);
		}
		for(int i = 3;i >0 ;i --){
			new SStart();
		}
		new SSpeed(1.5);
		new SHeight(0);
	}
	/**设置速度
	 * 时序：
	 * 1>查询故障 + 设置速度 + 设置高度
	 * 注意：此时的速度为给定值，高度为当前的值
	 */
	protected static void SetSpeed(double speed) {
		new SDiagnose();
		new SSpeed(speed);
		Current_speed = speed;//更新当前的速度（后期可以根据状态）
		new SHeight(Current_height);
	}
	/**设置高度
	 * 时序：
	 * 1>查询故障 + 设置速度 + 设置高度
	 * 注意：此时的高度为给定值，速度为当前的值
	 * @param d
	 */
	protected static void SetHeight(int height) {
		new SDiagnose();
		new SSpeed(Current_speed);
		new SHeight(height);
		Current_height = height;
	}
	/**“停止” 只是针对于速度而言
	 * 时序：
	 * 1>查询状态 + 不断减速（设置为不断减2，直到减为1）+ 四次停止
	 */
	protected static void Stop(){
		new SDiagnose();
		for(int i = (int)(Current_speed + 1) ;i >= 1; i -= 2){
			new SSpeed(i); 
		}
		for(int i = 4;i > 0;i --){
			new SStop();
		}
		new SDiagnose(); 
		new SStop();
		new SHeight(0);
	}
	/** 复位（暂时），不断降低高度直至为0，后期有清楚其他数据《==猜测
	 * 时序：
	 * 1>查询状态 + 停止 + 高度不断减值（不断减1）
	 * 2>复位3次
	 */
	protected static void clear(){
		new SDiagnose();
		new SStop();
		for(int i = Current_height ;i >= 0; i --){
			new SHeight(i); 
		}
		for(int i = 4;i > 0;i --){
			new SRest();
		}
	}
}
//============================类群=========================================
//开始类
class SStart {
	final String status = "Start";
	final double SCode = 0;
	SStart(){
		ChangeStatusDemo.ChangeStatus(status,SCode);		
	}
}
//停止类
class SStop {
	final String status = "Stop";
	final double SCode = 0;
	SStop(){
		ChangeStatusDemo.ChangeStatus(status,SCode);		
	}
}
//复位类
class SRest {
	final String status = "Reset";
	final double SCode = 0;
	SRest(){
		ChangeStatusDemo.ChangeStatus(status,SCode);		
	}
}
//状态查询类
class SDiagnose {
	final String status = "Diagnose";
	final double SCode = 0;
	SDiagnose(){
		ChangeStatusDemo.ChangeStatus(status,SCode);
	}
}
//速度改变类
class SSpeed {
	final String status = "Speed";
	double SCode = 0;
	SSpeed(double SCode){
		this.SCode = SCode;//得到此时的速度
		ChangeStatusDemo.ChangeStatus(status,SCode);
	}
}
//高度改变类
class SHeight {
	final String status = "Height";
	double SCode = 0;
	SHeight(double SCode){
		this.SCode = SCode;//得到此时的速度
		ChangeStatusDemo.ChangeStatus(status,SCode);
	}
}