package ba.bitcamp.homework26.task02;

import java.util.Random;

public class Threads implements Runnable {

	private String name;

	public Threads(String name) {
		this.name = name;
	}

	public static void main(String[] args) {

		Thread t1 = new Thread(new Threads("First"));
		Thread t2 = new Thread(new Threads("Second"));
		Thread t3 = new Thread(new Threads("Third"));

		try {
			t1.start();
			t1.join();
			t2.start();
			t2.join();
			t3.start();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		if (name.equals("Frist")) {
			for (int i = 1; i <= 10; i++) {
				System.out.println(i);
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} else if (name.equals("Second")) {
			for (int i = 0; i <= 4; i++) {
				System.out.println("BitCamp");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} else if (name.equals("Third")) {
			Random rand = new Random();
			for (int i = 0; i <= 4; i++) {
				System.out.println(rand.nextInt(5));
				try {
					Thread.sleep(700);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
