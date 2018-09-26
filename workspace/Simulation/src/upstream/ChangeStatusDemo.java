package upstream;

public class ChangeStatusDemo {
	/**����״ָ̬��ֵ����״̬
	* string status:�ַ���������ı��״̬
	      ״̬ ��Start--��ʼ��Stop--ֹͣ��Reset--��λ��Diagnose--��ѯ���ϣ�
		         Speed--�ٶȸı䣻Height--�߶ȸı䣨��������λ��λ����Height1--��������Χ��⣻Height2--����������ֶ�
	* int SCode:��������״̬����ֵ�����߶ȣ��ٶȰ�����ֵ֮�⣬���඼��0
	*/
	static boolean ChangeStatus(String status, double SCode) {
		byte Code = (byte) 0;//���ڵõ���Ӧָ��ܵ�ָ����
		int OrderCode = 0;//ָ��ֵ
		int ParaCode = (int) SCode;//����ֵ��״̬����ֵ��
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
			System.out.println("ָ��������������������");
			return false;
		}
		//System.out.print("\n" + status + " ��" + Integer.toHexString(Code & 0xff) +" " );
		System.out.print(Integer.toHexString(Code & 0xff) + " ");
		ParaCode(ParaCode);
		ParaCode(LRCCode(OrderCode, ParaCode));
		return true;
	}

	/*У��������
	*int OrderCode��ָ����
	*int ParaCode������ֵ
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

	/*��λ��������
	*int ParaCode ����ֵ
	*/
	static void ParaCode(int ParaCode) {
		byte code2 = 0;//������2
		byte code1 = 0;//������1
		code2 = (byte) (ParaCode & 0x7F);
		code1 = (byte) ((ParaCode >> 7) & 0xFF);
		System.out.print(Integer.toHexString(code1) + " " + Integer.toHexString(code2) + " ");
	}
}
