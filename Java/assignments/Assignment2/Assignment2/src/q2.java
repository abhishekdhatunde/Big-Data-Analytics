//Create a class Complex having 2 fields as real and imag.
//Write one init method to initialize the real and imag. 
//Create an instance in main and call that init method. 
//Pass 2 command line arguments to use it to initialize your real and imag.
//(hint - keep init() method as parameterized)
import java.util.Scanner;

class Complex{
	int real;
	int imag;
	Complex(int real, int imag) {
		this.real = real;
		this.imag = imag;
	}
	Complex(){
		real = 2;
		imag = 3;
	}
	
	void acceptnum()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("PLEASE ENTER REAL NUMBER");
		this.real = sc.nextInt();
		System.out.println("PLEASE ENTER IMAG NUMER");
		this.imag = sc.nextInt();
	}
	void printnum() {
		System.out.println("COMPLEX : "+real+"+"+imag+"i");
	}
}
public class q2 {

	public static void main(String[] args) {
		Complex c = new Complex();
		c.acceptnum();
		c.printnum();
		Complex c1 =new Complex(6,9);
		c1.printnum();
	}
}
