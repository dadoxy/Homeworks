package TaskThree;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Numbers extends JFrame {

	private static final long serialVersionUID = -4254274915497991030L;
	
	protected JButton[] buttons = new JButton[10];
	
	protected String[] numbers = new String[5];
	
	public Numbers(){
		setLayout(new GridLayout(2,5));
		setTitle("Numbers");
		setVisible(true);
		setSize(400, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		for (int i = 0; i < buttons.length; i++){
			buttons[i] = new JButton(Integer.toString(i));
			add(buttons[i]);
			buttons[i].addActionListener(new Action());
		}
		
	}
	public class Action implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			for (int i = 0; i < buttons.length; i++){
				if (e.getSource() == buttons[i]){
					buttons[i].setEnabled(false);
					numbers[i] = buttons[i].getText();
				}
			}
			if (numbers[4] != null){
				JOptionPane.showMessageDialog(null, Arrays.toString(numbers));
				System.exit(0);
			}
		}
		
	}
	public static void main(String[] args) {
		new Numbers();

	}

}
