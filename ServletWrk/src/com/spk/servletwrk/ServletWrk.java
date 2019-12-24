package com.spk.servletwrk;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletWrk extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		
		
//		Servlet Context Example
		
		ServletContext ctx=req.getServletContext();
		String name=ctx.getInitParameter("name");
		String Phone=ctx.getInitParameter("phone");
		
		PrintWriter out=res.getWriter();
		out.println("Hi "+name+" You're using "+Phone);
	}
	
}
