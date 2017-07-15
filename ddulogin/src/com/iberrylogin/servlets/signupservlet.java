package com.iberrylogin.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iberry.bean.UserLogin;
import com.iberrylogin.dao.userDAO;

/**
 * Servlet implementation class signupservlet
 */
@WebServlet("/signupservlet")
public class signupservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public signupservlet() {
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
		String pas=request.getParameter("password");
		//String re=request.getParameter("repassword");
		UserLogin user1=new UserLogin(user,pas);
		boolean stat=userDAO.validate(user1);
		System.out.println("stauss"+stat);
		if(stat==true)
		{
			System.out.println("username and password already exist");
			//RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");
			//rd.include(request, response);
		}
		else
		{
			userDAO.add(user1);
			System.out.println("entry is added");
			
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
