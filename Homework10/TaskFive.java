package Homework10;

import java.util.Arrays;
import java.util.Scanner;

public class TaskFive {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Enter arrays length");
		int num = in.nextInt();
		String[] arr = new String[num];
		
		System.out.println("Enter array numbers : ");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = in.nextLine();
		}
		
		int[] counter = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			String str = arr[i];
			for (int j = 0; j < str.length(); j++) {
				char number = str.charAt(j);
				switch (number) {
				case '0':
					counter[0]++;
					break;
				case '1':
					counter[1]++;
					break;
				case '2':
					counter[2]++;
					break;
				case '3':
					counter[3]++;
					break;
				case '4':
					counter[4]++;
					break;
				case '5':
					counter[5]++;
					break;
				case '6':
					counter[6]++;
					break;
				case '7':
					counter[7]++;
					break;
				case '8':
					counter[8]++;
					break;
				case '9':
					counter[9]++;
					break;
				}
			}
		}
		  System.out.println(Arrays.toString(counter));
}
}
