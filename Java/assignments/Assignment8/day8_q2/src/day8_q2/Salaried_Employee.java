package day8_q2;

import java.util.Scanner;

public class Salaried_Employee extends Employee 
{

	
	Scanner sc = new Scanner(System.in);
	
	public Salaried_Employee() {
		super();

	}

	public Salaried_Employee(String firstname, String lastname, String sSN) {
		super(firstname, lastname, sSN);

	}
	
	
	public double return_salary() {
		return this.getFinalSalary();
	}

	@Override
	public String toString() {
		return "Salaried_Employee [Firstname()=" + this.getFirstname() + ", Lastname()=" + this.getLastname()+ ", SSN()=" + this.getSSN() + ", Salary()=" + this.getFinalSalary()+ "]";
		}
	

	@Override
	public void salary() {
		System.out.println("Enter the Salary");
		this.setFinalSalary(sc.nextFloat());
		
	}

	
	
	
	
	
}
