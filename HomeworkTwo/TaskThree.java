package HomeworkTwo;

public class TaskThree {

	public static void main(String[] args) {
		int num = 7 ;
		int sum = 0;
		int counter = 1;
		while (counter < num){
			
			if ( num % counter == 0){
			sum += counter;
			
			}
		counter ++;
		}
		if (sum==num)
		System.out.println("Number is perfect !!");
		else
			System.out.println("Number is not perfect !!");
	}

}
