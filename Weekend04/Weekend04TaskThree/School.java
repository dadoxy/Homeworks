package Weekend04TaskThree;

import java.util.Arrays;

public class School {
	/**
	 * class for creating school
	 */
	public String name;
	public Director director;
	public Class[] Class;
	public School(String name, Director director,
			Weekend04TaskThree.Class[] class1) {
		
		this.name = name;
		this.director = director;
		Class = class1;
	}
	
	public String toString() {
		return "School : " + name + "Director : " + director + "Class : "
				+ Arrays.toString(Class);
	}

}
