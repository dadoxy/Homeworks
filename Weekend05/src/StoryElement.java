/**
 * class story element including name of a story
 * @author Dado
 *
 */
public class StoryElement {
	
	protected String name;
	
	public StoryElement(String name) {
		super();
		this.name = name;
	}
	/**
	 * if not given name for story by default its STElement
	 */
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
