package Task2;

public class main {

	public static void main(String[] args) {
		Author authorOne = new Author("Author One", "authorOne@mail.com", 'M');
		Book bookOne = new Book("Author One", "mail", 'm', "booke one", 200, 1);
		Book bookTwo = new Book("Author One", "mail", 'm', "booke Two", 30, 2);
		Book[] books = new Book[] {bookOne,bookTwo};
		BookStore bookstore = new BookStore("Bookstore 1", books);
		
		Book bookThree = new Book("Author Three", "mailtwo", 'm', "Three", 20, 1);
		bookstore.addBook(bookThree);
		bookstore.printBooksByAuthor("Author One");
		
		
		}

	}


