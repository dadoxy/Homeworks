
public class Goal extends StoryElement {
	public static final int EASY = 1;
	public static final int MEDIUM = 2;
	public static final int HARD = 3;
	
	protected int dificulty;
	protected Event event;
	protected Character character;
	public Goal(String name, int dificulty, Event event, Character character) {
		super(name);
		this.dificulty = dificulty;
		this.event = event;
		this.character = character;
	}
	public int getDificulty() {
		return dificulty;
	}
	public void setDificulty(int dificulty) {
		this.dificulty = dificulty;
	}
	public Event getEvent() {
		return event;
	}
	public void setEvent(Event event) {
		this.event = event;
	}
	public Character getCharacter() {
		return character;
	}
	public void setCharacter(Character character) {
		this.character = character;
	}
	
	public String dificultyToString(){
		if (dificulty == EASY){
			return "Dificulty is easy !";
		}else if (dificulty == MEDIUM){
			return "Dificulty is medium !";
		}else if (dificulty == HARD){
			return "Dificulty is hard !";
		}else
			return "";
	}
	@Override
	public String toString() {
		return "Goal dificulty=" + dificulty + ", event=" + event
				+ ", character=" + character + ", name=" + name;
	}
	
	
}
