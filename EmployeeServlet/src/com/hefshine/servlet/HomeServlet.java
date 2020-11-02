package com.hefshine.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HomeServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException { 
	
		PrintWriter pw=res.getWriter();
		pw.print("hello from servlet ");
		
		//String s=req.getParameter("username");
		//System.out.println(" home servlet");
		
		HttpSession session=req.getSession();
	String s1=(String) session.getAttribute("username");
	//pw.print(s1 + " servlet ");
		System.out.println(s1);
		
		
	}

}
