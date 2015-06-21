package Task2;

import java.util.Arrays;
/**
 * Class for bookstore ! with all standrad methods
 * @author Dado
 *
 */
public class BookStore {
	/*
	 * Attributes for a bookstore including name of a bookstore and books array
	 */
	protected String name;
	protected Book[] books;
	/**
	 * Creating a bookstore 
	 * @param name - name of a bookstore
	 * @param books - books in the bookstore in array
	 */
	public BookStore(String name, Book[] books) {
		super();
		this.name = name;
		this.books = books;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Book[] getBooks() {
		return books;
	}

	public void setBooks(Book[] books) {
		this.books = books;
	}
	/**
	 * Method for adding new book in a book store 
	 * @param book - book you would like to add
	 */
	public void addBook(Book book){
		Book[] newBook = new Book[books.length + 1];
		for (int i = 0; i < books.length; i++){
			newBook[i] = books[i];
		}
		newBook[newBook.length - 1] = book;
		books = newBook;
	}
	
	public String toString() {
		return super.toString() + "BookStore [name=" + name + ", books=" + Arrays.toString(books)
				+ "]";
	}
	/**
	 * Method for printing all books in a bookstore
	 */
	public void printBooks(){
		for (int i = 0; i < books.length; i++){
			System.out.println(books[i]);
		}
	}
	/**
	 * Method for selling books 
	 * @param bookName - book title you wish to sell
	 */
	public void sellBooks(String bookName){
		for (int i = 0; i < books.length; i++){
			if (books[i].getBookName().equals(bookName) && books[i].getStock() > 0){
				System.out.println("Book sold");
				books[i].stock = books[i].stock - 1;
			}else if (books[i].stock <= 0){
				System.out.println("No book in store");
			}
		}
	}
	/**
	 * Method for printing all books by given author
	 * @param authorName
	 */
	public void printBooksByAuthor(String authorName){
		for (int i = 0; i < books.length; i++){
			if (books[i].getName().equals(authorName)){
				System.out.println(books[i]);
			}
		}
	}
}
