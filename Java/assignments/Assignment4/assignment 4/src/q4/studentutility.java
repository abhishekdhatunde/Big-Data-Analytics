package q4;

import java.util.Scanner;

public class studentutility {
	students s = new students();
	Scanner sc = new Scanner(System.in);
	
	public void accept() {
		System.out.println("PLEASE ENTER YOUR NAME");
		s.name = sc.next();
		
		System.out.println("PLEASE ENTER YOUR ROLL NUMBER");
		s.rollno = sc.nextInt();
		
		System.out.println("PLEASE ENTER YOUR MOBILE NUMBER");
		s.mobileno = sc.nextInt();
		
		System.out.println("PLEASE ENTER YOUR MARKS OF AA");
		s.marks1 = sc.nextInt();
		
		System.out.println("PLEASE ENTER YOUR MARKS OF PYTHON");
		s.marks2 = sc.nextInt();
		
		System.out.println("PLEASE ENTER YOUR MARKS OF PML");
		s.marks3 = sc.nextInt();
		
		System.out.println("PLEASE ENTER YOUR MARKS OF DV");
		s.marks4 = sc.nextInt();
		
		System.out.println("PLEASE ENTER YOUR MARKS OF BD");
		s.marks5 = sc.nextInt();
	}
	
	public void data() {
		System.out.println("NAME : "+s.name);
		System.out.println("ROLL NUMBER : "+s.rollno);
		System.out.println("MOBILE NUMBER : "+s.mobileno);
		System.out.println("MARKS = AA : "+s.marks1+"PYTHON : "+s.marks2+"PML : "+s.marks3+"DV : "+ s.marks4+"BD : "+s.marks5);
		
		int average;
		average = ((s.marks1+s.marks2+s.marks3+s.marks4+s.marks5)/5);
		
		if ( average>80) {
			System.out.println("GRADE : "+ "A");
		}
		
		if ( average>70 && average<80) {
			System.out.println("GRADE : "+ "B");
		}
		
		if ( average>50 && average<70) {
			System.out.println("GRADE : "+ "C");
		}
		
		if ( average>40 && average<50) {
			System.out.println("GRADE : "+ "D");
		}
		
		if ( average>35 && average<40) {
			System.out.println("GRADE : "+ "D");
		}
		
		if ( average<35) {
			System.out.println("GRADE :"+ "FAIL");
		}
	}
	public void display() {
		studentutility emp_data[]= new studentutility[4];
		for( int i =0; i< emp_data.length; i++)
		{
			emp_data[i] = new studentutility();
			emp_data[i].accept();
			
		}
		for (studentutility studentutility : emp_data)
		{
			studentutility.data();
		}
	}
}
