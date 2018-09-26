package upstream;

class LRCCode {
	public static void main(String[] args) {
		int OrderCode = 1;//指令码
		int ParaCode = 0;//参数值
		int OrinalCode = OrderCode + ParaCode;
		if (OrinalCode > 0x3fff) {
			OrinalCode = OrinalCode & 0x0fff;
		} else {
			int complementCode = ((~OrinalCode) & 0b11111111111111) + 1;
			System.out.print(complementCode);
		}
	}
}
