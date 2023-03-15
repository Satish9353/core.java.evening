package satish;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Read {
	
	public static void main(String[] args){
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("hi");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/october","root","Xworkzodc@123");
			String query = "Select * from satish";
			Statement  st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			
		//	int in = st.execute(query);
			while(rs.next()) {
				System.out.println("id:"+rs.getInt(1)+" "+"name:"+rs.getString(2));
			}
			
			}catch(Exception e) {
				e.printStackTrace();
			}
		
	}

}


