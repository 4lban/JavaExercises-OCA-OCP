package chapter13;

public class User {

	private String userName;
	private String email;
	
	public User(String email, String userName) {
		this.userName = userName;
		this.email = email;
	}
	
	@Override
	public int hashCode() {
		return email != null ? email.hashCode() : 0;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		User user = (User) obj;
		return email != null ? email.equals(user.email) : user.email == null;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
