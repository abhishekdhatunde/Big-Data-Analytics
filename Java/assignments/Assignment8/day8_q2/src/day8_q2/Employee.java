package day8_q2;

public abstract class Employee 
{
	private String firstname;
	private String lastname;
	private String SSN;
	private double FinalSalary;
	
	public Employee()
	{
		
	}

	public Employee(String firstname, String lastname, String sSN) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.SSN = sSN;
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

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}

	public double getFinalSalary() {
		return FinalSalary;
	}

	public void setFinalSalary(double finalSalary) {
		FinalSalary = finalSalary;
	}

	@Override
	public String toString() {
		return "Employee [firstname=" + firstname + ", lastname=" + lastname + ", SSN=" + SSN + "]";
	}
	
	public abstract void salary();
	
	
	
	

}
