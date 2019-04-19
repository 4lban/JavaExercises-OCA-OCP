package chapter12;

public class Customer {

	private int id;
	private String name;
	private String surname;
	private char gender;
	private boolean isLicensed;
	
	public Customer(int id, String name, String surname, char gender, boolean isLicensed) {
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
	
	@Override
	public boolean equals(Object obj) {
		
		if(this == null || obj == null) {
			return false;
		} 
		if (this.id == ((Customer)obj).id){
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return 11*id + 13*name.hashCode();
	}
}
