package day21._02_print_stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

//×Ö½Ú´òÓ¡Á÷
public class PrintStreamDemo {
	public static void main(String[] args) throws Exception {
		PrintStream ps = new PrintStream(new File("file/out.txt"));
		ps.write("ABC".getBytes());
		ps.print(true);
		ps.println();
		ps.print(17);
		 
		ps.close();
	}
}
