package com.coforge.servlet1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AssignmentProblem2Radius
 */
@WebServlet("/AssignmentProblem2Radius")
public class AssignmentProblem2Radius extends HttpServlet {

	/**
     * @see HttpServlet#HttpServlet()
     */
	/*
	 * super(); // TODO Auto-generated constructor stub }
	 * 
	 *//**
		 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
		 *      response)
		 *//*
			 * protected void doGet(HttpServletRequest request, HttpServletResponse
			 * response) throws ServletException, IOException { // TODO Auto-generated
			 * method stub
			 * response.getWriter().append("Served at: ").append(request.getContextPath());
			 * }
			 */

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int radius = Integer.parseInt(request.getParameter("radius"));
		RequestDispatcher dispatcher = request.getRequestDispatcher("/ServletAssignment2Area");
		request.setAttribute("radius",radius);
		
		dispatcher.forward(request,response);
	}

}
