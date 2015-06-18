package Weekend04TaskTwo;

public class Books {

	String bookName;
	Integer year;
	String genre;
	boolean bestseller;
	/**
	 * Method for adding books
	 * @param bookName
	 * @param year
	 * @param genre
	 * @param bestseller
	 */
	public Books(String bookName, Integer year, String genre, boolean bestseller) {
		
		this.bookName = bookName;
		this.year = year;
		this.genre = genre;
		this.bestseller = bestseller;
	}
	
	public String toString() {
		return "Book :" + bookName + ", year :" + year + ", genre: "
				+ genre + ", bestseller :" + bestseller;
	}
	
	
}
