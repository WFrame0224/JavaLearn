package upstream;

class ParaCode {
	public static void main(String[] args) {
		/*
		速度参数值：给定速度 * 480
		高度参数值：给定高度 + 2
		*/
		int ParaCode = 3;//参数值 
		byte code2 = 0;//参数码2
		byte code1 = 0;//参数码1
		code2 = (byte) (ParaCode & 0x7F);
		code1 = (byte) ((ParaCode >> 7) & 0xFF);
		System.out.print(Integer.toHexString(code1) + " " + Integer.toHexString(code2) + " ");
	}
	/*
	/*更改速度值
		* int speed:给定的速度值
		* 返回：状态值1：成功，0失败
		*
		static boolean ChangeSpeed(int speed){
			byte Code = (byte)0x83;
			int OrderCode = 3;//指令值
			int ParaCode = speed*480;//参数值
			System.out.print("速度为 " + speed + " ：" + Integer.toHexString(Code & 0xff) +" " );
			ParaCode(ParaCode);
			ParaCode(LRCCode(OrderCode,ParaCode));
			return true;
		}
		static boolean ChangeSpeed(double speed){
			byte Code = (byte)0x83;
			int OrderCode = 3;//指令值
			int ParaCode = (int)(speed*480);//参数值
			System.out.print("速度为 " + speed + " ：" + Integer.toHexString(Code & 0xff) +" " );
			ParaCode(ParaCode);
			ParaCode(LRCCode(OrderCode,ParaCode));
			return true;
		}
		/*更改高度值<--发动机段位定位
		* int height:给定的高度值
		* 返回：状态值1：成功，0失败
		*
		static boolean ChangeHeight(int height){
			byte Code = (byte)0xB1;
			int OrderCode = 49;//指令值
			int ParaCode = height + 2;//参数值
			System.out.print("\n高度为 " + height + " ：" + Integer.toHexString(Code & 0xff) +" " );
			ParaCode(ParaCode);
			ParaCode(LRCCode(OrderCode,ParaCode));
			return true;
		}
	*/
}
