package chapter11;

public class Bus extends Vehicle {

	public Bus() {
		seats = new Customer[2][4];
	}
	
	protected String reserveSeat(Customer c) {
		int i, j = 0;
		for (i = 0; i < seats.length; i++) {
			for (j = 0; j < seats[i].length; j++) {
				
				int seat = i * seats[i].length + (j + 1);
				Customer target = seats[i][j];
				
				if (target == null && c.isLicensed()) {
					
					if(j==1 && (seats[i][0]==null || seats[i][0].getGender() != c.getGender())) {
						continue;  // with the next iteration
					}
					
					seats[i][j] = c;
					System.out.println("Just reserved seat: "+ seat + "\n" + seats[i][j].getName() + " " + seats[i][j].getSurname() + "\n");
					return c.toString();
				} 
			} 
		}
		System.out.println("There is no free seat in this " + this.getClass().getSimpleName() + " for " + c.getName() + " " + c.getSurname() + "\n");
		return "";
	}
	
	
}
