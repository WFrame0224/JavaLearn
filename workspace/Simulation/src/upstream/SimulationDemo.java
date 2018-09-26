package upstream;

public class SimulationDemo {
	
	static double Current_speed = 1.5;//���ڼ�¼��ǰ�ٶ�
	static int Current_height = 0; //���ڼ�¼��ǰ�߶�
	
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

	/**�ϵ�֮��ģ��
	 * ʱ��
	 * 1>����ֹͣ
	 * 2>��ѯ״̬ + ֹͣ + ���߶�0
	 */
	protected static void init(){
		for(int i = 2;i >0 ;i --){
			new SStop();
		}
		new SDiagnose(); 
		new SStop();
		new SHeight(0);
	}
	/**������"��ʼ"�࣬��ʼֻ��������ٶ�
	 * ��ʼ��ʱ��
	 * 1>���Σ���ѯ״̬ + ���ٶ�1.5 + ���߶� 0
	 * 2>����������ʼ���� + ���ٶ� 1.5 + ���߶�0
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
	/**�����ٶ�
	 * ʱ��
	 * 1>��ѯ���� + �����ٶ� + ���ø߶�
	 * ע�⣺��ʱ���ٶ�Ϊ����ֵ���߶�Ϊ��ǰ��ֵ
	 */
	protected static void SetSpeed(double speed) {
		new SDiagnose();
		new SSpeed(speed);
		Current_speed = speed;//���µ�ǰ���ٶȣ����ڿ��Ը���״̬��
		new SHeight(Current_height);
	}
	/**���ø߶�
	 * ʱ��
	 * 1>��ѯ���� + �����ٶ� + ���ø߶�
	 * ע�⣺��ʱ�ĸ߶�Ϊ����ֵ���ٶ�Ϊ��ǰ��ֵ
	 * @param d
	 */
	protected static void SetHeight(int height) {
		new SDiagnose();
		new SSpeed(Current_speed);
		new SHeight(height);
		Current_height = height;
	}
	/**��ֹͣ�� ֻ��������ٶȶ���
	 * ʱ��
	 * 1>��ѯ״̬ + ���ϼ��٣�����Ϊ���ϼ�2��ֱ����Ϊ1��+ �Ĵ�ֹͣ
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
	/** ��λ����ʱ�������Ͻ��͸߶�ֱ��Ϊ0������������������ݡ�==�²�
	 * ʱ��
	 * 1>��ѯ״̬ + ֹͣ + �߶Ȳ��ϼ�ֵ�����ϼ�1��
	 * 2>��λ3��
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
//============================��Ⱥ=========================================
//��ʼ��
class SStart {
	final String status = "Start";
	final double SCode = 0;
	SStart(){
		ChangeStatusDemo.ChangeStatus(status,SCode);		
	}
}
//ֹͣ��
class SStop {
	final String status = "Stop";
	final double SCode = 0;
	SStop(){
		ChangeStatusDemo.ChangeStatus(status,SCode);		
	}
}
//��λ��
class SRest {
	final String status = "Reset";
	final double SCode = 0;
	SRest(){
		ChangeStatusDemo.ChangeStatus(status,SCode);		
	}
}
//״̬��ѯ��
class SDiagnose {
	final String status = "Diagnose";
	final double SCode = 0;
	SDiagnose(){
		ChangeStatusDemo.ChangeStatus(status,SCode);
	}
}
//�ٶȸı���
class SSpeed {
	final String status = "Speed";
	double SCode = 0;
	SSpeed(double SCode){
		this.SCode = SCode;//�õ���ʱ���ٶ�
		ChangeStatusDemo.ChangeStatus(status,SCode);
	}
}
//�߶ȸı���
class SHeight {
	final String status = "Height";
	double SCode = 0;
	SHeight(double SCode){
		this.SCode = SCode;//�õ���ʱ���ٶ�
		ChangeStatusDemo.ChangeStatus(status,SCode);
	}
}