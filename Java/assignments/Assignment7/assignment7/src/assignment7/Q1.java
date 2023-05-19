package assignment7;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		StringBuilder snew = new StringBuilder(s);
		System.out.println(" reverse string is "+snew.reverse() );

	}

}
