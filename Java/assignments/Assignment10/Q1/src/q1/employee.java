package q1;

/*

Q1) Create Java application for fixed stack & growable stack based on Stack interface, for storing employee details.
1.1 Create Employee class -- id,name,salary, constructor,toString
1.2 Stack interface -- push & pop functionality for Emp refs. & declare STACK_SIZE as a constant.
1.3 Create implementation class of Stack i/f -- FixedStack (array based)
1.4 Create another implementation class of Stack i/f-- GrowableStack (array based)
1.5 Create Tester class (Hint : use dynamic method dispatch using interfaces)
Display Menu
Note : Must use 1 switch-case only. You won't need any complex nested control structure
Once user selects either fixed or growable stack , user shouldn't be allowed to change the selection of the stack.
(Hint : null checking)
1 -- Choose Fixed Stack
2 -- Choose Growable Stack
Accept following options only after initial selection.(Hint : null checking)
3 -- Push data
I/P : Accept emp details & store these details in the earlier chosen stack or give error mesg : NO stack chosen !!!
4 --- Pop data & display the same (from the earlier chosen stack or give error mesg : NO stack chosen !!!)
No inputs are required : pop emp details from the top of the stack
5 -- Exit
Q2) Write a Java program to create a new array list, add some colors (string) and print out the collection as sorted list. 
Q3) Write a Java program to replace the second element of a ArrayList with the specified element.
 
 */
import java.util.Scanner;

public class employee {
	
	private int id;
	private String name;
	private double salary;
	
	public employee() {
		
	}

	public employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [Id: " + id + ", Name :" + name + ", Salary: " + salary + "]";
	}
	
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER NAME OF EMPLOYEE");
		name = sc.nextLine();
		System.out.println("ENTER id OF EMPLOYEE");
		id = sc.nextInt();
		System.out.println("ENTER NAME OF EMPLOYEE");
		salary = sc.nextDouble();
	}
}
