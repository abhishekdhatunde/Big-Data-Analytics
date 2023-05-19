
/*
	 
	 3. Create a class called Date that includes three instance variables—a month (type int), 
	 a day (type int) and a year (type int). Provide a constructor that initializes the three instance 
	 variables and assumes that the values provided are correct. Provide a set and a get method for each instance variable. 
	 Provide a method displayDate that displays the month, day and year separated by forward slashes (/). 
	 Write a test application named DateTest that demonstrates class Date’s capabilities.
	 
*/

import java.util.Scanner;

class date{
	private int day;
	private int month;
	private int year;
	Scanner sc = new Scanner(System.in);
	
	public date() {

	}
	
	public date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void accept() {
		System.out.println("PLEASE ENTER DAY");
		this.day = sc.nextInt();
		
		System.out.println("PLEASE ENTER MONTH");
		this.month = sc.nextInt();
		
		System.out.println("PLEASE ENTER YEAR");
		this.year = sc.nextInt();
		
	}
	
	public void display() {
		System.out.println("Date : "+day+"/"+month+"/"+year);
	}
	
}

public class q3 {
	
	public static void main(String[] args) {
		date d = new date();
		d.accept();
		d.display();
	}
	

}
