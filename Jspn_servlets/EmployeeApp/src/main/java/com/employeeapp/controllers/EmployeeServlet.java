package com.employeeapp.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employeeapp.model.Employee;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("http/text");
		String employeeName= request.getParameter("employeeName");
		String employeeId = request.getParameter("employeeId");
		String city= request.getParameter("city");
		String salary= request.getParameter("salary");
		String department= request.getParameter("department");
		String[] hobbies= request.getParameterValues("hobbies");
		
		//bundling
		Employee employee = new Employee();
		employee.setEmployeeName(employeeName);
		employee.setEmployeeId(Integer.parseInt(employeeId));
		employee.setCity(city);
		employee.setSalary(Double.parseDouble(salary));
		employee.setDepartment(department);
		employee.setHobbies(hobbies);
		
		request.setAttribute("employee", employee);
//		request.setAttribute("employeeName", employeeName);
//		request.setAttribute("employeeId", employeeId);
//		request.setAttribute("city", city);
//		request.setAttribute("salary", salary);
//		request.setAttribute("department", department);
//		request.setAttribute("hobbies", hobbies);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("success.jsp");
		requestDispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
