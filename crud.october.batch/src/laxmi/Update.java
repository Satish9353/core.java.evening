package laxmi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
	 
public static void main(String[] args) throws SQLException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/october","root","Xworkzodc@123");
			String query = "Update laxmi set name='laxmi' Where id=1";
			Statement st = con.createStatement();
			
			int in = st.executeUpdate(query);
			if(in==1) {
				System.out.println("data  is updated");
			}else {
				System.out.println("data is not updated");
			}
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
}


}
