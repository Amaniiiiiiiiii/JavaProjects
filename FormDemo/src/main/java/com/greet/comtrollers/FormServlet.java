package com.greet.comtrollers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FornServlet
 */
@WebServlet("/register")
public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		//to print data in browser get writer object
		PrintWriter out= response.getWriter();
		//get data from form
		String name=request.getParameter("employeeName");
		String city=request.getParameter("city");
		int employeeId=Integer.parseInt(request.getParameter("employeeId"));
		double salary=Double.parseDouble(request.getParameter("salary"));
		String language=request.getParameter("language");
		String [] hobbies=request.getParameterValues("hobby");
		
		out.print("in servlet page");
		

//		//print data create html
//
//		out.print("<html><body>");
//
//		out.print("Name "+name+"<br>");
//		out.print("City "+city+"<br>");
//		out.print("EmpId "+employeeId+"<br>");
//		out.print("salary "+salary+"<br>");
//		out.print("language "+language+"<br>");
//		for(String hobby:hobbies) {
//			out.print("Hobby "+hobby+"<br>");
//		}
//		out.print("</body></html>");

		//bundling
		
		request.setAttribute("myname", name);
		request.setAttribute("city", city);
		request.setAttribute("employeeId", employeeId);
		request.setAttribute("salary", salary);
		request.setAttribute("language", language);
		request.setAttribute("hobbies", hobbies);
		
		//send to view page
		RequestDispatcher dispatcher=request.getRequestDispatcher("success.jsp");
		dispatcher.forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
