package tester;

import java.util.Scanner;

import com.app.geometry.Print2D;

public class TesterPointArray1 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static Print2D accept() 
	{
		double x;
		double y;
		System.out.println("x= ");
		x = sc.nextDouble();
		
		System.out.println("y= ");
		y = sc.nextDouble();
		
		return new Print2D(x,y);
	}

	public static void main(String[] args) 
	{
		
		int n;
		System.out.println("Enter number of points you want to enter:");
		n = sc.nextInt();
		Print2D[] points = new Print2D[n];
		
		
		
		for(int i= 0; i<n; i++)
		{
			System.out.println("Enter the coordinate of "+(i+1)+" point");
			points[i] = accept();	
		}
		
		while(true)
		{
			System.out.println("-------- menu --------");
			System.out.println("1. Display details of specific index");
			System.out.println("2. Display x,y coordinates of all points");
			System.out.println("3. Distance between two points");
			System.out.println("4. exit");
			System.out.println();
			System.out.println("Enter your coice");
			
			int choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
			{
				System.out.println("Enter the index of point to see");
				int index = sc.nextInt();
				if (index < n)
				{
					System.out.println(points[index].getDetails());
				}
				else
					System.out.println("Invalid index");
				System.out.println();
				break;
			}
			case 2:
			{
				for (int i = 0; i<n; i++)
				{
					points[i].getDetails();
				}
				System.out.println();
				break;
			}
			case 3:
			{
				System.out.println("Enter the index of first coordinate:");
				int n1 = sc.nextInt();
				System.out.println("Enter the index of second point: ");
				int n2 = sc.nextInt();
				System.out.println();
				if (n1<= n &&  n2<=n)
				{
					System.out.println("Are entered points equal? "+points[n1-1].equals(points[n2-1]));
					System.out.println("Distance between points: "+points[n1-1].calculateDistance(points[n2-1].getX(), points[n2-1].getY()));
					System.out.println();
				}
				else
				{
					System.out.println("Invalid index");
					System.out.println();
				}
					
				break;
			}
			
			}
			if(choice == 4)
				break;
			if (choice > 4)
				System.out.println("Invalid choice");
			
		}
		
				
		}	
				

	

}
