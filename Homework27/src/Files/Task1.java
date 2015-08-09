package Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;

public class Task1 {

	private static LinkedBlockingQueue<Runnable> queue;
	private static ArrayList<Worker> workers;
	private static BufferedReader br = null;
	private static Integer counter = 0;
	private static char test;

	public static void main(String[] args) {
		queue = new LinkedBlockingQueue<Runnable>();

		try {
			br = new BufferedReader(new FileReader(new File("text.txt")));

			String firstLine = br.readLine();
			System.out.println(firstLine);
			test = firstLine.charAt(0);
			queue.add(new Task(firstLine, test));

			while (br.ready()) {

				queue.add(new Task(br.readLine(), test));
			}
			workers = new ArrayList<Worker>();
			for (int i = 0; i < 4; i++) {
				Worker worker = new Worker();
				worker.start();
				try {
					worker.join();

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				workers.add(worker);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("There is " + counter + " letters " + test
				+ " that repeats in file.");
	}

	public static class Worker extends Thread {
		@Override
		public void run() {
			while (!queue.isEmpty()) {

				try {

					Runnable work = queue.take();
					work.run();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}
	}

	public static class Task implements Runnable {

		String s = "";
		char test;

		public Task(String s, char test) {
			this.s = s;
			this.test = test;
		}

		@Override
		public void run() {

			for (int i = 0; i < s.length(); i++) {
				if (Character.toString(test).equalsIgnoreCase(
						Character.toString(s.charAt(i)))) {

					synchronized (counter) {
						counter++;
						System.out.println(counter);
					}
				}
			}
		}

	}
}
