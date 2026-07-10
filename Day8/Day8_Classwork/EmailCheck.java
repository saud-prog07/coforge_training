package com.coforge.servlet.ajax;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EmailCheck")
public class EmailCheck extends HttpServlet {

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        String email = request.getParameter("email");

        if(email == null) {
            return;
        }

        if(email.equals("saud@gmail.com")) {

            out.println("<font color='green'><b>Approved</b></font>");

        }
        else {

            out.println("<font color='red'><b>Not Valid</b></font>");

        }

    }
}