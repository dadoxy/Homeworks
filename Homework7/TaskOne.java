package Homework7;

public class TaskOne {

	public static void main(String[] args) {
		
		TextIO.readFile("src/S02D03/File1.in");
		
		int a = TextIO.getInt();
		int b = TextIO.getInt();
		
		for (int i = 1; i < b; i++ ){
			if (i > a){ 
			System.out.println(i);
			}
		}
	
	}
}
