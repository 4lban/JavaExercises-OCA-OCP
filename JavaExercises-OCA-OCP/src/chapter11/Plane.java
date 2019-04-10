package chapter11;

public class Plane extends Vehicle {
	
	public Plane() {
		seats = new Customer[5][4];
	}
	
	String[] labels = new String[] {"A", "B", "C", "D", "E"};
	
	protected String reserveSeat(Customer c) {
		int i, j = 0;
		for (i = 0; i < seats.length; i++) {
			for (j = 0; j < seats[i].length; j++) {
				String seat = (i+1) + labels[j];
				Customer target = seats[i][j];
				if (target == null && c.isLicensed()) {
					seats[i][j] = c;
					System.out.println("Just reserved seat: "+ seat + "\n" + seats[i][j].getName() + " " + seats[i][j].getSurname() + "\n");
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
				String seat = (i+1) + labels[j];
				if (seats[i][j] != null) {
					System.out.print("Seat:" + seat + " - ");
					System.out.println(seats[i][j].getName() + " " + seats[i][j].getSurname());					
				} else {
					System.out.println("Seat:" + seat + " - Empty");
				}
			}
		}
		System.out.println();
	}
	
}
