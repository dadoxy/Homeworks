package ba.bitcamp.homework26.task02;

import java.util.Random;

public class Threads implements Runnable{
	

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Threads());
		
		t1.start();
	}

	@Override
	public void run() {
		
		for(int i = 1; i <= 10; i++){
			System.out.println(i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		for(int i = 0; i <= 4; i++){
			System.out.println("BitCamp");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		Random rand = new Random();
		for(int i = 0; i <= 4; i++){
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
