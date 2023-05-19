package q1;


public class Fixedstack implements stack {
	private int TOP;
	private employee[] emp;
	
	public Fixedstack() {
		TOP = -1;
		emp = new employee[STACK_SIZE];
	}
	
	@Override
	public void push(employee e) {
		if(TOP == STACK_SIZE-1) {
			System.out.println("Stack overflow!!");
		}
		else {
			emp[++TOP]= e;
		}
	}
		
	@Override
	public employee pop() {
		if(TOP==-1) { 
			System.out.println("Stack Underflow!!");
			return null;
		}
		else {
			System.out.println();
			return emp[TOP--]=null;
		}
	}

	@Override
	public void display() {
		for(employee e : emp) {
			if(e != null) {
				System.out.println(e.toString());
			}
		}
	}
	
}
