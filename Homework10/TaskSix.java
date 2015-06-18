package Homework10;

import java.util.Scanner;

public class TaskSix {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Input arrays length : ");
		int lenght = in.nextInt();
		int[] array = new int[lenght];
		boolean number = false;

		System.out.println("Input values: ");
		
		for (int i = 0; i < array.length; i++) {
			array[i] = in.nextInt();
		}

		System.out.print("Input number: ");
		int lookingForNumber = in.nextInt();

		for (int i = 0; i < array.length; i++) {
			if (lookingForNumber == array[i]) {
				number = true;
				break;
			}
		}

		System.out.println(number);
	}
}