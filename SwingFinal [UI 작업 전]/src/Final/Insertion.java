package Final;

import java.sql.Connection;
import java.sql.DriverManager; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException; 


public class Insertion
{ 
	String title, s_time, category, sitter;
	
	Insertion(String tArg,String s_tArg, String cArg, String sitArg) 
	{ 
		this.title = tArg;
		this.s_time = s_tArg;
		this.category = cArg;
		this.sitter = sitArg;
		
		String[] str = new String[4];
		
		try {

			Connection con = null;



			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsdb","root", "1234");

			String SQL = "insert into scheduler(title, s_time, category, sitter) values(?, ?, ?, ?)";

			PreparedStatement st = null;

			

			st = con.prepareStatement(SQL);
			
			st.setString(1, this.title );
			st.setString(2, this.s_time );
			st.setString(3, this.category );
			st.setString(4, this.sitter );

			
			st.executeUpdate();
			
			
		

		} catch (SQLException sqex) {

			System.out.println("SQLException: " + sqex.getMessage());

			System.out.println("SQLState: " + sqex.getSQLState());

		}



	}
	
}

