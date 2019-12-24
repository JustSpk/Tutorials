package com.spk.servletwrk;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletWrk extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		
		
//		Servlet Config Example
		
		ServletConfig cg=getServletConfig();
		String name=cg.getInitParameter("name");
				
		PrintWriter out=res.getWriter();
		out.println("Hi "+name);
	}
	
}
