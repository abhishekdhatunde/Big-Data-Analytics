package assignment7;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER STRING AND CHECK IF IT IS PALINDROME OR NOT");
		String s = sc.nextLine();
		
		StringBuilder snew = new StringBuilder(s);
		String srev = new String(snew.reverse());
		System.out.println(s.equals(srev));

	}

}
