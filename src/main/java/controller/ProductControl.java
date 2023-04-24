package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import config.Connect;
import entity.Product;
import entity.Users;
import dao.ProductList;

@WebServlet("/api/product")
public class ProductControl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ProductControl() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		

		HttpSession session = request.getSession();
		
		String loggedIn ="";
		if(session != null && session.getAttribute("user-session")!=null)
		{
			Users user = (Users) session.getAttribute("user-session");
			loggedIn = "<li class=\"sign\"><a href=\"profile\"><img src=\""+user.getImage()+"\" alt=\"\" style=\"width:20px; border-radius: 50%;\">&nbsp;"+user.getUsername()+"</a></li>"
					+ "			<li class=\"sign\"><a href=\"\">|</a></li>\n"
					+ "			<li class=\"sign\"><a href=\"logout\">Đăng Xuất</a></li>";
		}
		else
		{
			loggedIn = "<li class=\"sign\"><a href=\"signup\">Đăng ký</a></li>\n"
					+ "			<li class=\"sign\"><a href=\"\">|</a></li>\n"
					+ "			<li class=\"sign\"><a href=\"login\">Đăng nhập</a></li>";
			int count = 0;
			request.setAttribute("count", count);
		}
		request.setAttribute("loggedIn", loggedIn);
		
		
		String id = request.getParameter("pid");
		session.setAttribute("pid", id);
		
		ProductList list = new ProductList();
		Product product = list.getProductByID(id);
		
		request.setAttribute("detail", product);
		response.setContentType("text/html;charset=UTF-8");
		RequestDispatcher dispatcher = request.getRequestDispatcher("/product.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
