package Homework8;

import java.util.Scanner;

public class TaskThree {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Unesite broj");
		int num = in.nextInt();
		int fakt = 1;
		int digit = 0;
		int newNum = 0;
		
		for (int i = 1; i <= num; i++) {
			fakt *= i;
			if (fakt > 99) {
				digit = fakt % 10;
				if (digit == 0) {
					while (fakt > 99) {
						digit = fakt % 10;
						if (digit == 0)
							fakt /= 10;
						else
							break;
					}
				} else if (digit != 0) {
					while (fakt > 9999) {
						newNum = fakt % 10;
						newNum *= 10;
						fakt /= 10;
						newNum += fakt % 10;
						fakt = newNum % 10;
						fakt *= 10;
						newNum /= 10;
						fakt += newNum % 10;
					}
				}

			}

		}
		if (fakt > 99) {
			newNum = fakt % 10;
			newNum *= 10;
			fakt /= 10;
			newNum += fakt % 10;
			fakt = newNum % 10;
			fakt *= 10;
			newNum /= 10;
			fakt += newNum % 10;
		}
		System.out.println(fakt);

	}

}
