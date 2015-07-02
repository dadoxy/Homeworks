package TaskTwo;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NameGenerator extends JFrame {

	private static final long serialVersionUID = 1291710380325984607L;

	protected String name;
	protected String surname;
	protected JLabel text = new JLabel();
	protected JButton buttonName = new JButton("First name");
	protected JButton buttonSurname = new JButton("Last name");

	public NameGenerator() {
		setTitle("Name Generator");
		setVisible(true);
		setSize(400, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new BorderLayout());
		add(buttonName, BorderLayout.WEST);
		add(buttonSurname, BorderLayout.EAST);
		add(text, BorderLayout.CENTER);
		
		buttonName.addActionListener(new Action());
		buttonSurname.addActionListener(new Action());

	}

	public static class Name {
		protected String[] names = { "Name One", "Name Two", "Name Three" };
		
		private String generateName(){
			return names[(int) (Math.random() * names.length)];
		}
		
		public String toString() {
			return generateName();
		}
	}

	public static class Surname {
		protected String[] surnames = { "One", "Two", "Three" };
		
		private String generateSurname(){
			return surnames[(int) (Math.random() * surnames.length)];
		}
		
		public String toString() {
			return generateSurname();
		}
	}
	
	public class Action implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == buttonName){
				name = new Name().toString();
				text.setText(name);
			}else if(e.getSource() == buttonSurname){
				surname = new Surname().toString();
				text.setText(surname);
			}
			
		}
		
	}

	public static void main(String[] args) {
		new NameGenerator();

	}

}
