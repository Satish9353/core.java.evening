package bhavana;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Delete {
	public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("hi");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/october","root","Xworkzodc@123");
			String query = "DELETE FROM bhavan WHERE id=1";
			Statement  st = con.createStatement();
			//ResultSet rs = st.executeQuery(query);
			
			int in = st.executeUpdate(query);
			System.out.println(in);
			if(in!=0) {
				System.out.println("data is deleted");
			}else {
				System.out.println("data is not deleted");
			}
			}catch(Exception e) {
				e.printStackTrace();
			}
		
	}

}



	
		


		 
	