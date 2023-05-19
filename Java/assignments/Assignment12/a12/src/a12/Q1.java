package a12;

import java.io.File;
import java.util.Scanner;

/*

Based on File Handling Q1) Write a Java program to check if a file or directory specified 
by pathname exists or no. Q2 ) Write a Java program to store text file content line by line into an array 
Q3) Write a Java program to find the longest word in a text file. 
Q4)Write a java program to find whether the file is Hidden file or not inside the directory. 
Hint : The IO package of java contains a special method named isHidden()

 */
public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER STRING");
		String pathName = sc.nextLine();
		File f = new File(pathName);
		boolean status;
		status = f.mkdir();
		System.out.println("Status of the File ="+status);
	}

}
