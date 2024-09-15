package com.Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import com.Dao.*;
@WebServlet("/send")


/**
 * Servlet implementation class send
 
 *
 */



public class send extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public send() {
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
		
				
		
		
		String uname=request.getParameter("name");
		String unumber=request.getParameter("number");
		String uemail=request.getParameter("email");
		String usubject=request.getParameter("subject");
		String umessage=request.getParameter("message");
		
		Member member=new Member(uname, unumber, uemail, usubject, umessage);
		
		sendDao sDao=new sendDao();
		String result=sDao.insert(member);
		response.getWriter().print(result);
		PrintWriter out = response.getWriter();
		out.print(uname);
		out.print(unumber);
		out.print(uemail);
		out.print(usubject);
		out.print(umessage);
	}

}
