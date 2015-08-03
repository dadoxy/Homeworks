package ba.bitcamp.homework26.task03;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class InterruptingThread extends JFrame {

	private static final long serialVersionUID = 8666294083832414958L;

	private JLabel label = new JLabel();
	private JButton button = new JButton("Stop");
	private int letter = 97;
	private boolean start = true;

	public InterruptingThread() {

		setLayout(new BorderLayout());
		setTitle("Interrupting Thread");
		setLocationRelativeTo(null);
		add(label, BorderLayout.CENTER);
		add(button, BorderLayout.SOUTH);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (start == true) {
					start = false;
					button.setText("Resume");
				} else {
					start = true;
					
					button.setText("Stop");
				}
			}
		});

		MyThread t1 = new MyThread();
		t1.start();


	}

	public class MyThread extends Thread {

		@Override
		public void run() {
			while (start) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				label.setText(label.getText() + (char) letter);
				letter++;
				repaint();
			}
		}

	}

	public static void main(String[] args) {

		new InterruptingThread();

	}

}
