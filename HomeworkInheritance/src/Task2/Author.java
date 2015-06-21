package Task2;
/**
 * Class author with all standard methods
 * @author Dado
 *
 */
public class Author {
	/**
	 * Author atributes including name, e mail and gender ( M or F)
	 */
	protected String name;
	protected String mail;
	protected char gender;
	/**
	 * For creating author
	 * @param name - name of author
	 * @param mail - email of author
	 * @param gender - gender male of female ( M or F)
	 */
	public Author(String name, String mail, char gender) {
		super();
		this.name = name;
		this.mail = mail;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String toString() {
		return "Author: " + name + ", mail: " + mail + ", gender: " + gender;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Author))
			return false;
		Author other = (Author) obj;
		if (gender != other.gender)
			return false;
		if (mail == null) {
			if (other.mail != null)
				return false;
		} else if (!mail.equals(other.mail))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
