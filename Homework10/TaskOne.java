package Homework10;

import java.util.Arrays;

public class TaskOne {

	public static void main(String[] args) {
		
		int[] array = new int[100];
		int restart = 0;
	
		for (int i = 0; i < array.length; i++) {
			array[i] = restart;
			restart++;
			if(restart == 10){
				restart = 0;
			}
		}

		System.out.println("Array: " + Arrays.toString(array));
	}
}
