package chapter13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {

	private int age;
	private double salary;
	private Date entranceDate;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Employee(int age, double salary, String entranceDateString) {
		this.age = age;
		this.salary = salary;
		try {
			this.entranceDate = sdf.parse(entranceDateString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getEntranceDate() {
		return entranceDate;
	}

	public void setEntranceDate(Date entranceDate) {
		this.entranceDate = entranceDate;
	}
	
	@Override
	public String toString() {
		return "Employee(" +
				"ages=" + age +
				", salary=" + salary +
				", entranceDate=" + entranceDate +
				'}';
	}

//	@Override
//	public int compareTo(Object o) {
//		if(this.entranceDate.before(((Employee)o).entranceDate)) return 1;
//		if(this.entranceDate.equals(((Employee)o).entranceDate)) return 0;
//		else return -1;
//	}
	
//	@Override
	public int compareTo(Object o) {
		if(this.entranceDate.before(((Employee)o).entranceDate)) return -1;
		if(this.entranceDate.equals(((Employee)o).entranceDate)) return 0;
		else return 1;
	}
	
}
