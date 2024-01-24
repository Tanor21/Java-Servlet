package com.norcorp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/add")
public class AddServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i + j;
		
		
		
		PrintWriter out = res.getWriter();
		out.println("<html><body bgcolor='cyan'>");
		out.println("Output " + k);
		out.println("</body></html>");
		
		
		/*
		 * To pass the data in our example k value to SquareServlet one way do that is
		 * by using a concept of Session Management
		 */
		//req.setAttribute("k", k);
		
		
		
		/*
		 * To call a servlet inside another servlet we have two solutions :
		 * RequestDispatcher and urlRedirect
		 */
		
		// 1- RequestDispatcher
		//RequestDispatcher rd = req.getRequestDispatcher("sq");
		//rd.forward(req, res);
		
		
	
		
		// "3- Session Management
		//HttpSession session = req.getSession();
		//session.setAttribute("k", k);
		
		
		// Cookie
		//Cookie cookie = new Cookie("k", k + "");
		//res.addCookie(cookie);
		
		
		// 2-Redirect
		//res.sendRedirect("sq?k="+k);  // URL Rewriting
		//res.sendRedirect("sq"); 
		
		
	}
	 
	
	
	
	/*
	 * public void doPost(HttpServletRequest req, HttpServletResponse res) throws
	 * IOException { int i = Integer.parseInt(req.getParameter("num1")); int j =
	 * Integer.parseInt(req.getParameter("num2"));
	 * 
	 * int k = i + j;
	 * 
	 * PrintWriter out = res.getWriter();
	 * 
	 * out.println("Result is " + k); }
	 */

}
