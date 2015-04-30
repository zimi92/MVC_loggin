package com.zimi.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zimi.dto.User;
import com.zimi.service.LoginService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String userId,userPass ;
		userId = request.getParameter("user_id");
		userPass = request.getParameter("user_pass");
		
		LoginService loginService = new LoginService();
		boolean auth_result = loginService.authenticate(userId, userPass);
		
		if(auth_result){
			User user = loginService.getUserDetails(userId);
			request.setAttribute("user", user);
			RequestDispatcher disp1 = request.getRequestDispatcher("logged.jsp");
			disp1.forward(request, response);
		}else{
			response.sendRedirect("login.jsp");
		}
		
	}

}
