package day11.JarDemo;
import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;//����Ϊ����ĵ�����jar��
public class App {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		System.out.println(Arrays.toString(arr));
		arr = ArrayUtils.add(arr, 99);
		System.out.println(Arrays.toString(arr));
	}

}
  