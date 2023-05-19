package q2;

/*
  
 2.Create a class called Employee that includes three instance variables—a first name (type String), 
 a last name (type String) and a monthly salary (double). Provide a constructor that initializes the three instance variables. 
 Provide a set and a get method for each instance variable. If the monthly salary is not positive, do not set its value.
  Write a test application named EmployeeTest that demonstrates class Employee’s capabilities. Create two Employee objects and 
  display each object’s yearly salary. Then give each Employee a 10% raise and display each Employee’s yearly salary again.
  
 */

import java.util.Scanner;
class employee
{
	private String firstname;
	private String lastname;
	private double salary;
	Scanner sc = new Scanner(System.in);
	
	public employee() {
		
	}

	public employee(String firstname, String lastname, double salary) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.salary = salary;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void accept() {
		System.out.println("ENTER YOUR FIRSTNAME");
		this.setFirstname(sc.next());
		
		System.out.println("ENTER YOUR LASTNAME");
		this.setLastname(sc.next());
		
		System.out.println("ENTER YOUR SALARY");
		while (!sc.hasNextDouble() || sc.hasNextInt()) {
			
			System.out.println("INVALID SALARY! PLEASE ENTER VALID AMOUNT");
			sc.next();
		}
		double salary = sc.nextDouble();
		if(salary <0) {
			System.out.println("SALARY CAN NOT BE NEGATIVE");
		}
		else {
			this.setSalary(salary);
		}
		this.salary += (salary*0.10*12);
	}
	
	public void display() {
		System.out.println("NAME : "+ firstname+ " "+ lastname);
		System.out.println("SALARY OF 12 MONTHS : "+ salary);
	}
}
public class testapplication {

	public static void main(String[] args) {
		employee e = new employee();
		
		employee employee_data[] = new employee[2];
		for( int i = 0; i<employee_data.length;i++)
		{
			employee_data[i] = new employee();
			employee_data[i].accept();
		}
		for (employee employee : employee_data)
		{
			employee.display();
		}
	}
}
