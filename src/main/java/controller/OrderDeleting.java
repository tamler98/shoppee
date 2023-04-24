package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ProductList;
import dao.UserActionList;
import entity.Orders;
import entity.Users;

@WebServlet("/api/oderdelete")
public class OrderDeleting extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public OrderDeleting() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		Users user = (Users) session.getAttribute("user-session");
		String username = user.getUsername();
		
		String id= request.getParameter("orderid");
		System.out.println(id);
		
		Orders add = UserActionList.deleteOders(username, id);
		response.sendRedirect("/JavaWeb/api/index");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
