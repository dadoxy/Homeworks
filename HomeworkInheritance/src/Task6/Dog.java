package Task6;
/**
 * Dog class that extends pet class with breed attribute including get, set and to string
 * @author Dado
 *
 */
public class Dog extends Pet{
	
	protected String breed;
	/**
	 * Creating a pet 
	 * @param name - name of a dog
	 * @param years - how old dog is
	 * @param breed - breed of a dog
	 */
	public Dog(String name, int years, String breed) {
		super(name, years, null);
		this.breed = breed;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	public String toString() {
		return "Av Av Av !!";
	}

	
}
