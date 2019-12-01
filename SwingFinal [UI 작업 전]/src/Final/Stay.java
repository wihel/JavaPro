package Final;



import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;

import javax.swing.JComboBox;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.sql.*;

class Stay extends JFrame implements ActionListener{

	Insertion insert;
	JButton[][] SitBtn;
	JButton button, button_5;
	JComboBox comboBox_year, comboBox_month,comboBox_day,comboBox_hour, comboBox_minute; 
	String title, date, category, sitter;
	JLabel label,label_1,label_2, label_3, label_4, label_5, lable_Result;
	JComboBox comboBox_name;
	
	Insertion itdata;
	
	Stay(){
		
		
		
		getContentPane().setLayout(null);
		
		SitBtn = new JButton[8][4];
		button = new JButton("\uC608\uC57D");
		button.setBounds(406, 354, 65, 33);
		button.addActionListener(this);
		getContentPane().add(button);
		
		label = new JLabel("¼÷¹Ú");
		label.setFont(new Font("±¼¸²", Font.PLAIN, 17));
		label.setBounds(221, 53, 32, 15);
		getContentPane().add(label);
		
		comboBox_year = new JComboBox();
		comboBox_year.setBounds(125, 91, 53, 23);
		getContentPane().add(comboBox_year);
		comboBox_year.addItem("2019");
		comboBox_year.addItem("2020");
		comboBox_year.addItem("2021");
		
		
		
		label_1 = new JLabel("\uB144");
		label_1.setBounds(181, 95, 17, 15);
		getContentPane().add(label_1);
		
		comboBox_month = new JComboBox();
		comboBox_month.setBounds(210, 91, 43, 23);
		getContentPane().add(comboBox_month);
		for(int i=1;i<=12;i++)
			comboBox_month.addItem(i);
		
		label_2 = new JLabel("\uC6D4");
		label_2.setBounds(256, 95, 17, 15);
		getContentPane().add(label_2);
		
		comboBox_day = new JComboBox();
		comboBox_day.setBounds(285, 91, 43, 23);
		getContentPane().add(comboBox_day);
		for(int i=1;i<=30;i++)
			comboBox_day.addItem(i);
		
		label_3 = new JLabel("\uC77C");
		label_3.setBounds(331, 95, 17, 15);
		getContentPane().add(label_3);
		
		comboBox_hour = new JComboBox();
		comboBox_hour.setBounds(360, 91, 43, 23);
		getContentPane().add(comboBox_hour);
		for(int i=1;i<24;i++)
			comboBox_hour.addItem(i);
		
		label_4 = new JLabel("\uC2DC");
		label_4.setBounds(406, 95, 17, 15);
		getContentPane().add(label_4);
		
		comboBox_minute = new JComboBox();
		comboBox_minute.setBounds(431, 91, 43, 23);
		getContentPane().add(comboBox_minute);
		
		for(int i=0;i<60;i++)
			comboBox_minute.addItem(i);
		
		label_5 = new JLabel("\uBD84");
		label_5.setBounds(477, 95, 17, 15);
		getContentPane().add(label_5);
		
		for(int i=0; i<8; i++) {
			for(int j=0; j<4; j++) {
				SitBtn[i][j] = new JButton((j+1)+"-"+(i+1));
				SitBtn[i][j].setBounds(79+(55*i), 222+(33*j), 55, 23);
				getContentPane().add(SitBtn[i][j]);
				SitBtn[i][j].setBackground(Color.white);
				SitBtn[i][j].addActionListener(this);
				
			}
		}
		
		
		comboBox_name = new JComboBox();
		comboBox_name.setBounds(285, 50, 189, 23);
		getContentPane().add(comboBox_name);
		
		comboBox_name.addItem("°¡Æò Ææ¼Ç");
		comboBox_name.addItem("¾çÆò Ç® ºô¶ó");
		comboBox_name.addItem("ÈÞ ¸ðÅÚ");
		comboBox_name.addItem("½ºÅÁ´Þ");
		
		button_5 = new JButton("\uC774\uC804");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				choose_reservation cr = new choose_reservation();
				
		
				
				
			}
		});
		button_5.setBounds(470, 354, 65, 33);
		getContentPane().add(button_5);
		
		lable_Result = new JLabel("result");
		lable_Result.setBounds(285, 171, 43, 15);
		getContentPane().add(lable_Result);
		
		
		
		
		
		
		
		
		setSize(630,440);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		for(int i =0; i<8; i++)
		{
			for(int j=0; j<4; j++)
			{
			if(e.getSource() ==SitBtn[i][j])
			{
				SitBtn[i][j].setBackground(Color.RED);
				this.sitter = SitBtn[i][j].getText();
				
			}
			else if(e.getSource() != SitBtn[i][j])
				SitBtn[i][j].setBackground(Color.white);
				
			}
			
		}
		
		if(e.getSource()==button)
		{
			this.title = comboBox_name.getSelectedItem().toString();
			this.date = comboBox_year.getSelectedItem().toString() +" ³â"
					+comboBox_month.getSelectedItem().toString()+" ¿ù"
					+comboBox_day.getSelectedItem().toString()+ " ÀÏ"
					+comboBox_hour.getSelectedItem().toString()+" ½Ã"
					+comboBox_minute.getSelectedItem().toString()+ " ºÐ";
			
			this.category = label.getText();
			itdata = new Insertion(this.title, this.date, this.category, this.sitter);
		}	
			
			
	}
}
