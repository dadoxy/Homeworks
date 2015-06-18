package HomeWork9;

import java.util.Scanner;

public class Taskexpression {
	
		public static void main(String[] args){
	
	while(true){
		try {
			Scanner in = new Scanner(System.in);
			
			System.out.print("Enter Expression : ");
			String expr = in.nextLine();
			char sign = '0';
			int position = 0;
			
			if(expr.indexOf('+') != -1){
				sign = '+';
				position = expr.indexOf('+');
			} else if(expr.indexOf('-') != -1){
				sign = '-';
				position = expr.indexOf('-');
			} else if(expr.indexOf('*') != -1){
				sign = '*';
				position = expr.indexOf('*');
			} else if(expr.indexOf('/') != -1){
				sign = '/';
				position = expr.indexOf('/');
			}
		
			String Number = expr.substring(0, position);
			String Number2 = expr.substring(position + 1, expr.length());
			
			int num = Integer.parseInt(Number.trim());
			int num2 = Integer.parseInt(Number2.trim());
			
			
			switch (sign) {
			case '+':
				System.out.println("Result : " + (num + num2));
				break;
			case '-':
				System.out.println("Result : " + (num - num2));
				break;
			case '*':
				System.out.println("Result : " + (num * num2));
				break;
			case '/':
				System.out.println("Result : " + (num / num2));
				break;
			}
			in.close();
			break;
			
		} catch (NumberFormatException e) {
			System.out.println("Wrong input !! ");
		}
		
	}
}

}

