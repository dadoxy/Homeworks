package Weekend04TaskTwo;

public class Main {

	public static Authors getAuthorWithMostBestsellers(Authors[] authors) {
		int max = countBestsellingBooks(authors[0]);
		Authors best = authors[0];
		for (int i = 0; i < authors.length; i++) {
			if (countBestsellingBooks(authors[i]) > max) {
				max = countBestsellingBooks(authors[i]);
				best = (authors[i]);
			}
		}
		return best;

	}

	/**
	 * method for counting how many books are released by author in given period
	 * of time
	 * 
	 * @param a
	 *            - name of author
	 * @param year1
	 *            - starting year (including starting year)
	 * @param year2
	 *            - ending year (including ending year)
	 * @return - returning number of books released in give period of time
	 */
	public static int getNumberOfWrittenBooks(Authors a, int year1, int year2) {
		int counter = 0;
		for (int i = 0; i < a.books.length; i++) {
			if (a.books[i].year >= year1 && a.books[i].year <= year2) {
				counter++;
			}
		}
		return counter;
	}

	/**
	 * Method for counting how many bestsellers author have
	 * 
	 * @param a
	 *            - name of author
	 * @return - number of bestselling books
	 */
	public static int countBestsellingBooks(Authors a) {
		int counter = 0;
		for (int i = 0; i < a.books.length; i++) {
			if (a.books[i].bestseller == true) {
				counter++;
			}
		}
		return counter;
	}

	public static void main(String[] args) {

		Books[] books = new Books[5];
		books[0] = new Books("book1", 1992, "Horror", true);
		books[1] = new Books("book2", 2010, "Thriller", true);
		books[2] = new Books("book3", 1995, "Fantasy", false);
		books[3] = new Books("book4", 2002, "Fantasy", true);
		books[4] = new Books("book5", 1998, "Comedy", false);
		Authors authorOne = new Authors("Author One", 1975, books);

		Books[] books2 = new Books[5];
		books2[0] = new Books("book1", 1992, "Horror", false);
		books2[1] = new Books("book2", 2010, "Thriller", false);
		books2[2] = new Books("book3", 1995, "Fantasy", true);
		books2[3] = new Books("book4", 2002, "Fantasy", true);
		books2[4] = new Books("book5", 1998, "Comedy", false);
		Authors authorTwo = new Authors("Author Two", 1968, books2);

		Books[] books3 = new Books[5];
		books3[0] = new Books("book1", 1992, "Horror", true);
		books3[1] = new Books("book2", 2010, "Thriller", true);
		books3[2] = new Books("book3", 1995, "Fantasy", true);
		books3[3] = new Books("book4", 2002, "Fantasy", true);
		books3[4] = new Books("book5", 1998, "Comedy", true);
		Authors authorThree = new Authors("Author Three", 1968, books3);

		Books[] books4 = new Books[5];
		books4[0] = new Books("book1", 1992, "Horror", false);
		books4[1] = new Books("book2", 2010, "Thriller", false);
		books4[2] = new Books("book3", 1995, "Fantasy", false);
		books4[3] = new Books("book4", 2002, "Fantasy", true);
		books4[4] = new Books("book5", 1998, "Comedy", false);
		Authors authorFour = new Authors("Author Four", 1968, books4);

		Authors[] authors = new Authors[4];
		authors[0] = (authorOne);
		authors[1] = (authorTwo);
		authors[2] = (authorThree);
		authors[3] = (authorFour);
		

		System.out.println(getAuthorWithMostBestsellers(authors));
	}

}
