package q1;

/*
 * 
 calculates the invoice amount (i.e. multiplies the quantity by the price per item), then returns the amount as a double value.
 If the quantity is not positive, it should be set to 0.
 If the price per item is not positive, it should be set to 0.0.
 Write a test application named InvoiceTest that demonstrate class Invoice’s capabilities.
 
 */

import java.util.Scanner;

public class invoicetest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		invoice n = new invoice();
		
		double amount = 0.0;
	    while(true) {
	      System.out.println("------------------------");
	      System.out.println("    item          price ");
	      System.out.println("------------------------");
	      System.out.println("1. tyre            5000   ");
	      System.out.println("2. clutch          2000   ");
	      System.out.println("3. gear            30000   ");
	      System.out.println("4. mirror          2000   ");
	      System.out.println("5. seat cover      600   ");
	      System.out.println("\n");
	      System.out.println("6. Generate bill and Exit");
	      System.out.println("-------------------------");
	      System.out.println("Enter your choice");
	      int choice = sc.nextInt();
	      if(choice ==1) {
	    	  System.out.println("PLEASE ENTER PART NUMBER");
	    	  n.setPart_num(sc.next());
	    	  
	    	  System.out.println("PLEASE ENTER PART DESCRIPTION");
	    	  n.setPart_description(sc.next());
	    	  
	    	  System.out.println("PRICE IS 5000. HOW MANY YOU WANT? ");
	    	  int quantity = sc.nextInt();
	    	  if (quantity <0) {
	    		  System.out.println("INVALID QUANTITY! PLEASE ENTER QUANTITY");
	    	  }
	    	  else {
	    		  n.setQuantity(quantity);
	    	  }
	    	  amount += (quantity * 5000);
	      }
	      
	      if(choice == 2) {
	    	  System.out.println("PLEASE ENTER PART NUMBER");
	    	  n.setPart_num(sc.next());
	    	  
	    	  System.out.println("PLEASE ENTER PART DESCRIPTION");
	    	  n.setPart_description(sc.next());
	    	  
	    	  System.out.println("PRICE IS 2000. HOW MANY YOU WANT? ");
	    	  int quantity = sc.nextInt();
	    	  if (quantity <0) {
	    		  System.out.println("INVALID QUANTITY! PLEASE ENTER QUANTITY");
	    	  }
	    	  else {
	    		  n.setQuantity(quantity);
	    	  }
	    	  amount += (quantity * 2000);
	      }
	      if(choice ==3) {
	    	  System.out.println("PLEASE ENTER PART NUMBER");
	    	  n.setPart_num(sc.next());
	    	  
	    	  System.out.println("PLEASE ENTER PART DESCRIPTION");
	    	  n.setPart_description(sc.next());
	    	  
	    	  System.out.println("PRICE IS 30000. HOW MANY YOU WANT? ");
	    	  int quantity = sc.nextInt();
	    	  if (quantity <0) {
	    		  System.out.println("INVALID QUANTITY! PLEASE ENTER QUANTITY");
	    	  }
	    	  else {
	    		  n.setQuantity(quantity);
	    	  }
	    	  amount += (quantity * 30000);
	      }
	      if(choice == 4) {
	    	  System.out.println("PLEASE ENTER PART NUMBER");
	    	  n.setPart_num(sc.next());
	    	  
	    	  System.out.println("PLEASE ENTER PART DESCRIPTION");
	    	  n.setPart_description(sc.next());
	    	  
	    	  System.out.println("PRICE IS 2000. HOW MANY YOU WANT? ");
	    	  int quantity = sc.nextInt();
	    	  if (quantity <0) {
	    		  System.out.println("INVALID QUANTITY! PLEASE ENTER QUANTITY");
	    	  }
	    	  else {
	    		  n.setQuantity(quantity);
	    	  }
	    	  amount += (quantity * 2000);
	      }
	      
	      if(choice == 5) {
	    	  System.out.println("PLEASE ENTER PART NUMBER");
	    	  n.setPart_num(sc.next());
	    	  
	    	  System.out.println("PLEASE ENTER PART DESCRIPTION");
	    	  n.setPart_description(sc.next());
	    	  
	    	  System.out.println("PRICE IS 600. HOW MANY YOU WANT? ");
	    	  int quantity = sc.nextInt();
	    	  if (quantity <0) {
	    		  System.out.println("INVALID QUANTITY! PLEASE ENTER QUANTITY");
	    	  }
	    	  else {
	    		  n.setQuantity(quantity);
	    	  }
	    	  amount += (quantity * 600);
	      }
	     
	      if(choice == 6) {
	        System.out.println("Your total amount= "+amount);
	        break;
	      }
	    }

	  }
	}



