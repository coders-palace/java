package com.webapp.servlet;

import javax.servlet.annotation.*;
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.ServletException;

@WebServlet("/welcome")
public class WelcomeExp extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<title> welcome page </title>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<h1>Welcome to servlets </h1>");
		pw.println("</body>");
		pw.println("</html>");
		pw.close();
	}

}
