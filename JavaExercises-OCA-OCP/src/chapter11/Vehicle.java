package chapter11;

public class Vehicle {
	
	private String manufacturer;
	protected String plate;	// targa
	protected String destination; 
	
	protected Customer[][] seats = new Customer[0][0];

	public Vehicle () {
		
	}
	
//	public Vehicle(Customer[][] seats) {
//		this.seats = seats;
//	}
	
	protected String getManufacturer() {
		return manufacturer;
	}
	
	protected String reserveSeat(Customer c) {
		int i, j = 0;
		for (i = 0; i < seats.length; i++) {
			for (j = 0; j < seats[i].length; j++) {
				int seat = i * seats[i].length + (j + 1);
				Customer target = seats[i][j];
				if (target == null && c.isLicensed()) {
					seats[i][j] = c;
					System.out.println("Just reserved seat: "+ seat + "\n" + seats[i][j].getName() + " " + seats[i][j].getSurname() + "\n");
					System.out.println(i + "  " + j);
					return c.toString();
				} 
			} 
		}
		System.out.println("There is no free seat in this " + this.getClass().getSimpleName() + " for " + c.getName() + " " + c.getSurname() + "\n");
		return "";
	}
	  
	protected void listSeats() {
		for (int i = 0; i < seats.length; i++) {
			for (int j = 0; j < seats[i].length; j++) {
				int seat = i * seats[i].length + (j + 1);
				if (seats[i][j] != null) {
					System.out.print("Seat:" + seat + " - ");
//					System.out.print("Seat:" + i + "," + j + " - ");
					System.out.println(seats[i][j].getName() + " " + seats[i][j].getSurname());					
				} else {
					System.out.println("Seat:" + seat + " - Empty");
				}
			}
		}
		System.out.println();
	}
	
}
