package com.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import com.Dao.*;


import java.io.IOException;


@WebServlet("/Register")
/**
 * Servlet implementation class Register
 */
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private static UserDao userDao =new UserDaoImp();
   
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username=request.getParameter("username");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		User1 user =new User1();
		user.setUsername(username);
		user.setEmail(email);
		user.setPassword(password);
		
		if(userDao.addUser(user))
		{
			response.sendRedirect("login.jsp?registration=success");
		}
		
		else {
			response.sendRedirect("register.jsp?error=1");
		}
		
		
		
}
	}


