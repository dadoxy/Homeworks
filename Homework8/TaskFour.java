package Homework8;

public class TaskFour {

	public static void main(String[] args) {

		// reading encoded file
		TextIO.readFile("src/homeworkEight/encodedFile.in");

		// getting first line of encoded file
		int n = TextIO.getlnInt();

		// for loop for getting line by line from file
		for (int i = 1; i <= n; i++) {
			String paragraph = TextIO.getln();
			// checking line length
			int l = paragraph.length();
			/*
			 * checking chars in file and converting them to number for adding 1
			 * and converting them back in chars for printing
			 */
			for (int j = 0; j < l; j++) {
				char c = paragraph.charAt(j);
				int number = c - 1;
				c = (char) number;
				System.out.print(c);
			}
			System.out.println();
		}

	}

}
