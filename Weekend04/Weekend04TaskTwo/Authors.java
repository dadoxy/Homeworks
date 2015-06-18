package Weekend04TaskTwo;

import java.util.Arrays;

public class Authors {
	
	String authorName;
	Integer yearOfBirth;
	Books books[];
	/**
	 * Method for creating authors
	 * @param authorName 
	 * @param yearOfBirth
	 * @param books
	 */
	public Authors(String authorName, Integer yearOfBirth, Books[] books) {
		
		this.authorName = authorName;
		this.yearOfBirth = yearOfBirth;
		this.books = books;
	}

	public String toString() {
		return "Author : " + authorName + ", Birth :"
				+ yearOfBirth + ", Books :" + Arrays.toString(books) ;
	}
	
	
}
