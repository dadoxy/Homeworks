package Homework10;

import java.util.Scanner;

public class TaskTwo {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int[] array = new int [5];
		int[] array2 = new int [5];
		boolean same = true;
		
		System.out.print("Input first array : ");
		for (int i = 0; i < array.length; i++){
			array[i] = in.nextInt();
		}
		
		System.out.println("Input second array : ");
		for(int i = 0; i < array.length; i++){
			array2[i] = in.nextInt();
			if (array2[i] != array[i]){
				same = false;
			}
			
		}
		if(same){
				System.out.println("Arrays are same !!");
			}else {
				System.out.println("Arrays are not same !!");
			}
	}

}
