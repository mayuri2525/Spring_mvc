package com.hefshine.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		ServletContext con=getServletContext();
		String pm=con.getInitParameter("PM");
		PrintWriter pw=response.getWriter();
		pw.print(pm + " is pm");
		
		ServletConfig con1=getServletConfig();
		String s=con.getInitParameter("studentname");
		PrintWriter pw1=response.getWriter();
		pw1.print("<br>");
		pw1.print("student is " + s);
	}

	

}
