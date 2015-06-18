package Homework14;

public class TaskThree {

	public static void main(String[] args) {
		int[][] arr2d = { { 1, 2, 1 }, { 5, 2, 8 }, { -4, 2, 3 } };

		// checking method for max points from position
		System.out.print("Max points from this position is ");
		System.out.println(getMaxPoints(arr2d, 0, 0));

	}
	/**
	 * Method for calculating max points for chess knight in one move
	 * @param matrix - given matrix with all its elements
	 * @param x - coordinate in of knight
	 * @param y - coordinate in matrix of knight
	 * @return - returning max points from that spot
	 */
	public static int getMaxPoints(int[][] matrix, int x, int y) {

		// Possible position in matrix 3X3
		if (x == 1 && y == 1) {
			return matrix[1][1];
		} else if (x == 0 && y == 0) {
			if (matrix[1][2] > matrix[2][1]) {
				return matrix[1][2];
			} else
				return matrix[2][1];
		} else if (x == 0 && y == 1) {
			if (matrix[2][0] > matrix[2][2]) {
				return matrix[2][0];
			} else
				return matrix[2][2];
		} else if (x == 0 && y == 2) {
			if (matrix[1][0] > matrix[2][1]) {
				return matrix[1][0];
			} else
				return matrix[2][1];
		} else if (x == 1 && y == 0) {
			if (matrix[0][2] > matrix[2][2]) {
				return matrix[0][2];
			} else
				return matrix[2][2];
		} else if (x == 1 && y == 2) {
			if (matrix[0][0] > matrix[2][0]) {
				return matrix[0][0];
			} else
				return matrix[2][0];
		} else if (x == 2 && x == 0) {
			if (matrix[1][2] > matrix[0][1]) {
				return matrix[1][2];
			} else
				return matrix[0][1];
		} else if (x == 2 && y == 1) {
			if (matrix[0][0] > matrix[2][2]) {
				return matrix[0][0];
			} else
				return matrix[2][2];
		} else {
			if (matrix[0][1] > matrix[1][0]) {
				return matrix[0][1];
			} else
				return matrix[1][0];
		}

	}
}
