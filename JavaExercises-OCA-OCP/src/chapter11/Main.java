package chapter11;

public class Main {

	public static void main(String[] args) {

		Vehicle car = new Car();
		Vehicle bus = new Bus();
		Vehicle plane = new Plane();
		 
		Customer c1 = new Customer(01, "Alban", "Maxhuni", true, 'm');
		Customer c2 = new Customer(05, "Ardian", "Maxhuni", false, 'm');
		Customer c3 = new Customer(12, "Adi", "Maxhuni", true, 'f');
		Customer c4 = new Customer(45, "Hashim", "Maxhuni", false, 'm');
		Customer c5 = new Customer(44, "Lana", "Rama", true, 'f');
		Customer c6 = new Customer(13, "Gent", "Mucolli", true, 'm');
		
//		car.listSeats();
//		car.reserveSeat(c1);
//		car.reserveSeat(c2);
//		car.reserveSeat(c1);
//		car.listSeats();
		
//		bus.listSeats();
//		bus.reserveSeat(c1);
//		bus.reserveSeat(c5);
//		bus.reserveSeat(c3);
//		bus.reserveSeat(c6);
//		bus.listSeats();
		
		plane.listSeats();
		plane.reserveSeat(c1);
		plane.reserveSeat(c5);
		plane.reserveSeat(c3);
		plane.reserveSeat(c6);
		plane.listSeats();
		
	}

}
