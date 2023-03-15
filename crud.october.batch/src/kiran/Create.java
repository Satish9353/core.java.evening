package kiran;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Create {
	
	public static void main(String[] args) throws SQLException {
		
		KiranDTO dDTO = new KiranDTO(1,"vishal");
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/october","root","Xworkzodc@123");
				String query = "Insert into kiran(id,name)Values(?,?)";
				PreparedStatement statement = con.prepareStatement(query);
				//setting the values from the object
				
				 statement.setInt(1,dDTO.getId());
				 statement.setString(2,dDTO.getName());
				 
				int i = statement.executeUpdate();
				if(i!=0) {
					System.out.println("data is insert");
				}else {
					System.out.println("data is not insert");
				}
				
			} catch (ClassNotFoundException e) {
			
				e.printStackTrace();
			}
					
		}

	}






