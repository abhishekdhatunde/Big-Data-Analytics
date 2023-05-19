package com.app.geometry;

import java.util.Objects;

public class Print2D 
{
	private double x;
	private double y;
	
	public Print2D() {

	}

	public Print2D(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Print2D [x=" + x + ", y=" + y + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Print2D other = (Print2D) obj;
		return Double.doubleToLongBits(x) == Double.doubleToLongBits(other.x)
				&& Double.doubleToLongBits(y) == Double.doubleToLongBits(other.y);
	}
	
	public double calculateDistance(double x2, double y2)
	{
		double a = Math.pow(this.getX() - x2, 2);
		double b = Math.pow(this.getY() - y2, 2);
		
		return Math.sqrt(a+b);
	}
	
	
	public String getDetails()
	{
		return "x= "+this.getX()+" y= "+this.getY();
	}
	
}
