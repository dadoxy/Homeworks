package BufferedImage;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Task2 extends JFrame {

	private static final long serialVersionUID = 1304369644117990430L;

	private static BufferedImage image = null;
	private JPanel panel;
	private static LinkedBlockingQueue<Runnable> queue;
	private static ArrayList<Worker> workers;
	private static int start = 0;
	private static int end = 10;

	public Task2() {

		try {
			image = ImageIO.read(new File("image.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		panel = new MyPanel();
		add(panel);

		setSize(1366, 768);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		queue = new LinkedBlockingQueue<Runnable>();

		for (int i = 0; i < 136; i++) {
			queue.add(new Task(start, end));
			start += 10;
			end += 10;
		}

		workers = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			Worker worker = new Worker();
			worker.start();
			workers.add(worker);
		}
		for (int i = 0; i < workers.size(); i++) {
			try {
				workers.get(i).join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static class Worker extends Thread {
		@Override
		public void run() {
			while (!queue.isEmpty()) {

				Runnable worker = queue.poll();
				if (worker == null) {
					break;
				}

				worker.run();

			}
		}
	}

	public static class Task implements Runnable {
		private int start;
		private int end;

		public Task(int start, int end) {
			this.start = start;
			this.end = end;
		}

		@Override
		public void run() {

			for (int i = start; i < end; i++) {
				for (int j = 0; j < image.getHeight(); j++) {
					int pixel = image.getRGB(i, j);
					image.setRGB(i, j, 255 - pixel);

				}
			}

		}
	}

	public class MyPanel extends JPanel {

		private static final long serialVersionUID = 7560955720029355936L;

		@Override
		protected void paintComponent(Graphics g) {

			g.drawImage(image, 0, 0, image.getWidth(), image.getHeight(), null);
			repaint();
		}

	}

	public static void main(String[] args) {

		new Task2();

	}

}
