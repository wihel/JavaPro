package Final;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.ResultSet;

import java.sql.SQLException;

import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.PreparedStatement;




public class Selection {
	
	

	Selection(DefaultTableModel dtmArg){

		
		java.sql.PreparedStatement st = null;
		try {

			Connection con = null;



			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsdb","root", "1234");

			String query = "select title,s_time, category, sitter from scheduler;";

			

			ResultSet rs = null;

			st = con.prepareStatement(query);

			rs = st.executeQuery();

			

		


			while (rs.next()) {

				dtmArg.addRow(new Object[] {
						rs.getString("title"),
						rs.getString("s_time"),
						rs.getString("category"),
						rs.getString("sitter")
				});

				

			}

		} catch (SQLException sqex) {

			System.out.println("SQLException: " + sqex.getMessage());

			System.out.println("SQLState: " + sqex.getSQLState());

		}
	

		


	}

}



