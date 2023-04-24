package entity;

public class Items extends Product{
	private int count;

	public Items() {
		
	}

	public Items(int id, String name, Double price, String image, String describe, double sold, int count) {
		super(id, name, price, image, describe, sold);
		this.count = count;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	

}
