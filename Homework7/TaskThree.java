package Homework7;

public class TaskThree {

	public static void main(String[] args) {

		TextIO.readFile("src/S02D03/File3.in");
		int a = TextIO.getInt();
		int b;
		int min = a;

		for (int i = 2; i <= a + 2; i++) {
			b = TextIO.getInt();

			if (b < min)
				min = b;
		}
		System.out.println(min);

	}

}
