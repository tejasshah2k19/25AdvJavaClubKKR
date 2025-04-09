package com.google.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/InputNameServlet")
public class InputNameServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		String firstName = request.getParameter("firstName");
		System.out.println(firstName);
		boolean isError = false; 
		
		String alphaRegEx = "[a-zA-Z]+";
		//+ -> min : 1 , max : n 
		
		
		if(firstName == null || firstName.isBlank()) {
			request.setAttribute("firstNameError", "Please Enter FirstName");
			isError = true; 
		}else {
			if(firstName.matches(alphaRegEx) == false) {
				request.setAttribute("firstNameError", "Please Enter Valid FirstName");
				isError = true; 
					
			}
		}
		
		if(isError==true) {
			//go back 
			RequestDispatcher rd = request.getRequestDispatcher("InputName.jsp");
			rd.forward(request, response);
		}else {
			//go ahead 

			RequestDispatcher rd = request.getRequestDispatcher("OutputName.jsp");
			rd.forward(request, response);
		}
		
	}
}
