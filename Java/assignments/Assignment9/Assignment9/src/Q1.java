import java.util.Scanner;

/*
 
 define a new exception, called ExceptionLineTooLong, that prints out the error message 
 "The strings is too long". Write a program that reads a String from user and calculates 
 its length. and throws an exception of type ExceptionLineTooLong in the case where a string of 
 length is more than 80 characters.
 
 */

class ExceptionLineTooLong extends Exception
{
	ExceptionLineTooLong()
	{
		System.out.println("THE STRING IS GREATER THAN 80");
	}
}
public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		
		try {
			System.out.println("PLEASE ENTER STRING");
			s = sc.nextLine();
			if (s.length()>80) 
				throw new ExceptionLineTooLong();
			else
				System.out.println("VALID STRING");	
		}
			catch(ExceptionLineTooLong e) {

			}
		}

	}


