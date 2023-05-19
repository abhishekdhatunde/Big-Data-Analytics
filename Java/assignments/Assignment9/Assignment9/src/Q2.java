import java.util.Scanner;

/*
 
 Q2) Build a new Circle class with the following basic features:
 Attributes:
o Center point - Build instance variables for the circle’s center point (myX and myY represented as double values).
o Diameter - Build an instance variable for the circle’s diameter (myDiameter also represented as a double value).
 Behaviors
o Default constructor - Build a default constructor that initializes the circle’s center point to (0, 0) and its diameter to 100.
o Accessor methods - Build accessor methods for the two center coordinates and the diameter.
 Invariant
o The circle’s diameter should always be non-negative. maintain the integrity of each circle object by ensuring that the class invariant (that the diameter should be non-negative) is true at all times.
If the diameter is negative then throw user defined exception.

 */

class InputMismatchExceptions extends  Exception{
	InputMismatchExceptions(){
		System.out.println("DIAMETER SHOULD NOT BE NEGATIVE, PLEASE ENTER VALID NUMBER");
	}
}

public class Q2 {

	public static void main(String[] args) {
		double myX;
		double myY;
		double myDiameter;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("PLEASE ENTER FIRST CENTER POINT");
		myX = sc.nextDouble();
		
		System.out.println("PLEASE ENTER SECOND CENTER POINT");
		myY = sc.nextDouble();
		
		try {
		System.out.println("PLEASE ENTER DIAMETER");
		myDiameter = sc.nextDouble();
		if(myDiameter <0)
			throw new InputMismatchExceptions();
		else
			System.out.println("VALID INPUT");
		}
		catch(InputMismatchExceptions e) {
			
		}
	}
}
