package day11.KnowEclipse;

import java.util.Arrays;

public class App {
	public static void main(String[] args) {
		System.out.println("Beging.....");
		int[] arr = {1,2,3,4,5,6,7,8,9,10}; 
		int index = Arrays.binarySearch(arr , 6);
		System.out.println(index);
		System.out.println("Ending....");
	}
} 
