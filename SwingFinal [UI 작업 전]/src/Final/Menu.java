package Final;



import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Menu extends JFrame{
	choose_reservation cr;
	View_result vr;
	
	Menu() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JButton button = new JButton("\uC608\uC57D");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()== button)
					cr = new choose_reservation();
				setVisible(false);
					
			}
		});
		button.setBounds(287, 69, 97, 23);
		getContentPane().add(button);
		
		JButton button_1 = new JButton("\uC870\uD68C");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				vr = new View_result();
				setVisible(false);
			}
		});
		button_1.setBounds(287, 114, 97, 23);
		getContentPane().add(button_1);
		
		JButton button_2 = new JButton("\uB098\uAC00\uAE30");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button_2.setBounds(287, 154, 97, 23);
		getContentPane().add(button_2);
		
		
		setSize(440, 440);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

	

}
