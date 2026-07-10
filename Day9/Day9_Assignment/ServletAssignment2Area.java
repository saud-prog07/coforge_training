package com.coforge.servlet1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletAssignment2Area
 */
@WebServlet("/ServletAssignment2Area")
public class ServletAssignment2Area extends HttpServlet {

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int radius = (Integer) request.getAttribute("radius");
		
		double area = 0;
		area = 3.14 * radius * radius;
		RequestDispatcher dispatcher = request.getRequestDispatcher("JspAssignmentProblem2.jsp");
		request.setAttribute("area", area);
		dispatcher.forward(request, response);
	}

}
