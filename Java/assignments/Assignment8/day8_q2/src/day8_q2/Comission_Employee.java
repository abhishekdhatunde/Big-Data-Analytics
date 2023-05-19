package day8_q2;

public class Comission_Employee extends Employee
{
	double grosssales;
	float CommissionRate;
	
	
	public Comission_Employee() {
		super();
	}
	
	
	public Comission_Employee(String firstname, String lastname, String sSN, double grosssales, float comissionrate) {
		super(firstname, lastname, sSN);
		this.CommissionRate = comissionrate;
		this.grosssales = grosssales;
		
	}
	
	public void salary() {
		this.setFinalSalary((this.grosssales* this.CommissionRate));
	}
	
	public String toString() {
		return "Comission_Employee [ Firstname()= "+ this.getFirstname() + ", Lastname()=" + this.getLastname() +  ", FinalSalary()= "+ this.getFinalSalary() + "]";
	}
	
	
	public double print_Salary() {
		return this.getFinalSalary();
	}
	
	

}
