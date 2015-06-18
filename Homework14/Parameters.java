package Homework14;

import java.util.Scanner;

public class Parameters {
	public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	System.out.print("Input integer : ");
	int num1 = in.nextInt();
	System.out.println("Square : " + sqr(num1));
	
	System.out.print("Input double : ");
	double num2 = in.nextDouble();
	System.out.println("Square is : " + sqr(num2));
	
	System.out.print("Input number : ");
	int num3 = in.nextInt();
	System.out.print("Input second number: ");
	int num4 = in.nextInt();
	System.out.println(product(num3, num4));
	
	System.out.print("Input double : ");
	double num5 = in.nextDouble();
	System.out.print("Input second double : ");
	double num6 = in.nextDouble();
	System.out.println(product(num5, num6));
	

	
}

/**
 * Returns square of integer number
 * 
 * @param num
 * @return square
 */
public static int sqr(int num) {
	int square = num * num;
	return square;
}

/**
 * Returns the square of double number
 * 
 * @param num
 * @return square
 */
public static double sqr(double num) {
	double square = num * num;
	return square;
}

/**
 * Returns product of two numbers
 * 
 * @param num1
 * @param num2
 * @return product
 */

/**
 * Returns product of two double numbers
 * 
 * @param num1
 * @param num2
 * @return product
 */
public static int product(int num1, int num2) {
	int prod = num1 * num2;
	return prod;

}

public static double product(double num1, double num2) {
	double prod = num1 * num2;
	return prod;

}
}
