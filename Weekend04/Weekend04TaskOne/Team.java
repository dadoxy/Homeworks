package Weekend04TaskOne;

import java.util.Arrays;

public class Team {
	/*
	 * Team class
	 */
	String teamName;
	Player players[];
	/**
	 * Method for creating teams
	 * @param teamName
	 * @param players
	 */
	public Team(String teamName, Player[] players) {
		super();
		this.teamName = teamName;
		this.players = players;
	}

	public String toString() {
		return "Team name : " + teamName + " Players : "
				+ Arrays.toString(players);
	}

}
