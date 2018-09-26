package day21._02_print_stream;

import java.io.File;
import java.io.PrintWriter;
//×Ö·û´òÓ¡Á÷
public class PrintWriterDemo {
	public static void main(String[] args) throws Exception {
		PrintWriter ps = new PrintWriter(new File("file/out.txt"));
		ps.write("ABC");
		ps.print(true);
		ps.println();
		ps.print(18);
		ps.close();
	}
}
