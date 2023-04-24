package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
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
import dao.ProductList;
import entity.Product;
import entity.Users;

@WebServlet("/manager/products")
public class ProductManagerment extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ProductManagerment() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			
			ProductList productList = new ProductList();
			List<Product> listProduct = productList.getAllProduct();

			request.setAttribute("listProduct", listProduct);

			response.setContentType("text/html;charset=UTF-8");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/productmanager.jsp");
			dispatcher.forward(request, response);
		}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
