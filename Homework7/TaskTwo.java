package Homework7;

public class TaskTwo {

	public static void main(String[] args) {
		TextIO.readFile("src/S02D03/File1.txt");
		int sum = 0;
		
		for (int i = 1; i < 100;i++){
			int a = TextIO.getInt();
			
			
			if(a == -1){
				
				break;
			}else{
				
				sum += a;
			}
		}
		System.out.println(sum);
	}

}
