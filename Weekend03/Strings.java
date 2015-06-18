package Weekend03;

import java.util.Scanner;

public class Strings {
	
	public static boolean anagrams(String s1, String s2){
		if(s1.length() != s2.length() || !charsInSecond(s1, s2) || !charsInSecond(s2, s1)){
			return false;
		}
		return true;
		
	}
	
	public static String secondAlphabetic(String s1, String s2) {

		int compare = s1.compareTo(s2);

		if (compare < 0) {
			return s2;
		} else {
			return s1;
		}
	}


	public static void firstSecondLetter(String s1, String s2) {

		String s = "";
		int num1 = s1.length();
		int num2 = s2.length();

		if (num2 < num1) {

			
			for (int i = 0; i < s2.length(); i++) {
				char first = s1.charAt(i);
				char second = s2.charAt(i);
				s = s + first + second;
			}
			
			String s3 = "";
			for (int i = num1 - 1; i > num2 - 1; i--) {
				char first = s1.charAt(i);
				s3 = first + s3;
			}
			
			s = s + s3;
			System.out.println(s);

		} else {
			
			for (int i = 0; i < s1.length(); i++) {
				char first = s1.charAt(i);
				char second = s2.charAt(i);
				s = s + first + second;
			}
			
			String s3 = "";
			for (int i = num2 - 1; i > num1 - 1; i--) {
				char second = s2.charAt(i);
				s3 = second + s3;
			}
			
			s = s + s3;
			System.out.println(s);
		}
	}
	
	public static boolean charsInSecond(String s1, String s2) {

		int counter = 0;
		for (int i = 0; i < s1.length(); i++) {
			for (int j = 0; j < s2.length(); j++) {
				char first = s1.charAt(i);
				char second = s2.charAt(j);
				if (first == second) {
					counter++;
					break;
				}
			}
		}
		if (counter == s1.length()) {
			return true;
		} else
			return false;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter first sentence : ");
		String s1 = in.nextLine();
		System.out.println("Enter second sentence ");
		String s2 = in.nextLine();

		System.out.print("Combined : ");
		firstSecondLetter(s1, s2);
		
		System.out.println(charsInSecond(s1, s2));
		
		System.out.println(secondAlphabetic(s1,s2));
		
		System.out.println(anagrams("kkk", "sss"));

	}

}
