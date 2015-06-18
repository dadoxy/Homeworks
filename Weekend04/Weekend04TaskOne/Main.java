package Weekend04TaskOne;

public class Main {
	/**
	 * Method for fining youngest player in team.
	 * 
	 * @param t
	 * @return
	 */
	public static Player getYoungestPlayer(Team t) {
		int min = t.players[0].birth;
		Player youngest = null;
		for (int i = 1; i < t.players.length; i++) {
			if (t.players[i].birth > min) {
				min = t.players[i].birth;
				youngest = t.players[i];
			}
		}
		return youngest;
	}

	/**
	 * Method for counting same position players in team
	 * 
	 * @param t
	 *            - team you are checking
	 * @param position
	 *            - position you want to check
	 * @return - number of players in given position
	 */
	public static int countPlayers(Team t, String position) {
		int counter = 0;
		for (int i = 0; i < t.players.length; i++) {
			if (t.players[i].position.equals(position))
				counter++;
		}
		return counter;
	}

	/**
	 * Method for counting players born in same year
	 * 
	 * @param t
	 *            - given team
	 * @param year
	 *            - given year
	 * @return - returning number of players born in given year
	 */
	public static int countPlayers(Team t, int year) {
		int counter = 0;
		for (int i = 0; i < t.players.length; i++)
			if (t.players[i].birth.equals(year)) {
				counter++;
			}
		return counter;
	}

	public static void main(String[] args) {
		// Team One
		Player[] teamOne = new Player[11];
		teamOne[0] = new Player("Paul Pogba", 1990, "Midfielder");
		teamOne[1] = new Player("Carlos Tevez", 1994, "Forward");
		teamOne[2] = new Player("Andrea Pirlo", 1979, "Midfielder");
		teamOne[3] = new Player("Alvaro Morata", 1960, "Forward");
		teamOne[4] = new Player("Gianluigi Buffon", 1978, "Goalkeeper");
		teamOne[5] = new Player("Arturo Vidal", 1995, "Midfielder");
		teamOne[6] = new Player("Giorgio Chiellini", 1984, "Defender");
		teamOne[7] = new Player("Patrice Evra", 1981, "Defender");
		teamOne[8] = new Player("Player9", 1996, "Defender");
		teamOne[9] = new Player("Player10", 1975, "Forward");
		teamOne[10] = new Player("Player11", 1982, "Goalkeeper");
		Team one = new Team("TeamOne", teamOne);

		// Team Two
		Player[] teamTwo = new Player[11];
		teamTwo[0] = new Player("Player1", 1991, "Midfielder");
		teamTwo[1] = new Player("Tevez", 1984, "Forward");
		teamTwo[2] = new Player("Pirlo", 1979, "Midfielder");
		teamTwo[3] = new Player("Alvaro", 1992, "Forward");
		teamTwo[4] = new Player("Buffon", 1978, "Goalkeeper");
		teamTwo[5] = new Player("Vidal", 1987, "Midfielder");
		teamTwo[6] = new Player("Chiellini", 1984, "Defender");
		teamTwo[7] = new Player("Evra", 1981, "Defender");
		teamTwo[8] = new Player("Player09", 1986, "Defender");
		teamTwo[9] = new Player("Player010", 1991, "Forward");
		teamTwo[10] = new Player("Player011", 1982, "Goalkeeper");
		Team two = new Team("TeamTwo", teamTwo);

		System.out.println(getYoungestPlayer(one));

	}

}
