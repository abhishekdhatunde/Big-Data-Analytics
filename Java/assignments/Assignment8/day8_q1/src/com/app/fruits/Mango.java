package com.app.fruits;

public class Mango extends Fruit
{
	public Mango() {
		super();
	}

	public Mango(String name, String color, double weight, boolean isfresh) {
		super(name, color, weight, isfresh);
	}
	
	public String taste()
	{
		return "sweet";
	}

}
