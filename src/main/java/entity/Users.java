package entity;

public class Users {
	private String username;
	private String password;
	private String name;
	private String phone;
	private String sex;
	private String image;
	private String role;
	
	public Users() {
		
	}

	
	public Users(String username, String password, String name, String phone, String sex, String image, String role) {
		this.username = username;
		this.password = password;
		this.name = name;
		this.phone = phone;
		this.sex = sex;
		this.image = image;
		this.role = role;
	}
	
	


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}
	
	


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	@Override
	public String toString() {
		return "Users [username=" + username + ", password=" + password + ", name=" + name + ", phone=" + phone
				+ ", sex=" + sex + "]";
	}
	
	
}

