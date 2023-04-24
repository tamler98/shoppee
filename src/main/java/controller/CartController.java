package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ProductList;
import dao.UserActionList;
import entity.Items;
import entity.Product;
import entity.Users;

/**
 * Servlet implementation class CartController
 */
@WebServlet("/api/cart")
public class CartController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CartController() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
		UserActionList itemList = new UserActionList();
		HttpSession session = request.getSession();
		
		String loggedIn ="";
		if(session != null && session.getAttribute("user-session")!=null)
		{
			System.out.println("aaa");
			Users user = (Users) session.getAttribute("user-session");
			loggedIn = "<li class=\"sign\"><a href=\"profile\"><img src=\""+user.getImage()+"\" alt=\"\" style=\"width:20px; border-radius: 50%;\">&nbsp;"+user.getUsername()+"</a></li>"
					+ "			<li class=\"sign\"><a href=\"\">|</a></li>\n"
					+ "			<li class=\"sign\"><a href=\"logout\">Đăng Xuất</a></li>";
		}
		else
		{
			System.out.println("bbbb");
			loggedIn = "<li class=\"sign\"><a href=\"signup\">Đăng ký</a></li>\n"
					+ "			<li class=\"sign\"><a href=\"\">|</a></li>\n"
					+ "			<li class=\"sign\"><a href=\"login\">Đăng nhập</a></li>";
		}
		request.setAttribute("loggedIn", loggedIn);
		
		
		Users user = (Users) session.getAttribute("user-session");
		String username = user.getUsername();
		List<Items> item = UserActionList.getCart(username);
		request.setAttribute("items", item);
		
		response.setContentType("text/html;charset=UTF-8");
		RequestDispatcher dispatcher = request.getRequestDispatcher("/productcart.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
