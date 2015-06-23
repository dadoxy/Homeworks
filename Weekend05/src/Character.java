
public class Character extends StoryElement {
	
	protected char gender;
	protected boolean isAlive;
	protected boolean capable;
	/**
	 * Creating a character
	 * @param name - name of a character
	 * @param gender - gander char ( F or M )
	 * @param capable - abilities of character true or false
	 */
	public Character(String name, char gender, boolean capable) {
		super(name);
		this.gender = gender;
		this.isAlive = true;
		this.capable = capable;
	}
	/**
	 * Method to get gender
	 * @return - gender of a character
	 */
	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	public boolean isCapable() {
		return capable;
	}

	public void setCapable(boolean capable) {
		this.capable = capable;
	}
	/**
	 * Method for killing character
	 */
	public void killChar(){
		isAlive = false;
	}
	/**
	 * Method to set characters abilities true
	 */
	public void becomeCapable(){
		capable = true;
	}
	
}
