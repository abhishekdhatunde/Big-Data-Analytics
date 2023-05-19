package tester;

import java.util.Scanner;

import com.app.geometry.Print2D;

public class TestPoint {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Print2D p1 = new Print2D();
		Print2D p2 = new Print2D();
		
		System.out.println("Enter coordinates of first point:");
		System.out.println("x: ");
		p1.setX(sc.nextInt());
		System.out.println("y: ");
		p1.setX(sc.nextInt());

		System.out.println("Enter coordinates of second point:");
		System.out.println("x: ");
		p2.setX(sc.nextInt());
		System.out.println("y: ");
		p2.setX(sc.nextInt());
		
		System.out.println("Are entered points same? "+p1.equals(p2));
		System.out.println("Distance between points: "+p1.calculateDistance(p2.getX(), p2.getY()));


	}

}
