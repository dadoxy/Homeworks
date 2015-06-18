package Homework8;

public class TaskTwo {

	public static void main(String[] args) {
		
		// User enters brackets and checking for brackets length
		String enterBrackets;
		System.out.print("Enter Brackets : ");
		enterBrackets = TextIO.getln();
		
		int b = enterBrackets.length();
		
		// counters for brackets
		int counterForFirst = 0;
		int counterForSecond = 0;
		
		// counting brackets for { and }
		for (int i = 0; i < b; i++){
			char c = enterBrackets.charAt(i);
			char first = '{';
			char second = '}';
			
			if (c == first){
				counterForFirst++;
			} 
			else if (c == second){
				counterForSecond++;
			}
		
		}
		
		// checking if all brackets are close or not and printing result
		if (counterForFirst != counterForSecond){
			System.out.println("Bracket is not closed.");
		} else {
			System.out.println("All closed.");

	}

}
}