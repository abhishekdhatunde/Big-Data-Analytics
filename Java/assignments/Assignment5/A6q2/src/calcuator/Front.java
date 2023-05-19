package calcuator;

import java.util.Scanner;

public class Front {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Cal c1 = new Cal();
		System.out.println("Enter Account number: ");
		c1.setAccount_number(sc.nextInt());
		System.out.println("Enter balance at beginning");
		c1.setBegining(sc.nextInt());
		System.out.println("Enter total of all items charged by the customer this month");
		c1.setCharges(sc.nextInt());
		System.out.println("Enter total of all credits applied to the customer's account this month");
		c1.setCredits(sc.nextInt());
		System.out.println("Enter allowed credit limit");
		c1.setLimit(sc.nextInt());
		
		c1.check();
		
	}

}
