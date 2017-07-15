package com.iberrylogin.servlets;
import com.iberry.bean.UserLogin;
import com.iberrylogin.dao.*;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String user=request.getParameter("username");
		String pass=request.getParameter("password");
		System.out.println(user+pass);
	
		UserLogin user1=new UserLogin(user,pass);
		System.out.println(user1);
		boolean stat=userDAO.validate(user1);
		System.out.println("stauss"+stat);
		if(stat==true)
		{
			System.out.println("success");
			RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");
			rd.include(request, response);
		}
		else
		{
			System.out.println("error");
			RequestDispatcher rd=request.getRequestDispatcher("error.jsp");
			rd.include(request,response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
