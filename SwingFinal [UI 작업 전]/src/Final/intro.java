package Final;

import javax.swing.JFrame;
import java.awt.Panel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class intro extends JFrame {
	Menu mn; 
	intro() {
		
		getContentPane().setLayout(null);
		
		JLabel label = new JLabel("\uC608\uC57D \uC2A4\uCF00\uC904\uB7EC");
		label.setBounds(174, 92, 87, 15);
		getContentPane().add(label);
		
		JButton button = new JButton("\uC2DC\uC791");
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button)
				{
					
					mn = new Menu();
					setVisible(false);
					
				}
					
			}
		});
		
		button.setBounds(164, 154, 97, 23);
		getContentPane().add(button);
		
		
		
		setVisible(true);
		setSize(440,440);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
}

