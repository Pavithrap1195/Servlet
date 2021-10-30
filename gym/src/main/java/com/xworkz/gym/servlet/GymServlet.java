package com.xworkz.gym.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GymServlet extends HttpServlet {

	public GymServlet() {
		System.out.println("GymServlet Created");
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Invoked service in gym servlet");

		// <input type="text" name="gymName" />
		String gymName = request.getParameter("gymName");
		System.out.println("Gym Name: ".concat(gymName));

		String loc = request.getParameter("location");
		System.out.println("Location: " + loc);

		String fees = request.getParameter("fees");
		System.out.println("Fees: ".concat(fees));

		String review = request.getParameter("review");
		System.out.println("review: ".concat(review));

		String contact = request.getParameter("contact");
		System.out.println("contact: ".concat(contact));

		System.out.println("Starting to write response");

		response.setContentType("text/html");// response
		PrintWriter out = response.getWriter();// pdf
		out.print("<html>");
		out.print("<body>");
		out.print("<h1 style ='color:green'>");
		out.print("Details saved for :".concat(gymName));
		out.print("</br>");
		out.print("Fees :".concat(fees));
		out.print("</h1>");
		out.print("</body>");
		out.print("</html>");

	}

}
