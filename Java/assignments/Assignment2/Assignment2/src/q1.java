
//Pass 2 int values through command line hold them in int variables as lower and upper.
//In this given range print all the prime numbers

import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("PLEASE ENTER LOWER BOUND");
		int num1 = sc.nextInt();
		System.out.println("PLEASE ENTER UPPER BOUND");
		int num2 = sc.nextInt();
		
		for (int i = num1; i<num2; i++)
		{
			int count = 0;
			for( int j = 2; j<=i; j++ ){
				if ( i%j == 0) {
					count++;
				}
			}
			if ( count== 1) {
				System.out.println(i);
			}
		}
	}
}
