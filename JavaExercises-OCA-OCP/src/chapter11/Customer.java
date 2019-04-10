package chapter11;

public class Customer {

	private int id;
	private String name;
	private String surname;
	private char gender;
	private boolean isLicensed;
	
	public Customer(int id, String name, String surname, boolean isLicensed, char gender) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.gender = gender;		
		this.isLicensed = isLicensed;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public boolean isLicensed() {
		return isLicensed;
	}
	
	public char getGender() {
		return gender;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", surname=" + surname + ", isLicensed=" + isLicensed
				+ ", gender=" + gender + "]";
	}
	
//	@Override
//	public String toString() {
//		return ""
//				+ "\nid: " + id
//				+ "\nname: " + name
//				+ "\nsurname: " + surname
//				+ "\nisLicensed: " + isLicensed
//				+ "\ngender: " + gender
//			    + "\n";
//	}
}
