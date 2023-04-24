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

/**
 * Servlet implementation class SignUpController
 */
@WebServlet("/api/signup")
public class SignUpController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public SignUpController() {
   
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		RequestDispatcher dispatcher = request.getRequestDispatcher("/signup.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		HttpSession session = request.getSession();
		Users user = new Users();
		user.setUsername(username);
		user.setPassword(password);
		
		String check = ProductList.checkUser(username);
		String note = "";
		if (user.getUsername().equals(check)) {
			note = "Tài khoản đã tồn tại";
			session.setAttribute("notes", note);
			response.sendRedirect("signup");
		}else {
			note = "Bạn đã đăng ký thành công, hãy đăng nhập nhé!";
			ProductList.insertUser(user);
			session.setAttribute("notes", note);
			response.sendRedirect("login");
		}
	}

}
