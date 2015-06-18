package Homework11;

public class TaskFive {

	public static String getNumbersOnly(String a) {
		String a1 = "";
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) >= 48 && a.charAt(i) <= 57) {
				
				a1 += a.charAt(i);
			}
		}
		return a1;
	}

	public static void main(String[] args) {

		System.out.println(getNumbersOnly("11sdk.,;.- 12 sdfg"));

	}

}
