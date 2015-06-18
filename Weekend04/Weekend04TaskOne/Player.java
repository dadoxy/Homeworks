package Weekend04TaskOne;

public class Player {
	/**
	 * Player class
	 */
	String playerName;
	Integer birth;
	String position;
	/**
	 * Method for creating players
	 * @param playerName
	 * @param birth
	 * @param position
	 */
	public Player(String playerName, Integer birth, String position) {
		
		this.playerName = playerName;
		this.birth = birth;
		this.position = position;
	}
	
	public String toString() {
		return "Player name : " + playerName + ", " + birth
				+ ", position : " + position;
	}
	

}
