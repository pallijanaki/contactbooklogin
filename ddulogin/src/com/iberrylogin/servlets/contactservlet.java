package com.iberrylogin.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iberry.bean.contactbook;
import com.iberry.dao.contactbookdao.contactDao;
import com.iberrylogin.dao.userDAO;

/**
 * Servlet implementation class contactservlet
 */
@WebServlet("/contactservlet")
public class contactservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public contactservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String name=request.getParameter("newData");
		String tel=request.getParameter("telno");
		String dob=request.getParameter("dob");
		String address=request.getParameter("address");
		String website=request.getParameter("website");
		String cname=request.getParameter("companyname");
		String landlineno=request.getParameter("landlineno");
		contactbook contact=new contactbook(name,tel,address,website,cname,landlineno,dob);
		boolean co=contactDao.validate(contact);
		if(co==true)
		{
			System.out.println("added");
		}
	}

}
