/*

2. Accept 2 double values from User (using Scanner). 
Check data type. If arguments are not doubles, 
supply suitable error message & terminate.
If numbers are double values, print its average.

*/


import java.util.Scanner;

public class q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double arr [] = new double[2];
		for ( int i = 0; i<arr.length; i++) {
		System.out.println("PLEASE ENTER A DOUBLE NUMBER");
		while(!sc.hasNextDouble() || sc.hasNextInt())
		{
			System.out.println("INVALID NUMBER!! PLEASE ENTER NEW NUMBER");
			sc.next();
		}
		double num = sc.nextDouble();
		arr[i] = num;
		}
		System.out.println("AVERAGE WILL BE : "+ ((arr[0]+arr[1])/2));
	}

}
