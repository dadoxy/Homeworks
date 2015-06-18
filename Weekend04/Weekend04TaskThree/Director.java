package Weekend04TaskThree;

public class Director {
	/**
	 * class for creating director of school
	 */
	public String name;
	public Integer years;
	public Director(String name, Integer years) {
		
		this.name = name;
		this.years = years;
	}
	
	public String toString() {
		return "Director : " + name + " Years : " + years;
	}
	
	
}
