package Homework8;

		public class Movie {
		private String name;
		private Integer year;
		private String director;
		private String genere;
		private double imdb;
		private boolean oscar;
	    /**
	     * Default constructor of class Movie with parameters
	     * name
	     * year
	     * director
	     * IMBD
	     * oscar
	     */
		public Movie (String name, Integer year, String director, String genere, Double imdb, Boolean oscar){
			this.name = name;
			this.year = year;
			this.director = director;
			this.genere = genere;
			this.imdb = imdb;
			this.oscar = oscar;
	    }
		
		 // Method for converting value to string
		 
		public String toString() {
			String s = "";
			s = s + "Name: " + name + "\n";
			s = s + "Year: " + year + "\n";
			s = s + "Director: " + director + "\n";
			s = s + "Genere: " + genere + "\n";
			s = s + "Oscar: " + oscar + "\n";
			return s;
		}
	}


