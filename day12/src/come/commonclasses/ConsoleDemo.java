package come.commonclasses;

import java.io.Console;

//ֻ�����ڿ���̨�У�������Ecilpse������ʹ��
public class ConsoleDemo {
	public static void main(String[] args) {
		Console console = System.console();
		//��ȡ�û������һ������
		String line = console.readLine();
		System.out.println(line);
	}
}
