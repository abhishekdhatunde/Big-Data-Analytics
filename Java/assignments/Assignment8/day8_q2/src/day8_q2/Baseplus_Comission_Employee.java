package day8_q2;

public class Baseplus_Comission_Employee extends Employee
{
	
	double comissionrate;
	float grosssales;
	float basesalary;
	
	public Baseplus_Comission_Employee() {
		super();

	}
	public Baseplus_Comission_Employee(String firstname, String lastname, String sSN, double comissionrate, float basesalary, float grosssales) {
		super(firstname, lastname, sSN);
		this.basesalary = basesalary;
		this.comissionrate = comissionrate;
		this.grosssales = grosssales;
		
	}
	
	
	public void salary() {
		this.setFinalSalary((this.comissionrate * this.grosssales)+this.basesalary);
	}
	
	public double print_Salary() {
		return this.getFinalSalary();
	}
	@Override
	public String toString() {
		return "Baseplus_Comission_Employee [Firstname()=" + this.getFirstname() + ", Lastname()= "+ this.getLastname() +  ", FinalSalary()=" + this.getFinalSalary() +  "]";
	}
	
	
	

}
