package Homework8;

import java.util.Scanner;

public class TaskSeven {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of matter : ");
		int matter = in.nextInt();
		System.out.println("Enter the number of containers : ");
		int num = in.nextInt();
		int counter = 0;

		// If the number is odd add another matter and container

		if (matter % 2 != 0) {
			matter++;
			counter++;
		}

		// When sharing the matter with two if the result is equal to the number
		// of containers stop the program
		
		
		int var = matter;
		while (var % 2 == 0) {
			var /= 2;
			if (var == num) {
				break;
				
			//	In case if not go back and add another container
				
			} else if (var % 2 != 0) {
				var = matter++;
				counter++;
			}

		}
		// Printing the results and number of buy container
		
		if (counter != 0)
			System.out.printf("Mujo need to buy %d containers !!", counter);
		else
			System.out
					.println("No need for extra containers !!");



		
		}

}
