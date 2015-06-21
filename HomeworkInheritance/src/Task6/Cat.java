package Task6;
/**
 * Class for a cat that extends Pet class with kind attribute and includes
 * get, set and to string
 * @author Dado
 *
 */
public class Cat extends Pet{
	
	protected String kind;
	/**
	 * Creating cat
	 * @param name - name of a cat
	 * @param years - how old cat is
	 * @param kind - breed of a cat
	 */
	public Cat(String name, int years, String kind) {
		super(name, years, null);
		this.kind = kind;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	
	public String toString() {
		return "Go away human !!";
	}
	
}
