package com.norcorp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/*
 * ServletConfig & ServletContext : to get the initial value for the servlet or for the application
 * 
 * 
 * If you have multiple servlets that share the same value of course you can go for ServletContext
 * If you have a different values for different servlets you can go for ServletConfig
 */



@WebServlet("/home")
public class MyServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		PrintWriter out = res.getWriter();
		out.print("Hi ");
		
		//ServletContext ctx = getServletContext();
		//String str = ctx.getInitParameter("phone");
		
		ServletConfig sc = getServletConfig();
		String str = sc.getInitParameter("name");
		out.println(str);
	}

}
