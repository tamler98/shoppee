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
import dao.UserActionList;
import entity.Items;
import entity.Orders;
import entity.Product;
import entity.Users;

@WebServlet("/api/addingcart")
public class CartAddingController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public CartAddingController() {
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/productmanager.jsp");
		dispatcher.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		// Lấy id của sản phẩm 
		String id = (String) session.getAttribute("pid");
		
		// Lấy username từ session
		Users user = (Users) session.getAttribute("user-session");
		String userID = user.getUsername();
		Orders order = new Orders();
		order.setUserName(userID);
		order.setProductID(Integer.valueOf(id));
		Orders add = UserActionList.inserToCart(order);
		response.sendRedirect("/JavaWeb/api/cart");
	}

}
