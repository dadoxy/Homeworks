package Homework7;

public class TaskFour {

		
		public static void main(String[] args) {
			TextIO.writeFile("src/S02D03/File4.in");
			
			int n = 0;
			int num = 0;
			int lookingForNumber = 0;
			boolean a = true;
			
		
			System.out.print("How many numbers do you want to enter : ");
			n = TextIO.getInt();
			System.out.print("Inster number that you are looking for :  ");
			lookingForNumber = TextIO.getInt();
			
			
			for(int i = 0; i < n; i++){
				System.out.print("Insert number : ");
				num = TextIO.getInt();
				TextIO.putln(num);
					
					if(num==lookingForNumber)
							a = true;
					}
			
			if(a == true) {
				System.out.println("Number exist !!");
			} else {
				System.out.println("That number does not exist !!");
			}
	}

}
