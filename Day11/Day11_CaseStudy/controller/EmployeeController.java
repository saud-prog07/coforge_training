package com.coforge.ems.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.coforge.ems.exception.InvalidEmployeeObjectException;
import com.coforge.ems.model.Employee;
import com.coforge.ems.service.EmployeeService;
import com.coforge.ems.util.ApplicationProperties;

@WebServlet("/EmployeeController")
public class EmployeeController extends HttpServlet {

    private EmployeeService service = new EmployeeService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getParameter("emsbutton");

        int eid = 0;
        String ename = "";
        int esalary = 0;
        int dno = 0;

        Employee employee = null;
        String result = "";

        switch (action) {

        case "Insert":

            eid = Integer.parseInt(request.getParameter("eid"));
            ename = request.getParameter("ename");
            esalary = Integer.parseInt(request.getParameter("esalary"));
            dno = Integer.parseInt(request.getParameter("dno"));

            employee = new Employee(eid, ename, esalary, dno);

            try {
                int n = service.createEmployee(employee);

                if (n == 1)
                    result = ApplicationProperties.insertSuccess;

            } catch (ClassNotFoundException | SQLException e) {
                result = ApplicationProperties.dbFailed;
            } catch (InvalidEmployeeObjectException e) {
                result = ApplicationProperties.validationFailed;
            }

            response.sendRedirect("index.jsp?result=" + result);
            break;

        case "Delete":

            eid = Integer.parseInt(request.getParameter("eid"));

            try {
                service.delete(eid);
                result = ApplicationProperties.insertSuccess;

            } catch (ClassNotFoundException | SQLException e) {
                result = ApplicationProperties.dbFailed;
            } catch (InvalidEmployeeObjectException e) {
                result = ApplicationProperties.validationFailed;
            }

            response.sendRedirect("index.jsp?result=" + result);
            break;

        case "Update":

            RequestDispatcher dispatcher =
                    request.getRequestDispatcher("updateEmployee.jsp");

            dispatcher.forward(request, response);

            return;

        case "UpdateEmployee":

            eid = Integer.parseInt(request.getParameter("eid"));

            int option = Integer.parseInt(request.getParameter("option"));

            try {

                if (option == 1) {

                    int salary =
                            Integer.parseInt(request.getParameter("salary"));

                    service.updateSalary(eid, salary);

                } else if (option == 2) {

                    int dept =
                            Integer.parseInt(request.getParameter("dno"));

                    service.updateDepartmentNumber(eid, dept);
                }

                result = ApplicationProperties.insertSuccess;

            } catch (ClassNotFoundException | SQLException e) {

                result = ApplicationProperties.dbFailed;

            } catch (InvalidEmployeeObjectException e) {

                result = ApplicationProperties.validationFailed;
            }

            response.sendRedirect("index.jsp?result=" + result);
            break;

        case "Find":

            request.setAttribute("mode", "find");

            RequestDispatcher dispatcher1 =
                    request.getRequestDispatcher("DisplayEmployee.jsp");

            dispatcher1.forward(request, response);

            return;

        case "FindEmployee":

            eid = Integer.parseInt(request.getParameter("eid"));

            try {

                List<Employee> emp = service.findEmployee(eid);

                request.setAttribute("mode", "single");
                request.setAttribute("employee", emp);

                RequestDispatcher dispatcher2 =
                        request.getRequestDispatcher("DisplayEmployee.jsp");

                dispatcher2.forward(request, response);

                return;

            } catch (ClassNotFoundException | SQLException e) {

                result = ApplicationProperties.dbFailed;

            } catch (InvalidEmployeeObjectException e) {

                result = ApplicationProperties.validationFailed;
            }

            response.sendRedirect("index.jsp?result=" + result);

            break;

        case "FindAll":

            try {

                List<Employee> employees = service.displayAll();

                request.setAttribute("mode", "all");
                request.setAttribute("employee", employees);

                RequestDispatcher dispatcher2 =
                        request.getRequestDispatcher("DisplayEmployee.jsp");

                dispatcher2.forward(request, response);

                return;

            } catch (ClassNotFoundException | SQLException e) {

                result = ApplicationProperties.dbFailed;

            } catch (InvalidEmployeeObjectException e) {

                result = ApplicationProperties.validationFailed;
            }

            response.sendRedirect("index.jsp?result=" + result);

            break;
    }
    }
}
