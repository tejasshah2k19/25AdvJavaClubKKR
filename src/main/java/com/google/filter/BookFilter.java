package com.google.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
@WebFilter("/BookServlet")
public class BookFilter implements Filter {
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		String bookName  = request.getParameter("bookName");
		String bookPrice = request.getParameter("bookPrice");
		
		boolean isError = false; 
		
		if(bookName == null || bookName.isBlank()) {
			isError = true; 
			request.setAttribute("bookNameError", "Please Enter Book Name");
		}
		
		if(bookPrice==null || bookPrice.isBlank()) {
			isError = true; 
			request.setAttribute("bookPriceError", "Please Enter Book Price");
		}
		
		if(isError == true) {
			RequestDispatcher rd = request.getRequestDispatcher("InputBook.jsp");
			rd.forward(request, response);
		}else {
			chain.doFilter(request, response);//go to the servlet or next filter 
		}
		
	}

	@Override
	public void destroy() {
	}
}
