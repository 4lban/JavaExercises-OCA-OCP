package chapter10;

public enum LoanStatus {

//	NOT_STARTED, 
//	APPLIED,
//	ASSESMENT,
//	APPROVED,
//	REJECTED,
//	USED,
//	PAYING,
//	PAID,
//	DEBTED;
	
// ***************************************************************
	
	NOT_STARTED("NS"), 
	APPLIED("APP"),
	ASSESMENT("ASSESS"),
	APPROVED("APPROVE"),
	REJECTED("R"),
	USED("U"),
	PAYING("P"),
	PAID("PAID"),
	DEBTED("DEBTED"),
	UNKNOWN("UNKNOWN");
	
	String dbKey;
	
	private LoanStatus(String dbKey) {
		this.dbKey = dbKey;
	}
	
	public static LoanStatus findByDbKey(String dbKey) {
		LoanStatus[] allValues = LoanStatus.values();	// get all values
		for (int i = 0; i < allValues.length; i++) {
			if (allValues[i].dbKey.equals(dbKey)) {
				return allValues[i];
			}
		}
		return UNKNOWN;	
	}
	
}
