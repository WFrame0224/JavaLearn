package come.commonclasses;
import java.util.Scanner;

//Ê¹ÓÃScannerÉ¨ÃèÆ÷
public class ScannerDemo {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.println(i);
	}
}
  