package Homework11;

public class TaskTwo {
	
	public static char getGrade(int score) {
		
		score = (score - 4) / 10;
		switch (score) {
		case 9:
			return 'A';
		case 8:
			return 'B';
		case 7:
			return 'C';
		case 6:
			return 'D';
		case 5:
			return 'E';
		default:
			return 'F';
		}
	}

	public static void main(String[] args) {
		
		System.out.println(getGrade(54));

	}

}
