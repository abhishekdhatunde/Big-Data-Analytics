package a12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Q2 ) Write a Java program to store text file content line by line into an array

public class Q2 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER STRING");
		String pathName = sc.nextLine();
		File f = new File(pathName);
		Scanner sc1 = new Scanner(pathName);
		int [] arr = new int [50];
		int i = 0;
		
		while(sc1.hasNextInt()) {
			arr[i++] = sc1.nextInt();
		}
		
		}
		

	}

