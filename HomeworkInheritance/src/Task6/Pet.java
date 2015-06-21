package Task6;
/**
 * Pet class with attributes name years and type of a pet and including getters,
 * setters and to string
 * @author Dado
 *
 */
public class Pet {
	
	protected String name;
	protected int years;
	protected String type;
	/**
	 * Creating a pet with name years and its type
	 * @param name - name of a pet
	 * @param years - how old pet is
	 * @param type - type of a pet
	 */
	public Pet(String name, int years, String type) {
		super();
		this.name = name;
		this.years = years;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYears() {
		return years;
	}
	public void setYears(int years) {
		this.years = years;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String toString() {
		return "Pet name: " + name + ", years: " + years + ", type: " + type;
	}
	
	
}
