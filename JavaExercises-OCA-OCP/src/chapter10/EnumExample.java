package chapter10;

import java.math.BigDecimal;

public class EnumExample {

	public static void main(String[] args) {

		Loan loan = new Loan(new BigDecimal("3000"), "alban maxhuni");
		loan.status = LoanStatus.APPLIED;
		System.out.println(loan.status);
		
		LoanStatus[] allStatus = LoanStatus.values();	// get all values
		
		for (int i = 0; i < allStatus.length; i++) {
			System.out.println(allStatus[i] + " " + allStatus[i].dbKey);
		}
		
		int ordinal = LoanStatus.APPROVED.ordinal();	// index of enum APPROVED
		System.out.println(ordinal);
		
		System.out.println("\n******** Converting String to corresponding enum item ********\n");
		
		// You queried a loan
		LoanStatus status = LoanStatus.valueOf("NOT_STARTED");
		System.out.println("Db key of NOT_STARTED: " + status.dbKey);
		
		status = LoanStatus.findByDbKey("U");
		System.out.println(status);
		
		status = LoanStatus.findByDbKey("X");
		System.out.println(status);
		
	}

}
