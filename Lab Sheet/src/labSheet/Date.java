package labSheet;

public class Date {

	//instance var
	private int month;
	private int day;
	private int year;
	
	//constructor
	public Date(int month, int day, int year) {
		this.month = month;
		this.year = year;
		this.day = day;	
	}
	
	//setMethods
	public void setMonth(int month) {
		this.month= month;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	//getMethods
	public int getMonth() {
		return month;
	}
	
	public int getDay() {
		return day; 
	}
	public int getYear() {
		return year;
	}
	
	//diplay method
	public void displayDate() {
		System.out.printf("%d" + "/" + "%d"+"/"+ "%d", month, day, year);
	}
	
	
}
