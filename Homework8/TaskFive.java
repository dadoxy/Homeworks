package Homework8;

public class TaskFive {

	public static int getNextOddNumber(int num) {
		// checking if number is odd or even and adding needed numbers to get
		// next odd one.
		if (num % 2 == 0) {
			num = num + 1;
		} else
			num = num + 2;
		// returning next odd number
		return num;
	}

	public static double getAreaOfCircle(int diameter) {
		// calculation of area for circle and returning its value
		double area = (diameter / 2) * (diameter / 2) * Math.PI;
		return area;
	}

	public static boolean isInRange(int start, int finish, int n) {
		// assuming that number is in range
		boolean numIsInRange = true;
		// checking if number is in range and returning true if it is and false
		// if not
		if (start < n && n < finish) {
			numIsInRange = true;
		} else
			numIsInRange = false;
		return numIsInRange;
	}

	public static void main(String[] args) {
		
		// printing next odd number and adding parameter
		System.out.println("Next odd number is: ");
		System.out.println(getNextOddNumber(3));

		// same as previous just for area of circle
		System.out.println("Area of circle is: ");
		System.out.println(getAreaOfCircle(4));
		
		// printing if number is in range 
		System.out.println("Number is in range: ");
		System.out.println(isInRange(1, 5, 2));

	}

}
