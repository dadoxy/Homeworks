package Homework14;

public class TaskOne {
	/**
	 * Method for counting how many times number repeats in matrix 
	 * @param matrix - size of matrix with all elements
	 * @param number - number u would like to check how many times is repeated in matrix
	 * @return - counter that tells you how many times number is repeated
	 */
	public static int countNumber (int[][] matrix, int number){
		int counter = 0;
		for (int i = 0; i < matrix.length; i++){
			for (int j = 0; j < matrix[i].length; j++){
				if (matrix[i][j] == number){
					counter++;
				}
			}
		}
	return counter;
	}
	
	public static void main(String[] args) {
		// initializing matrix with elements
		int[][] matrix = {{1,2,3} , {4,5,6}, {4,4,1}};
		// number that method looking for
		int number = 1;
		// calling method to do a job for us ^_^
		System.out.println(countNumber(matrix, number));
	}

}
