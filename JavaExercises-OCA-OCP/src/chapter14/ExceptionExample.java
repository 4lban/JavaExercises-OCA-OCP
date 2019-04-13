package chapter14;

public class ExceptionExample {

	public static void main(String[] args) {

		int id = 0;
		try {
			id = Integer.parseInt("sadsdsdss");
		} catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("String has been tried to convert into an integer");
		}
		
		System.out.println(id);
		
		System.out.println("Program has finished");
		
	}

}
