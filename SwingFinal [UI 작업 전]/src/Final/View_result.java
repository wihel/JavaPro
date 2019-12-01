package Final;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.ScrollPane;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

class View_result extends JFrame {
	JTable table;
	DefaultTableModel dtm;
	Selection sel;
	Object[] column = {"타이틀","날짜","카테고리","예약석"};
	
	
	View_result(){
		
		
		
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("\uC774\uC804");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Menu mn = new Menu();
			}
		});
		btnNewButton.setBounds(12, 229, 600, 23);
		getContentPane().add(btnNewButton);
		
		dtm = new DefaultTableModel(column,0);
		
		
		
		
		
		sel = new Selection(dtm);
		table = new JTable(dtm);
		
		
		
		table.setBounds(12, 10, 600, 209);
		getContentPane().add(table);
		
		
		setVisible(true);
		setSize(650,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
