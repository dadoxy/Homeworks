package Homework11;

public class Animal {
	private String sound;

	public Animal(String sound) {
		super();
		this.sound = sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public void makeSound() {
		System.out.println(sound);
	}

}
