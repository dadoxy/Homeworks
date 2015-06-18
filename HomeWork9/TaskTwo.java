package HomeWork9;

import java.util.Scanner;

import HomeWork9.TextIO;

public class TaskTwo {

	public static void main(String[] args) {
		String input = "";
		Scanner in = new Scanner (System.in);
		int x = 1;
	try {
		
		System.out.println("Enter name of file : ");
		input = in.nextLine();
		TextIO.readFile(input);
		int a = TextIO.getInt();
		for (int i = a; i > 0;i--){
			x *= i;
		}
		System.out.println("Faktorial is : " + x);
	}catch (IllegalArgumentException e){
		System.out.println("File does not exist or there is no digit first !");
		
	}
	
	}
}
