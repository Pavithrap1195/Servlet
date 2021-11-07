package com.xworkz.registrationform;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationForm extends HttpServlet {
	
	public RegistrationForm() {
		System.out.println("Object Created");
	}
	
	public RegistrationFormDAO dao = new RegistrationFormDAO();
	
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	String sportsName = req.getParameter("sportsName");
	String fullName = req.getParameter("fullName");
	String mobileNumber = req.getParameter("mobileNumber");
	String dateAndTime = req.getParameter("dateAndTime");
	String gender = req.getParameter("gender");
	String ageGroup = req.getParameter("ageGroup");
	
	DatabaseDTO dto = new DatabaseDTO();
	dto.setSportsName(sportsName);
	dto.setFullName(fullName);
	dto.setMobileNumber(mobileNumber);
	dto.setDateAndTime(dateAndTime);
	dto.setGender(gender);
	dto.setAgeGroup(ageGroup);
	
	dao.register(dto);
	
	
	
	resp.setContentType("text/html");
	PrintWriter out = resp.getWriter();
	out.print("<html>");
	out.print("<body>");
	out.print("<h1 style ='color:blue'>");
	out.print("<form>");
	out.print("SportsName :".concat(sportsName));
	out.print("</br>");
	out.print("FullName :".concat(fullName));
	out.print("</br>");
	out.print("MobileNumber :".concat(mobileNumber));
	out.print("</br>");
	out.print("DateAndTime :".concat(dateAndTime));
	out.print("</br>");
	out.print("Gender :".concat(gender));
	out.print("</br>");
	out.print("AgeGroup :".concat(ageGroup));
	out.print("</br>");
	out.print("<form>");
	out.print("</h1>");
	out.print("</body>");
	out.print("</html>");
	
	
	
	
	
	
	
	
	
	
	
	}	
	

}
