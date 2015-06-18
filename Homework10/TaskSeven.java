package Homework10;

import java.util.Arrays;
import java.util.Scanner;

public class TaskSeven {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int[] array = new int[100000];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100000);
		}

		Arrays.sort(array);

		System.out.println("Enter number you'd like to find : ");
		int num = in.nextInt();

		double beggining = System.currentTimeMillis();
		Arrays.binarySearch(array, num);
		double ended = System.currentTimeMillis() - beggining;
		System.out.println("It took " + ended
				+ "millis to find the number with binary search.");

		beggining = System.currentTimeMillis();
		for (int i = 0; i < array.length; i++) {
			if (num == array[i]) {
				break;
			}
		}
		ended = System.currentTimeMillis() - beggining;
		System.out.println("It took " + ended
				+ " millis to find the number with sequential search .");

	}

}
