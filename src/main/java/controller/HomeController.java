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
import entity.Items;
import entity.Product;
import entity.Users;
import dao.ProductList;
import dao.UserActionList;

@WebServlet("/api/index")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public HomeController() {
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
//		ArrayList<String> productName = new ArrayList<String>();
//		productName.add("BÃ¡ÂºÂ£o bÃ¡Â»â€˜i 2050 - Chong chÃƒÂ³ng tre cÃ¡Â»Â§a Nobita");
//		productName.add("BÃ¡ÂºÂ£o bÃ¡Â»â€˜i 2030 - MÃƒÂ¡y dÃƒÂ² tÃƒÂ¬m kim cÃ†Â°Ã†Â¡ng cÃ¡Â»Â±c chÃ¡ÂºÂ¥t");
//		productName.add("BÃ¡ÂºÂ£o bÃ¡Â»â€˜i Doraemon - MÃƒÂ¡y phÃƒÂ¡t hiÃ¡Â»â€¡n nÃƒÂ³i dÃ¡Â»â€˜i");
//		productName.add("BÃ¡ÂºÂ£o bÃ¡Â»â€˜i Doraemon - CÃƒÂ¡nh cÃ¡Â»Â­a thÃ¡ÂºÂ§n kÃ¡Â»Â³");
//		productName.add("BÃ¡ÂºÂ£o bÃ¡Â»â€˜i Doraemon - BÃƒÂ¡nh mÃ¡Â»Â³ phiÃƒÂªn dÃ¡Â»â€¹ch 250 ngÃƒÂ´n ngÃ¡Â»Â¯ ...");
//		productName.add("BÃ¡ÂºÂ£o bÃ¡Â»â€˜i Doraemon - TÃ¡Â»Â§ Ã„â€˜iÃ¡Â»â€¡n thoÃ¡ÂºÂ¡i yÃƒÂªu cÃ¡ÂºÂ§u");
//		productName.add("BÃ¡ÂºÂ£o bÃ¡Â»â€˜i Doraemon - BÃƒÂ¬nh XÃ¡Â»â€¹t tÃ¡ÂºÂ¡o khuÃƒÂ´n vÃƒÂ  viÃƒÂªn bÃƒÂ´ng khÃƒÂ´");
//		productName.add("BÃ¡ÂºÂ£o bÃ¡Â»â€˜i Doraemon - VÃƒÂ´ tuyÃ¡ÂºÂ¿n thÃ„Æ’m dÃƒÂ² Ã„â€˜Ã¡Â»Æ’ Ã„Æ’n cÃ†Â°Ã¡Â»â€ºp");
//		productName.add("BÃ¡ÂºÂ£o bÃ¡Â»â€˜i Doraemon - SÃƒÂºng biÃ¡ÂºÂ¿n vÃ¡ÂºÂ­t dÃ¡Â»Â¥ng thÃƒÂ nh trÃƒÂ² Ã„â€˜ÃƒÂ¹a");
//		productName.add("BÃ¡ÂºÂ£o bÃ¡Â»â€˜i Doraemon - Ã„ï¿½ÃƒÂ¨n Pin phÃƒÂ³ng to - thu nhÃ¡Â»ï¿½ theo ÃƒÂ½");
//		productName.add("BÃ¡ÂºÂ£o bÃ¡Â»â€˜i Doraemon - ThuÃ¡Â»â€˜c biÃ¡ÂºÂ¿n ngÃ†Â°Ã¡Â»ï¿½i thÃƒÂ nh Robot");
//		productName.add("BÃ¡ÂºÂ£o bÃ¡Â»â€˜i Doraemon - VÃƒÂ²ng trÃƒÂ²n xuyÃƒÂªn thÃ¡ÂºÂ¥u");
//		request.setAttribute("name", productName);
//		
//		Product product = new Product(1, "BÃ¡ÂºÂ£o bÃ¡Â»â€˜i 2050 - Chong chÃƒÂ³ng tre cÃ¡Â»Â§a Nobita", 17000, "resource/img/sp1.jfif");
//		Product product1 = new Product(2, "BÃ¡ÂºÂ£o bÃ¡Â»â€˜i Doraemon - MÃƒÂ¡y phÃƒÂ¡t hiÃ¡Â»â€¡n nÃƒÂ³i dÃ¡Â»â€˜i", 18000, "resource/img/sp2.jfif");
//		Product product2 = new Product(3, "BÃ¡ÂºÂ£o bÃ¡Â»â€˜i Doraemon - VÃƒÂ²ng trÃƒÂ²n xuyÃƒÂªn thÃ¡ÂºÂ¥u", 65000, "resource/img/p3.jfif");
//		Product product3 = new Product(4, "BÃ¡ÂºÂ£o bÃ¡Â»â€˜i Doraemon - ThuÃ¡Â»â€˜c biÃ¡ÂºÂ¿n ngÃ†Â°Ã¡Â»ï¿½i thÃƒÂ nh Robot", 70000, "resource/img/p4.jfif");
//		Product product4 = new Product(5, "BÃ¡ÂºÂ£o bÃ¡Â»â€˜i Doraemon - BÃƒÂ¬nh XÃ¡Â»â€¹t tÃ¡ÂºÂ¡o khuÃƒÂ´n vÃƒÂ  viÃƒÂªn bÃƒÂ´ng khÃƒÂ´", 76000, "resource/img/p2.jfif");
//		Product product5 = new Product(6, "BÃ¡ÂºÂ£o bÃ¡Â»â€˜i Doraemon - BÃƒÂ¡nh mÃ¡Â»Â³ phiÃƒÂªn dÃ¡Â»â€¹ch 250 ngÃƒÂ´n ngÃ¡Â»Â¯ ...", 54000, "resource/img/p6.jfif");
//		
//		ArrayList<Product> productList = new ArrayList<Product>();
//		productList.add(product);
//		productList.add(product1);
//		productList.add(product2);
//		productList.add(product3);
//		productList.add(product4);
//		productList.add(product5);
//		request.setAttribute("name1", productList);
		
//		String id = request.getParameter("id");
//		ArrayList<Product> productLists = new ArrayList<Product>();
//		Connection connection = Connect.openConnect();
//		Statement stmt;
//		Product product = null;
//		try {
//			stmt = connection.createStatement();
//			ResultSet rs = stmt.executeQuery("select id, name, price, image from users where id =" + id);
//			
//			if (rs.next()) {
//				product = new Product(rs.getInt(1), rs.getString(2), rs.getFloat(3), rs.getString(4));
//			}
//			System.out.println(product.getName());
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		request.setAttribute("productLists", productLists);
		
		
		
//		ProductList products = new ProductList();
//		List<Product> list = products.getAllProduct();
//		request.setAttribute("listP", list);
//		
//		
//		
//		response.setContentType("text/html;charset=UTF-8");
//		RequestDispatcher dispatcher = request.getRequestDispatcher("/home.jsp");
//		dispatcher.forward(request, response);
		
//		HttpSession session = request.getSession();
//		Users user = (Users) session.getAttribute("user-session");
		
		HttpSession session = request.getSession();
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
			loggedIn = "<li class=\"sign\"><a href=\"signup\">Đăng ký</a></li>\n"
					+ "			<li class=\"sign\"><a href=\"\">|</a></li>\n"
					+ "			<li class=\"sign\"><a href=\"login\">Đăng nhập</a></li>";
			int count = 0;
			request.setAttribute("count", count);
		}
		request.setAttribute("loggedIn", loggedIn);
		
		ProductList products = new ProductList();
		List<Product> product = products.getProduct();
		request.setAttribute("listP", product);
		
		
		int counts = ProductList.getAllCount();
		int endPage = counts/24;
		if ((counts % 24) != 0) {
			endPage++;
		request.setAttribute("endP", endPage);
		
		response.setContentType("text/html;charset=UTF-8");
		RequestDispatcher dispatcher = request.getRequestDispatcher("/home.jsp");
		dispatcher.forward(request, response);
	}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
