package day8_q2;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String Firstname;
		String lastname;
		String SSN;
		
		System.out.println("Enter First Name");
		Firstname = sc.nextLine();
		System.out.println("Enter last name");
		lastname = sc.next();
		System.out.println("Enter SSN number");
		SSN = sc.next();
				
		System.out.println("SALARY OF EMPLOYEE AS Salaried Employee");
		Salaried_Employee s1 = new Salaried_Employee(Firstname, lastname, SSN);
		s1.salary();
		System.out.println(s1);
		System.out.println();
		
		System.out.println("Enter Hourly Employee data------");
		System.out.println("Number of hours worked");
		double hour = sc.nextDouble();
		System.out.println("Wages per hour-");
		double wage = sc.nextDouble();
		Hourly_employee h1 = new Hourly_employee(Firstname, lastname, SSN, hour, wage);
		h1.salary();
		System.out.println(h1);
		System.out.println();
		
		System.out.println("Comission Employee data------");
		System.out.println("Enter comission Rate");
		float rate = sc.nextFloat();
		System.out.println("Enter gross sales");
		double sale = sc.nextDouble();
		Comission_Employee c1 = new Comission_Employee(Firstname, lastname, SSN, sale, rate );
		c1.salary();
		System.out.println(c1);
		System.out.println();
		
		
		System.out.println("Base plus comission employee data-----");
		System.out.println("Enter base salary");
		float salary = sc.nextFloat();
		System.out.println("Enter Sales");
		float sales = sc.nextFloat();
		System.out.println("Enter the comission rate");
		double rate1 = sc.nextDouble();
		Baseplus_Comission_Employee b1 = new Baseplus_Comission_Employee(Firstname, lastname, SSN, rate1, salary, sales);
		b1.salary();
		System.out.println(b1);
		

	}

}
