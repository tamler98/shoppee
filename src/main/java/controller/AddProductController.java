package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProductList;
import entity.Product;


@WebServlet("/manager/new")
public class AddProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public AddProductController() {
    
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/addproduct.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		String sname = request.getParameter("name");
		String sprice = request.getParameter("price");
//		String simage = request.getParameter("image");
//		String ssold = request.getParameter("sold");
		System.out.println(sname);
		Product product = new Product();
		product.setName(sname);
		product.setPrice(Double.valueOf(sprice));
		
		ProductList.insertProduct(product);
		response.sendRedirect("products");
	}

}
