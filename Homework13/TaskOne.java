package Homework13;

public class TaskOne {

	public static void main(String[] args) {
		
		// Values to convert 
		System.out.println(convertToKelvins(100));
		System.out.println(convertToKelvins(15.85));
		System.out.println(convertToKelvins(-15.15));
	}

	/**
	 * Method converting temperature from Celsius to Kelvins !
	 * @param celsius - Value of temperature in Celsius
	 * @return - Temperature in Kelvins
	 */
	public static double convertToKelvins(double celsius) {
		return celsius + 273.15;
	}

}
