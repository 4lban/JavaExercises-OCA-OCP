package chapter12;

public class MyTime {

	int amount;
	TimeUnit unit;
	
	public MyTime(int amount, TimeUnit unit) {
		super();
		this.amount = amount;
		this.unit = unit;
	}
	
	public TimeUnit getUnit() {
		return unit;
	}

	@Override
	public boolean equals(Object obj) {
		
		if((this == null) && (obj == null) )
			return false;
		
		int days = this.amount;
		if(this.unit == TimeUnit.WEEK)
			days = this.amount * 7;
		if (this.unit == TimeUnit.MONTH) {
			days = this.amount * 28;
		}
		
		if(obj instanceof MyTime) {
			if(( ((MyTime)obj).unit == TimeUnit.DAY) && (days == ((MyTime)obj).amount) ) {
				return true;
			}
			if(( ((MyTime)obj).unit == TimeUnit.WEEK) && (days == ((MyTime)obj).amount*7) ) {
				return true;
			}
			if(( ((MyTime)obj).unit == TimeUnit.MONTH) && (days == ((MyTime)obj).amount*28) ) {
				return true;
			}
		}
		return false;
	}
	
}
