package HomeWork9;

import java.util.Scanner;

public class TaskOne {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number 1 - 7 : ");
		int num = in.nextInt();
		
		switch (num){
		case 1 : case 2 : case 3 : case 4 : case 5:
			System.out.println("Work Day !!");
			break;
		case 6 : case 7 :
			System.out.println("Weekend !!");
			break ;
			default : 
				System.out.println("Incorrect number !");
		}

	}

}
