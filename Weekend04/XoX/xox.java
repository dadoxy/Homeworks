package XoX;

import java.util.InputMismatchException;
import java.util.Scanner;

public class xox {

	/**
	 * Method printing table for XoX game
	 * 
	 * @param table
	 *            - size of table for XoX game ^_^
	 */
	public static void printTable(char[][] table) {
		for (int i = 0; i < table.length; i++) {
			System.out.print(" --");
		}
		System.out.println();
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				System.out.print("| " + table[i][j]);
			}
			System.out.print("|");
			System.out.println();
			for (int k = 0; k < table.length; k++) {
				System.out.print(" --");
			}
			System.out.println();
		}
	}

	/**
	 * Method for creating table with user input
	 * 
	 * @return - table size defined by user with empty spaces
	 */
	public static char[][] tableSize() {
		Scanner in = new Scanner(System.in);

		while (true) {
			try {
				System.out.println("Enter size of table");
				int input = in.nextInt();

				char table[][] = new char[input][input];
				for (int i = 0; i < table.length; i++) {
					for (int j = 0; j < table[i].length; j++) {
						table[i][j] = ' ';
					}

					return table;
				}
			} catch (InputMismatchException e) {
				System.out.println("Enter positive number !");

			}
		}
	}

	/**
	 * Method for checking for empty spaces in table
	 * 
	 * @param table
	 *            - table defined by user
	 * @return - returning is table full or there is still empty spaces
	 */
	public static boolean noMoreEmptySpace(char[][] table) {
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				if (table[i][j] == ' ') {
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * Method for checking columns for x and ox
	 * 
	 * @param table
	 *            - table for xOx game
	 * @param j
	 *            - column
	 * @param xOx
	 *            - checking for xOx in column
	 * @return - are all elements equal with xOx or different
	 */
	public static boolean checkingColumns(char table[][], int j, char xOx) {
		boolean columns = false;
		for (int i = 0; i < table.length; i++) {
			columns = table[i][j] != xOx ? false : true;

		}
		return columns;
	}

	/**
	 * Method for checking rows for x and ox
	 * 
	 * @param table
	 *            - table for xOx game
	 * @param i
	 *            - row
	 * @param xOx
	 *            - checking xOx in row
	 * @return - are all elements equal with xOx or different
	 */
	public static boolean checkingRows(char table[][], int i, char xOx) {
		boolean rows = false;
		for (int j = 0; j < table.length; j++) {
			rows = (xOx != table[i][j]) ? false : true;

		}
		return rows;
	}

	/**
	 * Checking positive diagonal for x and ox
	 * 
	 * @param table
	 *            - table for xOx game
	 * @param xOx
	 *            - checking for xOx in positive diagonal
	 * @return - are all elements equal with xOx or different
	 */
	public static boolean checkingPositiveDiagonal(char table[][], char xOx) {
		boolean positive = false;
		for (int i = 0; i < table.length; i++) {

			positive = xOx != table[i][i] ? false : true;
		}
		return positive;
	}

	/**
	 * Checking negative diagonal for x and ox
	 * 
	 * @param table
	 *            - table for xOx game
	 * @param xOx
	 *            - checking for xOx in negative diagonal
	 * @return- are all elements equal with xOx or different ^_^
	 */
	public static boolean checkingNegativeDiagonal(char table[][], char xOx) {
		boolean negative = false;
		for (int i = 0, j = table.length - 1; i < table.length; i++, j--) {
			negative = xOx != table[i][j] ? false : true;
		}
		return negative;
	}

	/**
	 * Method for checking which player plays and choosing symbol
	 * 
	 * @param counter
	 *            - plays
	 * @return - player X or player O
	 */
	public static char xOxPlayer(int counter) {
		char player = counter % 2 != 0 ? 'X' : 'O';
		return player;
	}
	/**
	 * Method for playing game checking is wanted space in table already taken
	 * @param table - table for playing xOx game
	 * @param xOxPlayer - player X or O
	 * @return - if someone wins game
	 */
	public static boolean gameOn(char table[][], char xOxPlayer) {
		Scanner in = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("Player " + xOxPlayer + " turn!");
				System.out.println("Input number of row : ");
				int input = in.nextInt();
				System.out.println("Input number of column : ");
				int input1 = in.nextInt();
				if (table[input][input1] == ' ') {
					table[input][input1] = xOxPlayer;
				 if (checkingRows(table, input, xOxPlayer) == true) {
					return true;
				} else if (checkingColumns(table, input1, xOxPlayer)) {
					return true;
				} else if (checkingPositiveDiagonal(table, xOxPlayer)) {
					return true;
				} else if (checkingNegativeDiagonal(table, xOxPlayer)) {
					return true;
				} else
					return false;
				}else
					System.out.println("Not an empty space !!");

			} catch (InputMismatchException e) {
				System.out.println("Only numbers !!");
				in.nextLine();
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Out of range !!");
			}
		}
	}

	public static void main(String[] args) {

		System.out.println("Welcome !! ^_^");
		int counter = 1;
		boolean game = false;
		char[][] table = tableSize();
		printTable(table);
		char xOxPlayer = xOxPlayer(counter);
		
		while (true){
			if (noMoreEmptySpace(table) == false){
				xOxPlayer = xOxPlayer(counter);
				game = gameOn(table, xOxPlayer);
				if(game == true){
					printTable(table);
					System.out.println("Winner is " + xOxPlayer);
					break;
				}else{
					printTable(table);
					counter++;
				}
			}else{
				System.out.println("Draw !!");
				break;
			}
				
		}
	}

}
