
public class Protagonist extends Character {
	protected Goal goal;
	protected Character[] companions = new Character[3];
	protected Character enemy;
	
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
	public void addSupp(Character supp){
		int counter = 0;
		try {
		companions[counter] = supp;
		counter++;
		}catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Max companions exist !");
		}
	}
	public void attainGoal(){
		int success = 0;
		
		if (isAlive == true){
			if (capable == true){
				success += 40;
			}
			for (int i = 0; i < companions.length; i++){
				if (companions[i].capable == true){
					success += 20;
				}
			}
			if (enemy.capable == true ){
				success -= 30;
			}
			if (goal.dificulty == goal.MEDIUM){
				success -= 20;
			}
			if (goal.dificulty == goal.HARD){
				success -= 100;
			}
			if (success < 0){
				success = 0;
			}else if(success > 100){
				success = 100;
			}
		}else 
			System.out.println("Main character dead !");
		if (success <= 50){
			System.out.println("Failed !" + goal.name);
			for (int i = 0; i < companions.length; i++){
				if (companions[i].capable == false){
					companions[i].capable = true;
				}
				companions[i].isAlive = false;
				break;	
				
			}
		}else {
			System.out.println("Success !" + goal.name);
			for (int i = 0; i < companions.length; i++){
				if (companions[i].capable == false){
					companions[i].capable = true;
					break;
				}
			}
		}
	}
	
}
