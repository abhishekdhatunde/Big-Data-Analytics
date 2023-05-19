package day8_q2;

public class Hourly_employee extends Employee
{
	double hours_worked;
	double hourly_wage;

	public Hourly_employee() {
		super();

	}

	public Hourly_employee(String firstname, String lastname, String sSN, double hours, double wages) {
		super(firstname, lastname, sSN);
		this.hourly_wage = hours;
		this.hourly_wage = wages;
	}
	
	
	public double return_salary() {
		return this.getFinalSalary();
	}

	@Override
	public String toString() {
		return "Hourly_employee [ Firstname()="+ this.getFirstname() + ", Lastname()=" + this.getLastname() + ", FinalSalary()="
				+ this.getFinalSalary() + "]";
	}
	
	public double print_Salary() {
		return this.getFinalSalary();
	}

	@Override
	public void salary() {
		if (this.hours_worked <= 40)
		{
			this.setFinalSalary((this.hourly_wage * this.hours_worked));
			
		}
		else {
			this.setFinalSalary(40 * this.hourly_wage + (this.hours_worked - 40)*this.hourly_wage*1.5);
		}
	}
	
	
	
}
