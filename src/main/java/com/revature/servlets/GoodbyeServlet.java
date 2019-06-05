package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/goodbye")
public class GoodbyeServlet extends HttpServlet {

	private static final long serialVersionUID = -2827189494895339650L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Forward
		// req.getRequestDispatcher("hello").forward(req, resp);

		// Redirect
		// resp.sendRedirect("http://localhost:8080/servlet-demo/hello");
		// resp.sendRedirect("http://www.google.com");

		req.getSession().invalidate();
	}
}
