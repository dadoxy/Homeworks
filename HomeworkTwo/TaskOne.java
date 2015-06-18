package HomeworkTwo;

public class TaskOne {

	public static void main(String[] args) {

		int num = 20;
		int counter = 1;
		int sum = 0;
		
		
		while (counter <= num){
			if (num % counter == 0){
				int number = 0;
				number = num / counter;
				sum ++;
			}
			counter ++ ;
		}
		System.out.println("Number is divided : "+ sum + " times !");
			

	}

}
