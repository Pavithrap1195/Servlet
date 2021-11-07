package com.xworkz.registrationform;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegistrationFormDAO {
	
	public int register(DatabaseDTO dto) {
		String details = "insert into dto"+"sportsName,fullName,mobileNumber,dateAndTime,gender,ageGroup) values"+"(?,?,?,?,?,?);";
		int result =0;
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registration_form", "root", "Pavixworkz130621");
			
			PreparedStatement st = con.prepareStatement(details);
			st.setString(1, dto.getSportsName());
			st.setString(2, dto.getFullName());
			st.setString(3, dto.getMobileNumber());
			st.setString(4, dto.getDateAndTime());
			st.setString(5, dto.getGender());
			st.setString(6, dto.getAgeGroup());
			
			System.out.println(st);
			
			result = st.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		return 0;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
