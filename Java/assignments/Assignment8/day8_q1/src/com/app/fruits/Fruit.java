package com.app.fruits;

public class Fruit 
{
	private String name;
	private String color;
	private double weight;
	private boolean isfresh;
	
	Fruit()
	{
		
	}

	public Fruit(String name, String color, double weight, boolean isfresh)
	{
		super();
		this.name = name;
		this.color = color;
		this.weight = weight;
		this.isfresh = isfresh;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean getIsfresh() {
		return isfresh;
	}

	public void setIsfresh(boolean isfresh) {
		this.isfresh = isfresh;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", color=" + color + ", weight=" + weight + "]";
	}
	
	public String taste() {
		return "no specific taste";
	}
	
	
	

}
