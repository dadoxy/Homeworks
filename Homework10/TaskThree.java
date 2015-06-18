package Homework10;

import java.util.Scanner;

public class TaskThree {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int[] array = new int[5];
		int[] array2 = new int[5];
		boolean same = true;
		int tmp = 0;
		
		System.out.println("Input first array : ");
		for (int i = 0; i < array.length; i++) {
			array[i] = in.nextInt();
		}

		System.out.println("Input second array : ");
		for (int i = 0; i < array2.length; i++) {
			array2[i] = in.nextInt();
		}
		
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array2.length; j++) {
				if(array[i] == array2[j]){
					tmp = array2[j];
					array2[j] = array2[i];
					array2[i] = tmp;
				}
				
			}
			if(array[i] != array2[i]){
				same = false;
				break;
			}
		}
		if(same){
			System.out.println("Arrays are identical !!");
		} else {
			System.out.println("Not same !!");			
		}

	}

}
