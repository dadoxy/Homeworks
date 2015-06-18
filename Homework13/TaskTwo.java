package Homework13;

public class TaskTwo {

	public static void main(String[] args) {
		
		printMin(args);
	}

	/**
	 * Method for finding Min number in array.
	 * @param args - Arguments in array
	 * 
	 * @exception - Only numbers 
	 */
	public static void printMin(String[] args) {
		int min = 0;
		try {
			if (args.length != 0) {
				min = Integer.parseInt(args[0]);
			}
			for (int i = 1; i < args.length; i++) {
				if (min > Integer.parseInt(args[i])) {
					min = Integer.parseInt(args[i]);
				}
			}
			if (args.length != 0) {
				System.out.println("Min. number is " + min + "!");
			}
		} catch (Exception e) {
			System.out.println("Please enter only numbers! " + e.getMessage());
			
		}
	}

}
