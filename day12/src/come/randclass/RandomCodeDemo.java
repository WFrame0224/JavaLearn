package come.randclass;

import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

//���������֤��
public class RandomCodeDemo {
	public static void main(String[] args) {
		//��������һ����λ���������
		//����һ������UUID����ȡǰ��λ������֮��ֻ��С��������
		String randcode1 = UUID.randomUUID().toString().substring(0, 5);
		System.out.println("-----UUID����------\n"+randcode1);//c7142
		
		//��������
		String str = "ABCDEFGHIJKLMOPQRSTUVWXYZ";
		str += str.toLowerCase();
		str += "0123456789";        //�������������������26����Сд��ĸ+0~9������
		//System.out.println(str);  //����ƴ��Ч��
		
		ThreadLocalRandom random = ThreadLocalRandom.current();//�õ�һ�������
		int intcode = 0;
		//String randcode2 = "";
		StringBuilder randcode2 = new StringBuilder(5); //����һ���洢����5λ�����֤��Ķ���
		for (int i = 0; i < 5; i++) {
			intcode = random.nextInt(0, str.length());   //�õ���[0��str.length() )֮��������
			//randcode2 += str.charAt(intcode);           //�õ�ָ�������λ�õ��ַ�
			randcode2.append(str.charAt(intcode));           //�õ�ָ�������λ�õ��ַ�
			//System.out.print(str.charAt(intcode));		
		}
		System.out.println("\n-----������------\n"+randcode2.toString());//0yJ1l

	}
}
