package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import config.Connect;
import entity.Items;
import entity.Orders;
import entity.Product;
import entity.Users;

public class UserActionList {
	static PreparedStatement ps = null;
	static ResultSet rs = null;

	public static Orders inserToCart(Orders order) {
		Connection connection = Connect.openConnect();
		try {
			PreparedStatement statement = connection.prepareStatement("insert into orders(`userName`, `productID`) values (?,?)");
			statement.setString(1, order.getUserName());
			statement.setInt(2, order.getProductID());
			statement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return order;
	}
	
	public static List<Items> getCart(String username) {
		List<Items> item = new ArrayList<Items>();
		try {
			Connection connection = Connect.openConnect(); // mo ket noi
			PreparedStatement statements = connection
					.prepareStatement("select u.*, count(u.id) as count\r\n"
							+ "from users as u\r\n"
							+ "join orders as o on u.id = o.productID \r\n"
							+ "join userlog as p on p.username = o.userName\r\n"
							+ "where p.username = ?  \r\n"
							+ "group by u.id\r\n"
							+ "order by u.id");
			statements.setString(1, username);
			rs = statements.executeQuery();
			while (rs.next()) {
				item.add(new Items(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4), rs.getString(5), rs.getDouble(6), rs.getInt(7)));
			}
		} catch (Exception e) {

		}
		return item;
	}
	
	public static Orders deleteOders(String username, String id) {
		Connection connection = Connect.openConnect();
		try {
			PreparedStatement statement = connection.prepareStatement("delete from orders where userName = ? and productID = ? limit 1");
			System.out.println(statement);
			statement.setString(1, username);
			statement.setString(2, id);
			statement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static int oderCount(String username) {
		Connection connection = Connect.openConnect();
		try {
			PreparedStatement statement = connection.prepareStatement("select count(*) from orders where userName = ?");
			statement.setString(1, username);
			rs = statement.executeQuery();
			while (rs.next()) {
				return rs.getInt(1);
			}
		} catch (Exception e) {

		}
		return 0;
	}
	
	
}