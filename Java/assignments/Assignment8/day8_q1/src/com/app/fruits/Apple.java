package com.app.fruits;

public class Apple extends Fruit 
{
	Apple()
	{
		super();
	}

	public Apple(String name, String color, double weight, boolean isfresh) {
		super(name, color, weight, isfresh);
	}

	
	public String taste() {
		return "sweet n sour";
	}
	

}
