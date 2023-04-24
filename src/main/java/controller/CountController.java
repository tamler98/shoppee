package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ProductList;
import entity.Product;
import entity.Users;

/**
 * Servlet implementation class getCountController
 */
@WebServlet("/api/count")
public class CountController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CountController() {

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
		}
		else
		{
			loggedIn = "<li class=\"sign\"><a href=\"signup\">Đăng ký</a></li>\n"
					+ "			<li class=\"sign\"><a href=\"\">|</a></li>\n"
					+ "			<li class=\"sign\"><a href=\"login\">Đăng nhập</a></li>";
		}
		request.setAttribute("loggedIn", loggedIn);
		
		String indexPage = request.getParameter("index");
		int index = Integer.parseInt(indexPage);
		int counts = ProductList.getAllCount(); //31
		int endPage = counts/24; //5 // du1
		if ((counts % 24) != 0) {
			endPage++;
		}
		List<Product> product = ProductList.listCount(index);
		request.setAttribute("listP", product);
		request.setAttribute("endP", endPage);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/home.jsp");
		dispatcher.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}