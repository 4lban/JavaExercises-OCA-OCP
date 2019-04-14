package chapter14;

public class MyGreatTime {

	private int second;
	private int minute;
	private int hour;
	
	public MyGreatTime() {
	}
	
	public int getSecond() {
		return second;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public int getHour() {
		return hour;
	}
	
	public void setSecond(int second) throws ValueException {
		if(second > 60)
			throw new ValueException();
		this.second = second;
	}
	
	public void setMinute(int minute) throws ValueException {
		if(minute > 60)
				throw new ValueException();
		this.minute = minute;
	}
	
	public void setHour(int hour)  throws ValueException {
		this.hour = hour;
	}
	
}
