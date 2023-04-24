package entity;

import java.util.List;

public class Orders {
	private String userName;
	private int productID;
	
	public Orders(String userName, int productID) {
		this.userName = userName;
		this.productID = productID;
	}
	
	public Orders() {
		
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	@Override
	public String toString() {
		return "Order [userName=" + userName + ", productID=" + productID + "]";
	}
	
	
}
