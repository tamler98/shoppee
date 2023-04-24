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

@WebServlet("/manager/update")
public class UpdateProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UpdateProductController() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		String id = request.getParameter("pid");

		ProductList list = new ProductList();
		Product product = list.getProductByID(id);
		request.setAttribute("detail", product);

		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/updateproduct.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String sname = request.getParameter("name");
		String sprice = request.getParameter("price");
		String spid = request.getParameter("id");

		Product product = new Product();
		product.setId(Integer.valueOf(spid));
		product.setName(sname);
		product.setPrice(Double.valueOf(sprice));

		ProductList.updateProduct(product);
		response.sendRedirect("products");
	}

}
