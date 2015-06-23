
public class StoryElement {
	
	protected String name;
	
	public StoryElement(String name) {
		super();
		this.name = name;
	}
	
	public StoryElement(){
		this("STElement");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
