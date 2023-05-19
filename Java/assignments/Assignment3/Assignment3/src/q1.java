//1. Accept a integer number and when the program is executed 
//print the binary, octal and hexadecimal equivalent of the given number.
//Sample Output:
//java Test
//Enter Number : 20
//Given Number :20
//Binary equivalent :10100
//Octal equivalent :24
//Hexadecimal equivalent :14
//Hint : toBinaryString() , toOctalString(), toHexString()

import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("PLEASE ENTER A NUMBER");
		int num1 = sc.nextInt();

		System.out.println("GIVEN NUMBER : "+num1);
		System.out.println("BINARY EQUIVALENT : "+ (Integer.toBinaryString(num1)));
		System.out.println("OCTAL EQUIVALENT : "+ (Integer.toOctalString(num1)));
		System.out.println("HEXADECIMAL EQUIVALENT : "+ (Integer.toHexString(num1)));

}
}
