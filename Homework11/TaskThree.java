package Homework11;

public class TaskThree {

	public static boolean hasNumbers(String a) {
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) >= 48 && a.charAt(i) <= 57) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		
		System.out.println(hasNumbers("dad00000"));

	}

}
