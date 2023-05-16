package com.xworkz.lapapp.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.xworkz.lapapp.dto.LaptopDTO;

@Repository
public class LaptopRepositoryImpl implements LaptopRepo{
	
	@Override
	public LaptopDTO save(LaptopDTO dto) {
		LaptopDTO lap = new LaptopDTO();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/friday", "root", "Xworkzodc@123");
			String querry="insert into laptop(name,ram,color)values(?,?,?)";
			PreparedStatement statement =connection.prepareStatement(querry);
			
			statement.setString(1, dto.getName());
			statement.setString(2, dto.getRam());
			statement.setString(3, dto.getColor());
			
			int i=statement.executeUpdate();
			if(i!=0) {
			System.out.println("data added");
			lap=dto;
			
		}else {
			System.out.println("not added");
		}		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
		return lap;
	}
	@Override
	public List<LaptopDTO> getLaptop() {
		List<LaptopDTO> list = new ArrayList<LaptopDTO>();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/friday", "root", "Xworkzodc@123");
			String querry="select * from laptop";
			PreparedStatement statement =connection.prepareStatement(querry);
			ResultSet rs=statement.executeQuery();
			while(rs.next()) {
					list.add(new LaptopDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
			}
			} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	@Override
	public List<LaptopDTO> searchLaptop(String names) {
		List<LaptopDTO> list = new ArrayList<LaptopDTO>();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/friday", "root", "Xworkzodc@123");
			String querry="select * from laptop where name=?";
			
			PreparedStatement statement =connection.prepareStatement(querry);
			statement.setString(1, names);
			ResultSet rs=statement.executeQuery();
			while(rs.next()) {
					list.add(new LaptopDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
			}
			} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		return list;	}
	@Override
	public List<LaptopDTO> searchLaptop1(String ram) {
		List<LaptopDTO> list = new ArrayList<LaptopDTO>();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/friday", "root", "Xworkzodc@123");
			String querry="select * from laptop where ram=?";
			
			PreparedStatement statement =connection.prepareStatement(querry);
			statement.setString(1, ram);
			ResultSet rs=statement.executeQuery();
			while(rs.next()) {
					list.add(new LaptopDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
			}
			} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	@Override
	public List<LaptopDTO> searchLaptop2(String color) {
		List<LaptopDTO> list = new ArrayList<LaptopDTO>();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/friday", "root", "Xworkzodc@123");
			String querry="select * from laptop where color=?";
			
			PreparedStatement statement =connection.prepareStatement(querry);
			statement.setString(1, color);
			ResultSet rs=statement.executeQuery();
			while(rs.next()) {
					list.add(new LaptopDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
			}
			} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	@Override
	public LaptopDTO updateById(int id) {
		LaptopDTO dto =new LaptopDTO();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/friday", "root", "Xworkzodc@123");
			String querry="select * from laptop  where id=?";
			
			PreparedStatement statement =connection.prepareStatement(querry);
			statement.setInt(1, id);
			ResultSet rs=statement.executeQuery();
			while(rs.next()) {
				LaptopDTO dt	=new LaptopDTO(rs.getInt(4), rs.getString(1), rs.getString(3), rs.getString(2));
				dto=dt;
			}
			
			
			
			} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
				return dto  ;
	}
	@Override
	public LaptopDTO update(LaptopDTO dto) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/friday", "root", "Xworkzodc@123");
			String querry="update laptop set name=? ,ram=?,color=? where id=?";
			
			PreparedStatement statement =connection.prepareStatement(querry);
			statement.setString(1, dto.getName());
			statement.setString(2, dto.getRam());
			statement.setString(3, dto.getColor());
			statement.setInt(4, dto.getId());
			int i=statement.executeUpdate();
			
			} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}		return dto;
	}

}