package ba.bitcamp.homework24.task01;

import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Client extends JFrame {

	private static final long serialVersionUID = 6463534731269380864L;

	Socket client = null;
	BufferedWriter bw = null;
	BufferedReader br = null;
	String path = "";
	JButton send = new JButton("Send !");
	JTextArea textArea = new JTextArea();
	JTextField textField = new JTextField();

	public Client() {
		send.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {

					if (textField.getText().length() > 0) {
						bw.write(textField.getText());
						bw.newLine();
						bw.flush();
						textArea.append("Client: " + textField.getText() + "\n");

						textField.setText("");
					}

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		JFrame window = new JFrame();

		JLabel label = new JLabel();
		label.setLayout(new BorderLayout());

		label.add(send, BorderLayout.SOUTH);
		label.add(textField, BorderLayout.NORTH);
		label.add(textArea, BorderLayout.CENTER);
		window.add(label);
		textArea.setEditable(false);
		window.setTitle("Client");
		window.setSize(400, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		try {

			client = new Socket("localhost", 8888);
			bw = new BufferedWriter(new OutputStreamWriter(
					client.getOutputStream()));
			br = new BufferedReader(new InputStreamReader(
					client.getInputStream()));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			while (true) {
				String s = br.readLine();
				if (s.length() > 0) {
					chat(s);
					openUrl(s);
					openFile(s);
					listDirectories(s);
					deleteFile(s);

				}
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	public void openUrl(String s) {

		if (s.startsWith("/web")) {
			path = s.substring(s.indexOf(" "), s.length());
			try {
				Desktop.getDesktop().browse(new URI("http://" + path));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void chat(String s) {

		textArea.append("Server: " + s + "\n");
	}

	public void listDirectories(String s) {
		if (s.startsWith("/list")) {
			path = s.substring(s.indexOf(" "), s.length());
			File file = new File(path);
			String[] list = file.list();
			for (int i = 0; i < list.length; i++) {
				textArea.append(list[i] + "\n");
			}

		}
	}

	public void deleteFile(String s) {
		if (s.startsWith("/delete")) {
			path = s.substring(s.indexOf(" "), s.length());
			File file = new File(path);
			file.delete();
		}
	}

	public void openFile(String s) {
		if (s.startsWith("/open")) {
			path = s.substring(s.indexOf(" "), s.length());

			try {
				Desktop.getDesktop().open(new File(path));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new Client();

	}

}
