package Homework7;

public class TaskFive {

	public static void main(String[] args) {
		TextIO.readFile("src/S02D03/decimal.in");
		
		int decimal = 0;
		decimal = TextIO.getInt();
		
		String binary = Integer.toBinaryString(decimal);
		
		TextIO.writeFile("src/S02D03/binary.out");
		TextIO.put(binary);
	}

}
