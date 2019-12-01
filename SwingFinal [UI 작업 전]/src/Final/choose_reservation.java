package Final;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;

import org.omg.PortableServer.ServantRetentionPolicyValue;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

class choose_reservation extends JFrame {
	Movie mv;
	Stay st;
	Train tr;
	JRadioButton radioButton,radioButton_1, radioButton_2;
	ButtonGroup SlctBtnG;

	choose_reservation() {
	
		
		
		getContentPane().setLayout(null);
		
		radioButton = new JRadioButton("\uC601\uD654");
		
		SlctBtnG = new ButtonGroup();
		
		
		
		
		radioButton.setBounds(69, 88, 60, 23);
		getContentPane().add(radioButton);
		radioButton.setSelected(true);
		
		radioButton_1 = new JRadioButton("\uC219\uBC15");
		radioButton_1.setBounds(69, 126, 60, 23);
		getContentPane().add(radioButton_1);
		
		radioButton_2 = new JRadioButton("\uAE30\uCC28\uD45C");
		radioButton_2.setBounds(69, 169, 80, 23);
		getContentPane().add(radioButton_2);
		
		SlctBtnG = new ButtonGroup();
		SlctBtnG.add(radioButton);
		SlctBtnG.add(radioButton_1);
		SlctBtnG.add(radioButton_2);
		
		
		JButton btnNewButton = new JButton("\uC120\uD0DD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource() == btnNewButton)
				{
					if(radioButton.isSelected())
					{
						mv =new Movie();
						setVisible(false);
					}
					else if(radioButton_1.isSelected())
					{
						st = new Stay();
						setVisible(false);
					}
					else if(radioButton_2.isSelected())
					{
						tr = new Train();
						setVisible(false);
					}
				
				}
				
				
			}
		});
		btnNewButton.setBounds(290, 215, 60, 23);
		getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("\uC608\uC57D");
		lblNewLabel.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		lblNewLabel.setBounds(69, 10, 252, 53);
		getContentPane().add(lblNewLabel);
		
		JButton button = new JButton("\uC774\uC804");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Menu mn = new Menu();
				
			}
		});
		
		button.setBounds(351, 215, 60, 23);
		getContentPane().add(button);
		
		setVisible(true);
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}


