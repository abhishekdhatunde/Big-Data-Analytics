package q1;

public class Growablestack implements stack{
	
	private int TOP;
	private employee[] emp;
	
	public Growablestack() {
		TOP = -1;
		emp = new employee[STACK_SIZE];
	}
	
	@Override
	public void push(employee e) {
		
		if(TOP < emp.length) {
			 emp[++TOP]= e;
		}
		else {
			employee copyemp[] = new employee[emp.length*2];
			for(int i=0;i<emp.length;i++) {
				copyemp[i] = emp[i];
			}
			copyemp = emp;
			emp[++TOP] = e;
		}	
	}
	
	@Override
	public employee pop() {
		if(TOP==-1) { 
			System.out.println("Stack Underflow!!");
			return null;
		}
		else {
			return emp[TOP--] = null;
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