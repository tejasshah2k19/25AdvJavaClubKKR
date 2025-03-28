package com.google.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//SignupServlet -> class -> Servlet type - ? 
//form submit -> 

@WebServlet("/SignupServlet")
public class SignupServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Signup Servlet................");

		// read
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		System.out.println("firstName => " + firstName);
		System.out.println("lastName => " + lastName);
		System.out.println("email => " + email);
		System.out.println("password => " + password);

		// response
		response.setContentType("text/html");// html //pdf
		PrintWriter out = response.getWriter();

		boolean isError = false; // no error
		String error = "";
		if (firstName == null || firstName.trim().length() == 0) {
			isError = true;
			error = "Please Enter FirstName<br>";
		}

		if (lastName == null || lastName.isBlank()) {
			isError = true;
			error += "Please Enter LastName<br>";
		}

		if (email == null || email.trim().length() == 0) {
			isError = true;
			error += "Please Enter Email<br>";
		}

		// error
		if (isError == true) {
			out.print(error);
		} else {
			// success
			out.println("<br>firstName => " + firstName);
			out.println("<br>lastName => " + lastName);
			out.println("<br>email => " + email);
			out.println("<br>password => " + password);
		}
	}

}
