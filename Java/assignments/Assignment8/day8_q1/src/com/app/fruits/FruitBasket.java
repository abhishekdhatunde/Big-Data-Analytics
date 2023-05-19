package com.app.fruits;

import java.util.Arrays;
import java.util.Scanner;

public class FruitBasket 
{

	
	
	public static void main(String[] args) 
	{
		int n; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Basket");
		n = sc.nextInt();
		Fruit basket[] = new Fruit[n];
	
		String name;
		String color;
		double weight;
		boolean isfresh;
		
		
		int count = 0;
		int choice;
		while(true)
		{
			System.out.println();
			System.out.println("------ menu ------");
			System.out.println("1. Add Mango");
			System.out.println("2. Add Orange");
			System.out.println("3. Add Apple");
			System.out.println("4. Display names of all the fruits in basket");
			System.out.println("5. Display name, color, weight, tasteof all the fruit in the basket");
			System.out.println("6. Display taste of all stall(not fresh) fruits in the basket");
			System.out.println("7. Marke a fruit as stale");
//			System.out.println("8. Mark all sour fruits stale");
			System.out.println("8. Exit");
			System.out.println();
			System.out.println("Enter your choice:");
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
				{
					if(count < n)
					{
						
						int temp;
						name = "Mango";
						color = "Yellow";
						System.out.println(" Enter the weight of Mango");
						weight = sc.nextDouble();
						System.out.println("Is fruit fresh");
						System.out.println("1. Yes");
						System.out.println("2. No");
						temp = sc.nextInt();
						if (temp == 1) {
							isfresh = true;
						}
						else {
							isfresh = false;
						}
						basket[count] = new Mango(name, color, weight, isfresh);
						System.out.println(Arrays.toString(basket));
						count += 1;
					}
					else {
						System.out.println("Basket is full");
					}
					break;
			
				}
			
				case 2:
				{
					if (count < n)
					{
						
						int temp;
						name = "Orange";
						color = "Orange";
						System.out.println(" Enter the weight of Orange");
						weight = sc.nextDouble();
						System.out.println("Is fruit fresh");
						System.out.println("1. Yes");
						System.out.println("2. No");
						temp = sc.nextInt();
						if (temp == 1) {
							isfresh = true;
						}
						else {
							isfresh = false;
						}
						basket[count] = new Orange(name, color, weight, isfresh);
						System.out.println(Arrays.toString(basket));
						count += 1;
					}
					else {
						System.out.println("Basket if full");
					}
					
					break;
				}
				case 3:
				{
					if(count < n)
					{
						
						int temp;
						name = "Apple";
						color = "Apple";
						System.out.println(" Enter the weight of Apple");
						weight = sc.nextDouble();
						System.out.println("Is fruit fresh");
						System.out.println("1. Yes");
						System.out.println("2. No");
						temp = sc.nextInt();
						if (temp == 1) {
							isfresh = true;
						}
						else {
							isfresh = false;
						}
						basket[count] = new Apple(name, color, weight, isfresh);
						System.out.println(Arrays.toString(basket));
						count += 1;
					}
					else {
						System.out.println("Basket is full");
					}
					break;
				}
				case 4:
				{
					System.out.println("Fruits in your Basket- ");
					for(int i= 0; i< count; i++)
					{
						System.out.println(basket[i].getName());
						
					}
					break;
				}
				case 5:
				{
					System.out.println("Details of all the fruits in basket");
					for(int i=0; i<count; i++)
					{
						System.out.println("Name= "+basket[i].getName()+" color= "+basket[i].getColor()+" Weight= "+basket[i].getWeight()+" Fresh= "+basket[i].getIsfresh());
					}
					break;
				}
				case 6:
				{
					for(int i=0; i< count; i++)
					{
						if( basket[i].getIsfresh() == false)
						{
							System.out.println("taste = "+basket[i].taste());
						}
					}
					break;
				}
				case 7:
				{
					System.out.println("Enter the name of fruit to mark as stale");
					String name1 = sc.next();
					for(int i=0; i<count; i++)
					{
						if(basket[i].getName() == name1)
						{
							basket[i].setIsfresh(false);
						}
					}
				}
				case 8:
					break;
			}
			if(choice == 8)
				{
				System.out.println("Thank you for Shopping");
				break;
				}
		}

	}

}
