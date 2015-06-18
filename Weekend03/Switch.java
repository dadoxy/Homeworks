package Weekend03;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.println("Enter Hours : ");
		int input = in.nextInt();
		
		switch (input){
		case 9 : case 10 : case 11 : case 12 : case 13: 
			System.out.println("Predavanja !!");
			break ;
		case 14 : case 15 : case 16 : case 17 :
			System.out.println("Vjezbe !!");
			break ;
		case 18 : case 19 : case 20: case 21 : case 22 : case 23 : case 1:
			System.out.println("Zadaca !!");
			break ;
			default :
				System.out.println("Spavanje");
		}

	}

}
