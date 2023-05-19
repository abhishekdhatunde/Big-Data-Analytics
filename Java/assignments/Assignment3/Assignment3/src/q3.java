/*
3. Display food menu to user. User will select items from menu along with the quantity.(eg 1. Dosa 2. Samosa 3.Idli ... 10.Generate Bill) Assign fixed prices to food items(hard code the prices) 
 When user enters 'Generate Bill' option , display total bill & exit.
 
 */

import java.util.Scanner;

public class q3 {

	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    int amount = 0;
		    while(true) {
		      System.out.println("------------------------");
		      System.out.println("    item          price ");
		      System.out.println("------------------------");
		      System.out.println("1. Dosa            50   ");
		      System.out.println("2. Samosa          20   ");
		      System.out.println("3. Idli            30   ");
		      System.out.println("4. pani puri       20   ");
		      System.out.println("5. thali           60   ");
		      System.out.println("6. Momos           50   ");
		      System.out.println("7. Manchurian      80   ");
		      System.out.println("8. tea             10   ");
		      System.out.println("9. milk            20   ");
		      System.out.println("\n");
		      System.out.println("10. Generate bill and Exit");
		      System.out.println("-------------------------");
		      System.out.println("Enter your choice");
		      int choice = sc.nextInt();
		      if(choice ==1) {
		    	  System.out.println("HOW MANY YOU WANT");
		    	  int count = sc.nextInt();
		    	  amount += (count * 50);
		      }
		      if(choice == 2) {
		    	  System.out.println("HOW MANY YOU WANT");
		    	  int count = sc.nextInt();
		    	  amount += (count * 20);
		      }
		      if(choice ==3) {
		    	  System.out.println("HOW MANY YOU WANT");
		    	  int count = sc.nextInt();
		    	  amount += (count * 30);
		      }
		      if(choice == 4) {
		    	  System.out.println("HOW MANY YOU WANT");
		    	  int count = sc.nextInt();
		    	  amount += (count * 20);
		      }
		      if(choice == 5) {
		    	  System.out.println("HOW MANY YOU WANT");
		    	  int count = sc.nextInt();
		    	  amount += (count * 60);
		      }
		      if (choice == 6) {
		    	  System.out.println("HOW MANY YOU WANT");
		    	  int count = sc.nextInt();
		    	  amount += (count * 50);
		      }
		      if(choice == 7) {
		    	  System.out.println("HOW MANY YOU WANT");
		    	  int count = sc.nextInt();
		    	  amount += (count * 80);
		      }
		      if(choice == 8) {
		    	  System.out.println("HOW MANY YOU WANT");
		    	  int count = sc.nextInt();
		    	  amount += (count * 10);
			      }
		      if(choice == 9) {
		    	  System.out.println("HOW MANY YOU WANT");
		    	  int count = sc.nextInt();
		    	  amount += (count * 20);
			      }
		      if(choice == 10) {
		        System.out.println("Your total amount= "+amount);
		        break;
		      }
		    }

		  }

		}