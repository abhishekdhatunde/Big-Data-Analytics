package com.app.fruits;

public class Orange extends Fruit
{
	public Orange() {
		super();

	}

	public Orange(String name, String color, double weight, boolean isfresh) {
		super(name, color, weight, isfresh);
	}
	
	public String taste() {
		return "sour";
	}

}
