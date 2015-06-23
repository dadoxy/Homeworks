/**
 * class for protagonist including goal, companions max 3 and enemy
 * 
 * @author Dado
 *
 */
public class Protagonist extends Character {
	protected Goal goal;
	protected Character[] companions = new Character[3];
	protected Character enemy;

	/**
	 * Creating a protagonist
	 * 
	 * @param name
	 *            - name of protagonist
	 * @param gender
	 *            - male or female ( M or F )
	 * @param capable
	 *            - abilities true or false
	 * @param goal
	 */
	public Protagonist(String name, char gender, boolean capable, Goal goal) {
		super(name, gender, capable);
		this.goal = goal;
	}

	public Character getEnemy() {
		return enemy;
	}

	public void setEnemy(Character enemy) {
		this.enemy = enemy;
	}

	/**
	 * Method for adding companions to protagonist
	 * 
	 * @param supp
	 */
	public void addSupp(Character supp) {
		int counter = 0;
		try {
			companions[counter] = supp;
			counter++;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Max companions exist !");
		}
	}

	/**
	 * Method for checking if goal is reached and adding success % for
	 * companions, abilities and calculating success rate against enemy based on
	 * its abilities and difficulty level
	 * If protagonist fails killing one of companions but if he achieves vicotry 
	 * adding abilities to one of a companions
	 */
	public void attainGoal() {
		int success = 0;

		if (isAlive == true) {
			if (capable == true) {
				success += 40;
			}
			for (int i = 0; i < companions.length; i++) {
				if (companions[i].capable == true) {
					success += 20;
				}
			}
			if (enemy.capable == true) {
				success -= 30;
			}
			if (goal.dificulty == goal.MEDIUM) {
				success -= 20;
			}
			if (goal.dificulty == goal.HARD) {
				success -= 100;
			}
			if (success < 0) {
				success = 0;
			} else if (success > 100) {
				success = 100;
			}
		} else
			System.out.println("Main character dead !");
		if (success <= 50) {
			System.out.println("Failed !" + goal.name);
			for (int i = 0; i < companions.length; i++) {
				if (companions[i].capable == false) {
					companions[i].capable = true;
				}
				companions[i].isAlive = false;
				break;

			}
		} else {
			System.out.println("Success !" + goal.name);
			for (int i = 0; i < companions.length; i++) {
				if (companions[i].capable == false) {
					companions[i].capable = true;
					break;
				}
			}
		}
	}

}
