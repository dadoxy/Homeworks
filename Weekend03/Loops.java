package Weekend03;

import java.util.Scanner;

public class Loops {
	
	public static void oddOrEven(int Range , int N, int Q) {
		
		if (Range % 2 == 0) {
			for (int i = N; i < Q; i++) {
				if (i % 2 == 0) {
				System.out.println(i);
				}
			}
		} else {
			for (int i = N; i < Q; i++) {
				if (i % 2 != 0) {
				System.out.println(i);

				}
			}
		}
	}

	public static int swap(int n) {

		String number = String.valueOf(n);
        String swappedNumber;
        if (number.length() == 1) {
            swappedNumber = number;
        } else {
            char firstNum = number.charAt(0);
            char lastNum = number.charAt(number.length() - 1);
            String remaining = number.substring(1, number.length() - 1);
            swappedNumber = lastNum + remaining + firstNum;
        }
        int q = Integer.parseInt(swappedNumber);
        return q;
	}

	public static int numberOfNumbers(int n) {
		int counter = 1;
		while (counter <= n) {
			n /= 10;
			counter++;
		}
		return counter;
	}

	public static void comma(int n) {

		String s = "";
		int counter = 0;
		while(n > 0){
			if(counter == 3){
				s = "," + s;
				counter = 0;
			}
			s = n % 10 + s;
			n /= 10;
			counter++;
		}
		System.out.println(s);
	}

	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number : ");
		int input = in.nextInt();

		comma(input);
		System.out.println("There are : " + numberOfNumbers(input) + " numbers !");
		System.out.println(swap(input));
		
		System.out.println(" Even / Odd numbers : ");
		oddOrEven( 2,10, 20);
	}

}
