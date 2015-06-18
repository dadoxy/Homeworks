package Weekend04TaskThree;

public class Class {
	/**
	 * class for creating school class
	 */
	public String name;
	public Integer numOfStudents;
	public Class(String name, Integer numOfStudents) {
		
		this.name = name;
		this.numOfStudents = numOfStudents;
	}
	
	public String toString() {
		return "Class : " + name + "Number of students" + numOfStudents;
	}
	
}
