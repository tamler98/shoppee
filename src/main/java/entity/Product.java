package entity;

public class Product {
	private int id;
	private String name;
	private double price;
	private String image;
	private String describe;
	private double sold;
	
	public Product() {
		
	}

	public Product(int id, String name, double price, String image, String describe, double sold) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.image = image;
		this.describe = describe;
		this.sold = sold;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public double getSold() {
		return sold;
	}

	public void setSold(double sold) {
		this.sold = sold;
	}
	
	
	
}



