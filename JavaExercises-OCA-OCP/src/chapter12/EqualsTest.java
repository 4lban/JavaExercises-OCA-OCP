package chapter12;

public class EqualsTest {

	public static void main(String[] args) {

		Customer c1 = new Customer(001, "Alban", "Maxhuni", 'm', true);
		Customer c2 = new Customer(003, "Alban", "Maxhuni", 'm', true);
		Customer c3 = new Customer(006, "Alban", "Maxhuni", 'm', true);
		Customer c4 = new Customer(001, "Adian", "Maxhuni", 'm', true);
		Customer c5 = new Customer(004, "Alban", "Maxhuni", 'm', true);
		Customer c6 = c1;
		
		boolean isSame = c1.equals(c4);
		System.out.println(isSame);
		
	}

}
