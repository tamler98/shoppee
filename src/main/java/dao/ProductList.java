
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import config.Connect;
import entity.Product;
import entity.Users;

public class ProductList {
	static PreparedStatement ps = null;
	static ResultSet rs = null;

	public List<Product> getAllProduct() {
		List<Product> list = new ArrayList<Product>();
		String query = "select * from users";
		try {
			Connection connection = Connect.openConnect(); // mo ket noi
			ps = connection.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4), rs.getString(5), rs.getDouble(6)));
			}
		} catch (Exception e) {

		}
		return list;
	}

	public static Product getProductByID(String id) {
		String query = "select * from users where id = ?";
		try {
			Connection connection = Connect.openConnect(); // mo ket noi
			ps = connection.prepareStatement(query);
			ps.setString(1, id);
			rs = ps.executeQuery();
			while (rs.next()) {
				return new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4), rs.getString(5), rs.getDouble(6));
			}
		} catch (Exception e) {

		}
		return null;
	}

	public Product findProductByID(String id) {
		String query = "select * from users where id = ?";
		try {
			Connection connection = Connect.openConnect(); // mo ket noi
			ps = connection.prepareStatement(query);
			ps.setString(1, id);
			rs = ps.executeQuery();
			while (rs.next()) {
				return new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4), rs.getString(5), rs.getDouble(6));
			}
		} catch (Exception e) {

		}
		return null;
	}

	public static Product insertProduct(Product product) {
		Connection connection = Connect.openConnect();
		try {
			PreparedStatement statement = connection.prepareStatement("insert into users(`name`,`price`) values(?,?)");
			statement.setString(1, product.getName());
			statement.setDouble(2, product.getPrice());
			statement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return product;
	}

	public static Product updateProduct(Product product) {
		Connection connection = Connect.openConnect();
		try {
			PreparedStatement statement = connection
					.prepareStatement("update users" + " set name = ?," + " price = ?" + " where id = ?");
			System.out.println(statement);
			statement.setString(1, product.getName());
			statement.setDouble(2, product.getPrice());
			statement.setInt(3, product.getId());
			statement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return product;
	}

	public static List<Product> search(String txtSearch) {
		List<Product> list = new ArrayList<Product>();
		try {
			Connection connection = Connect.openConnect(); // mo ket noi
			PreparedStatement statements = connection
					.prepareStatement("select * from users where name like ?");
			statements.setString(1, '%' + txtSearch + '%');
			rs = statements.executeQuery();
			while (rs.next()) {
				list.add(new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4), rs.getString(5), rs.getDouble(6)));
			}
		} catch (Exception e) {

		}
		return list;
	}

	public static Product deleteProductByID(String id) {
		Connection connection = Connect.openConnect();
		try {
			PreparedStatement statement = connection.prepareStatement("delete from users where id = ?");
			System.out.println(statement);
			statement.setString(1, id);
			statement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public Users findUserNameAndPassword(String username, String password) {
		Users users = new Users();
		Connection connection = Connect.openConnect();
		Statement stmt;
		try {
			stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("select username, password, name, phone, sex, image, role from userlog where username ='" + username
					+ "' and password ='" + password + "'");
			if (rs.next()) {
				users = new Users(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;

	}
	
//	public static Users updateLogin(Users user) {
//		Connection connection = Connect.openConnect();
//		try {
//			PreparedStatement statement = connection.prepareStatement("update userlog set status='1' where username = ?");
//			statement.setString(1, user.getUsername());
//			statement.execute();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return null;
//	}
//	
//	public static int checkLogin(String username) {
//		Connection connection = Connect.openConnect();
//		try {
//			PreparedStatement statement = connection.prepareStatement("select * from userlog where username = ?");
//			statement.setString(1, username);
//			rs = statement.executeQuery();
//			while (rs.next()) {
//				return rs.getInt(3);
//			}
//		} catch (SQLException e) {
//			
//		}
//		return 0;
//	}
	
	public static Users insertUser(Users user) {
		Connection connection = Connect.openConnect();
		try {
			PreparedStatement statement = connection
					.prepareStatement("insert into userlog(`username`,`password`) values(?,?)");
			statement.setString(1, user.getUsername());
			statement.setString(2, user.getPassword());
			statement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}
	
	
	public static String checkUser(String username) {
		String query = "select * from userlog where username= ?";
		try {
			Connection connection = Connect.openConnect(); // mo ket noi
			ps = connection.prepareStatement(query);
			ps.setString(1, username);
			rs = ps.executeQuery();
			while (rs.next()) {
				return rs.getString(1);
			}
		} catch (Exception e) {
	}
		return null;
	}
			

	public static int getAllCount() {
		try {
			Connection connection = Connect.openConnect(); // mo ket noi
			PreparedStatement statements = connection.prepareStatement("select count(*) from users");
			rs = statements.executeQuery();
			while (rs.next()) {
				return rs.getInt(1);
			}
		} catch (Exception e) {

		}
		return 0;
	}

	public static int countSearch(String txtSearch) {
		try {
			Connection connection = Connect.openConnect(); // mo ket noi
			PreparedStatement statements = connection.prepareStatement("select count(*) from users where name like ?");
			statements.setString(1, '%' + txtSearch + '%');
			rs = statements.executeQuery();
			while (rs.next()) {
				return rs.getInt(1);
			}
		} catch (Exception e) {

		}
		return 0;
	}
	
	public static List<Product> listSearchCount(String txtSearch, int index) {
		List<Product> list = new ArrayList<Product>();
		try {
			Connection connection = Connect.openConnect(); // mo ket noi
			PreparedStatement statements = connection.prepareStatement("with x as(select row_number() over (order by id asc) as r, `id`, `name`, `price`, `image`  from users where `name` like ?)\n"
					+ "SELECT * FROM x LIMIT ? OFFSET ?");
			statements.setString(1, '%'+txtSearch+'%');
			statements.setInt(2, 18);
			statements.setInt(3, (index-1)*18);
			rs = statements.executeQuery();
			while (rs.next()) {
				list.add(new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4), rs.getString(5), rs.getDouble(6)));
			}
		} catch (Exception e) {

		}
		return list;
	}

	public static List<Product> listCount(int index) {
		List<Product> list = new ArrayList<Product>();
		try {
			Connection connection = Connect.openConnect(); // mo ket noi
			PreparedStatement statements = connection.prepareStatement("SELECT * FROM users LIMIT ? OFFSET ?");
			statements.setInt(1, 24);
			statements.setInt(2, (index - 1) * 24);
			rs = statements.executeQuery();
			System.out.println(rs);
			while (rs.next()) {
				list.add(new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4), rs.getString(5), rs.getDouble(6)));
			}
		} catch (Exception e) {

		}
		return list;
	}

	public static List<Product> getProduct() {
		List<Product> list = new ArrayList<Product>();
		try {
			Connection connection = Connect.openConnect(); // mo ket noi
			PreparedStatement statements = connection.prepareStatement("SELECT * FROM users LIMIT 24 OFFSET 0");
			rs = statements.executeQuery();
			while (rs.next()) {
				list.add(new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4), rs.getString(5), rs.getDouble(6)));
			}
		} catch (Exception e) {

		}
		return list;
	}

	private void main(String[] args) {
		
	}
}
