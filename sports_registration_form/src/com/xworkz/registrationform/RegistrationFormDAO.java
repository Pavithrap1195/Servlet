package com.xworkz.registrationform;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegistrationFormDAO {
	
	private String dbDriver = "com.mysql.jdbc.Driver";
	
	
	
	public String register(DatabaseDTO dto) {
		
		String details = "insert into registrationform"+ "(sportsName,fullName,mobileNumber,dateAndTime,gender,ageGroup) values"+"(?,?,?,?,?,?);";
		String result =null;
		Connection con = null;
		try {
			try {
				Class.forName(dbDriver);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registration_form", "root", "Pavixworkz130621");
			
			PreparedStatement st = con.prepareStatement(details);
			st.setString(1, dto.getSportsName());
			st.setString(2, dto.getFullName());
			st.setString(3, dto.getMobileNumber());
			st.setString(4, dto.getDateAndTime());
			st.setString(5, dto.getGender());
			st.setString(6, dto.getAgeGroup());
			
			System.out.println(st);
			
			st.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

}
