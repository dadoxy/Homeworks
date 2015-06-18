package Homework14;

public class TaskTwo {
	/**
	 * Method for sum of rows in given array
	 * @param matrix - given array with all elements
	 * @param i - constant for extracting rows
	 * @return - sum of rows in given array
	 */
	public static int sumOfRows(int[][] matrix, int i) {

		int sum = 0;
		for (int j = 0; j < matrix.length; j++) {
			sum += matrix[i][j];
		}
		return sum;

	}
	/**
	 * Method for sum of columns in given array
	 * @param matrix - given array with all elements
	 * @param j - constant for extracting columns
	 * @return - sum of columns
	 */
	public static int sumOfcolumns(int[][] matrix, int j) {

		int sum = 0;
		for (int i = 0; i < matrix.length; i++) {
			sum += matrix[i][j];
		}
		return sum;

	}
	/**
	 * Method for counting how many sums of columns and rows are zeroes in given array
	 * @param matrix - given array with all elements
	 * @return - returning zeroes
	 */
	public static int getNumOfZeroRowsAndColumns(int[][] matrix) {
		int counter = 0;
		// rows
		for (int i = 0; i < matrix.length; i++) {

			if (sumOfRows(matrix, i) == 0)
				counter++;
		}
		// columns
		for (int j = 0; j < matrix.length; j++) {

			if (sumOfcolumns(matrix, j) == 0)
				counter++;

		}
		return counter;

	}

	public static void main(String[] args) {
		int[][] arr = { { 1, -2, 1 }, { 5, 0, 4 }, { -4, 2, 2 } };
		System.out.println(getNumOfZeroRowsAndColumns(arr));

	}

}