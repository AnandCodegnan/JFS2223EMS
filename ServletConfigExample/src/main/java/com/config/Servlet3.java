package com.config;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Servlet3 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletConfig config = getServletConfig();
		String x = config.getInitParameter("driver");
		String y = config.getInitParameter("url");
		PrintWriter out = response.getWriter();
		out.print("<h1>"+ x +"</h1>");
		out.print("<h1>"+ y +"</h1>");
	}
}
