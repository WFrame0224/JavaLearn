package come.commonclasses;

import java.io.Console;

//只适用于控制台中，不能在Ecilpse工具中使用
public class ConsoleDemo {
	public static void main(String[] args) {
		Console console = System.console();
		//读取用户输入的一行数据
		String line = console.readLine();
		System.out.println(line);
	}
}
