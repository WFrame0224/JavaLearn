package upstream;

/**
* 指令功能：   指令值   参数值     指令
* 启动：         1       0         0x81
* 停止：         2       0         0x82
* 设置频率       3       2000      0x83 
						整数差值480，小数差值48 
* 复位：         4       0         0x84
* 查询故障       18      0         0x92
* 升降机电机     17      0         0x91
  范围检测
* 升降机电机     33      5         0xA1
  分段     
* 升降机电机     49      2         0xB1
  定位
  =======================================
  	速度参数值：给定速度 * 480
	高度参数值：给定高度 + 2
*/
class Coder {
	public static void main(String[] args) {
		ChangeStatus("Speed", 19.9);//改变速度
		ChangeStatus("Height", 10);//改变高度
		ChangeStatus("Start", 0);
		ChangeStatus("Stop", 0);
		ChangeStatus("Reset", 0);
		ChangeStatus("Diagnose", 0);
	}

	/**根据状态指令值更改状态
	* string status:字符串代表想改变的状态
	      状态 ：Start--开始；Stop--停止；Reset--复位；Diagnose--查询故障；
		         Speed--速度改变；Height--高度改变（升降机段位定位）；Height1--升降机范围检测；Height2--升降机电机分段
	* int SCode:用于输入状态给定值，除高度，速度按给定值之外，其余都是0
	*/
	static boolean ChangeStatus(String status, double SCode) {
		byte Code = (byte) 0;//用于得到对应指令功能的指令码
		int OrderCode = 0;//指令值
		int ParaCode = (int) SCode;//参数值（状态给定值）
		switch (status) {
		case "Start":
			Code = (byte) 0x81;
			OrderCode = Code & 0x7F;
			break;
		case "Stop":
			Code = (byte) 0x82;
			OrderCode = Code & 0x7F;
			break;
		case "Reset":
			Code = (byte) 0x84;
			OrderCode = Code & 0x7F;
			break;
		case "Diagnose":
			Code = (byte) 0x92;
			OrderCode = Code & 0x7F;
			break;
		case "Speed":
			Code = (byte) 0x83;
			OrderCode = Code & 0x7F;
			ParaCode = (int) (SCode * 480);
			break;
		case "Height":
			Code = (byte) 0xB1;
			OrderCode = Code & 0x7F;
			ParaCode = (int) (SCode + 2);
			break;
		case "Height1":
			Code = (byte) 0x91;
			OrderCode = Code & 0x7F;
			break;
		case "Height2":
			Code = (byte) 0xA1;
			OrderCode = Code & 0x7F;
			break;
		default:
			System.out.println("指令输入有误请重新输入");
			return false;
		}
		System.out.print("\n" + status + " ：" + Integer.toHexString(Code & 0xff) + " ");
		ParaCode(ParaCode);
		ParaCode(LRCCode(OrderCode, ParaCode));
		return true;
	}

	/*校验码生成
	*int OrderCode：指令码
	*int ParaCode：参数值
	*/
	static int LRCCode(int OrderCode, int ParaCode) {
		int OrinalCode = OrderCode + ParaCode;
		if (OrinalCode > 0x3fff) {
			OrinalCode = OrinalCode & 0x0fff;
		}
		int complementCode = ((~OrinalCode) & 0b11111111111111) + 1;
		//System.out.print(complementCode);
		return complementCode;
	}

	/*两位码生成器
	*int ParaCode 参数值
	*/
	static void ParaCode(int ParaCode) {
		byte code2 = 0;//参数码2
		byte code1 = 0;//参数码1
		code2 = (byte) (ParaCode & 0x7F);
		code1 = (byte) ((ParaCode >> 7) & 0xFF);
		System.out.print(Integer.toHexString(code1) + " " + Integer.toHexString(code2) + " ");
	}
}