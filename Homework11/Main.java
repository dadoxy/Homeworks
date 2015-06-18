package Homework11;

public class Main {
	public static void main(String[] args) {
		
		Animal duck = new Animal("quack !! quack !!");
		duck.makeSound();
		duck.setSound("quack quack");
		duck.makeSound();
		
		Animal cat = new Animal("meow !! moew !!");
		cat.makeSound();
		
	}
}

