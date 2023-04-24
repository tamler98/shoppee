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

@WebServlet("/api/search")
public class SearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SearchController() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");

		HttpSession session = request.getSession();
		System.out.println(session);
		String loggedIn ="";
		if(session != null && session.getAttribute("user-session")!=null)
		{
			Users user = (Users) session.getAttribute("user-session");
			loggedIn = "<li class=\"sign\"><a href=\"profile\"><img src=\""+user.getImage()+"\" alt=\"\" style=\"width:20px; border-radius: 50%;\">&nbsp;"+user.getUsername()+"</a></li>"
					+ "			<li class=\"sign\"><a href=\"\">|</a></li>\n"
					+ "			<li class=\"sign\"><a href=\"logout\">Đăng Xuất</a></li>";
			String username = user.getUsername();
			List<Items> item = UserActionList.getCart(username);
			request.setAttribute("items", item);
			int count = UserActionList.oderCount(username);
			request.setAttribute("count", count);
		}
		else
		{
			System.out.println("bbb");
			loggedIn = "<li class=\"sign\"><a href=\"signup\">Đăng ký</a></li>\n"
					+ "			<li class=\"sign\"><a href=\"\">|</a></li>\n"
					+ "			<li class=\"sign\"><a href=\"login\">Đăng nhập</a></li>";
			int count = 0;
			request.setAttribute("count", count);
		}
		request.setAttribute("loggedIn", loggedIn);
		
		String txtSearch = request.getParameter("txtSearch");
		List<Product> lists = ProductList.search(txtSearch);
		request.setAttribute("listP", lists);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/home.jsp");
		dispatcher.forward(request, response);
	}

}
