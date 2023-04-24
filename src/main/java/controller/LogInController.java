package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ProductList;
import entity.Users;

@WebServlet("/api/login")
public class LogInController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public LogInController() {
     
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		HttpSession session = request.getSession();
		String note1 = (String) session.getAttribute("notes");
		System.out.println(note1);
		request.setAttribute("notes", note1);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/login.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = (String) request.getParameter("username");
		String password = (String) request.getParameter("password");
		
		
		
		ProductList list = new ProductList();
		Users user = list.findUserNameAndPassword(username, password);
		
		if (user.getUsername() != null) {
			HttpSession session = request.getSession();
			session.setAttribute("user-session", user);
			session.removeAttribute("notes");
			response.sendRedirect("/JavaWeb/api/index");
		} else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/login.jsp");
			dispatcher.forward(request, response);
		}
	}

}
