package upstream;

class ParaCode {
	public static void main(String[] args) {
		/*
		�ٶȲ���ֵ�������ٶ� * 480
		�߶Ȳ���ֵ�������߶� + 2
		*/
		int ParaCode = 3;//����ֵ 
		byte code2 = 0;//������2
		byte code1 = 0;//������1
		code2 = (byte) (ParaCode & 0x7F);
		code1 = (byte) ((ParaCode >> 7) & 0xFF);
		System.out.print(Integer.toHexString(code1) + " " + Integer.toHexString(code2) + " ");
	}
	/*
	/*�����ٶ�ֵ
		* int speed:�������ٶ�ֵ
		* ���أ�״ֵ̬1���ɹ���0ʧ��
		*
		static boolean ChangeSpeed(int speed){
			byte Code = (byte)0x83;
			int OrderCode = 3;//ָ��ֵ
			int ParaCode = speed*480;//����ֵ
			System.out.print("�ٶ�Ϊ " + speed + " ��" + Integer.toHexString(Code & 0xff) +" " );
			ParaCode(ParaCode);
			ParaCode(LRCCode(OrderCode,ParaCode));
			return true;
		}
		static boolean ChangeSpeed(double speed){
			byte Code = (byte)0x83;
			int OrderCode = 3;//ָ��ֵ
			int ParaCode = (int)(speed*480);//����ֵ
			System.out.print("�ٶ�Ϊ " + speed + " ��" + Integer.toHexString(Code & 0xff) +" " );
			ParaCode(ParaCode);
			ParaCode(LRCCode(OrderCode,ParaCode));
			return true;
		}
		/*���ĸ߶�ֵ<--��������λ��λ
		* int height:�����ĸ߶�ֵ
		* ���أ�״ֵ̬1���ɹ���0ʧ��
		*
		static boolean ChangeHeight(int height){
			byte Code = (byte)0xB1;
			int OrderCode = 49;//ָ��ֵ
			int ParaCode = height + 2;//����ֵ
			System.out.print("\n�߶�Ϊ " + height + " ��" + Integer.toHexString(Code & 0xff) +" " );
			ParaCode(ParaCode);
			ParaCode(LRCCode(OrderCode,ParaCode));
			return true;
		}
	*/
}
