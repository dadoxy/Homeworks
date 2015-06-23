
public class Character extends StoryElement {
	
	protected char gender;
	protected boolean isAlive;
	protected boolean capable;
	
	public Character(String name, char gender, boolean capable) {
		super(name);
		this.gender = gender;
		this.isAlive = true;
		this.capable = capable;
	}

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
	public void killChar(){
		isAlive = false;
	}
	public void becomeCapable(){
		capable = true;
	}
	
}
