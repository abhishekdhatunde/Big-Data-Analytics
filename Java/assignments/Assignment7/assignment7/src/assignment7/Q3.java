package assignment7;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Q3 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER STRING");
		String s = sc.nextLine();
		
		StringTokenizer stk = new StringTokenizer(s);
		System.out.println("COUNT OF A STRING "+stk.countTokens());

	}

}
