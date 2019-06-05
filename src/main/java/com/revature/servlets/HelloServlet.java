package com.revature.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HelloServlet extends HttpServlet {

	private static final long serialVersionUID = -6611002305141965942L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		String name;
		String greeting;
		name = req.getParameter("name");
		greeting = this.getServletContext().getInitParameter("greeting");

		if (name != null)
			session.setAttribute("name", name);

		if (name == null)
			name = (String) session.getAttribute("name");

		if (name == null)
			name = this.getInitParameter("name");

		PrintWriter out = resp.getWriter();
		out.println("<h1>" + greeting + ", " + name + "</h1>");
		out.close();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
