package calcuator;

public class Cal 
{
	private int account_number;
	private int begining;
	private int charges;
	private int balance;
	private int credits;
	private int limit;
	
	public int getAccount_number() {
		return account_number;
	}
	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}
	public int getBegining() {
		return begining;
	}
	public void setBegining(int begining) {
		this.begining = begining;
	}
	public int getCharges() {
		return charges;
	}
	public void setCharges(int charges) {
		this.charges = charges;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	
	
	public void check()
	{
		this.setBalance(this.getBegining() + this.getCharges() - this.getCredits());
		if(this.getBalance() < this.getLimit()) 
		{
			System.out.println("Credit limit exceeded");
		}
		else
		{
			System.out.println("Balance= "+this.getBalance());
		}
	}
	

}
