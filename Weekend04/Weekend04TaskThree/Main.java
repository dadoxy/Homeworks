package Weekend04TaskThree;

public class Main {
	
	public static String getNameOfSchoolWithMoreStudents(School s1, School s2){
		
		int sumOne = 0;
		int sumTwo = 0;
		for(int i = 0; i < s1.Class.length; i++){
			sumOne += s1.Class[i].numOfStudents;
		}
		for (int i = 0; i <s2.Class.length; i++){
			sumTwo += s1.Class[i].numOfStudents;
		}
		if (sumOne > sumTwo){
			return s1.name;
		}else
			return s2.name;
	}
	
	public static School getSchoolWithYoungestDirector(School[] schools){
		int min = schools[0].director.years;
		School youngestDirector = schools[0];
		for(int i = 0; i < schools.length; i++){
			if (schools[i].director.years > min){
				min = schools[i].director.years;
				youngestDirector = schools[i];
			}
		}
		return youngestDirector;
	}
	
	/**
	 * Method for checking class with highest number of students in school
	 * @param s - school you would like to be checked
	 * @return - returns name of class with highest number of students 
	 */
	public static String getNameOfClassWithTheMostStudents(School s){
		String mostStudents = s.Class[0].name;
		int max = s.Class[0].numOfStudents;
		for(int i = 0; i < s.Class.length; i++){
			if(s.Class[i].numOfStudents > max){
				max = s.Class[i].numOfStudents;
				mostStudents = s.Class[i].name;
			}
			
		}
		return mostStudents;
	}
	
	public static void main(String[] args) {
		Director directorOne = new Director("Hazim", 1962);
		Class[] classOne = new Class[3];
		classOne[0] = new Class("ClassA", 25);
		classOne[1] = new Class("ClassB", 28);
		classOne[2] = new Class("ClassC", 31);
		School schoolOne = new School("SchoolA", directorOne, classOne);
		
		Director directorTwo = new Director("Mujo", 1980);
		Class[] classTwo = new Class[3];
		classTwo[0] = new Class("Class1", 27);
		classTwo[1] = new Class("Class2", 34);
		classTwo[2] = new Class("Class3", 32);
		School schoolTwo = new School("SchoolB", directorTwo, classTwo);
		
		Director directorThree = new Director("Mujkeee", 1975);
		Class[] classThree = new Class[3];
		classThree[0] = new Class("ClassX", 22);
		classThree[1] = new Class("ClassY", 24);
		classThree[2] = new Class("ClassZ", 27);
		School schoolThree = new School("SchoolC", directorThree, classThree);
		
		School[] schools = new School[3];
		schools[0] = schoolOne;
		schools[1] = schoolTwo;
		schools[2] = schoolThree;
		
		System.out.println(getSchoolWithYoungestDirector(schools));
	
}
}
