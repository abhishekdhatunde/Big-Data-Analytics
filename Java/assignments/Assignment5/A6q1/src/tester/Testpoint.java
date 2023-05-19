package tester;
import java.util.Scanner;

import com.app.geometry.*;

public class Testpoint {

	public static void main(String[] args) {
		Print2D p1 = new Print2D();
		Print2D p2 = new Print2D();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter point of first coordinate");
		p1.setX(sc.nextInt());
		p1.setY(sc.nextInt());
		
		System.out.println("Enter point for second Coordinate");
		p2.setX(sc.nextInt());
		p2.setY(sc.nextInt());
		
		System.out.println("Entered points are equal? "+p1.equals(p2));
		System.out.println("distance between points is: "+p1.Distance(p2.getX(), p2.getY()));
		

	}

}
