package com.app.geometry;

import java.util.Objects;

public class Print2D 
{
	
	float x;
	float y;
	public Print2D() 
	{
		
	}
	public Print2D(float x, float y)
	{
		this.x = x;
		this.y = y;
	}
	
	
	
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	public String getDetails()
	{
		return "coordinates are: x- "+this.x+", y-"+this.y;
		
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
		return Float.floatToIntBits(x) == Float.floatToIntBits(other.x)
				&& Float.floatToIntBits(y) == Float.floatToIntBits(other.y);
	}
	
	
	public double Distance(float a, float b) 
	{
		double x = Math.pow(this.x - a, 2);
		double y = Math.pow(this.y-b, 2);
		double distance = Math.sqrt(x+y);
		return distance;
		
	}
	
	

}
