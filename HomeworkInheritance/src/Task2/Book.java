package Task2;
/**
 * Class for book that extends class author with all standard methods
 * @author Dado
 *
 */
public class Book extends Author {
	/**
	 * Attributes for book including title of a book , price and how many are in stock
	 */
	protected String bookName;
	protected double price;
	protected int stock;
	/**
	 * Creating a book !
	 * @param name - name of author
	 * @param mail - e mail of author
	 * @param gender - gender of author
	 * @param bookName - Title of a book
	 * @param price - price of a book
	 * @param stock - how many books are in stock
	 */
	public Book(String name, String mail, char gender, String bookName,
			double price, int stock) {
		super(name, mail, gender);
		this.bookName = bookName;
		this.price = price;
		this.stock = stock;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		if (stock < 0){
			throw new IllegalArgumentException("Must be positive !");
		}
		this.stock = stock;
	}

	public String toString() {
		return "Book: " + bookName + ", price: " + price + ", stock: "
				+ stock + ", Author name: " + name + ", mail: " + mail + ", gender: "
				+ gender;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Book))
			return false;
		Book other = (Book) obj;
		if (bookName == null) {
			if (other.bookName != null)
				return false;
		} else if (!bookName.equals(other.bookName))
			return false;
		if (Double.doubleToLongBits(price) != Double
				.doubleToLongBits(other.price))
			return false;
		if (stock != other.stock)
			return false;
		return true;
	}
	
	
}
