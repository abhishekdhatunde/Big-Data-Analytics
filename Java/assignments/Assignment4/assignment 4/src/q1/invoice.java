package q1;

/*
 
 1. Create a class called Invoice that a hardware store might use to represent an invoice for an item sold at the store. 
 An Invoice should include four pieces of information as instance variables—a part number (type String), a part description 
 (type String), a quantity of the item being purchased (type int) and a price per item (double). Your class should have a 
 constructor that initializes the four instance variables. Provide a set and a get method for each instance variable. 
 calculates the invoice amount (i.e. multiplies the quantity by the price per item), then returns the amount as a double value.
 If the quantity is not positive, it should be set to 0.
 If the price per item is not positive, it should be set to 0.0.
 Write a test application named InvoiceTest that demonstrate class Invoice’s capabilities.
 
 */

public class invoice {
	String part_num;
	String part_description;
	int quantity;
	double price;
	
	public invoice() {
		
	}

	public invoice(String part_num, String part_description, int quantity, double price) {
		super();
		this.part_num = part_num;
		this.part_description = part_description;
		this.quantity = quantity;
		this.price = price;
	}

	public String getPart_num() {
		return part_num;
	}

	public void setPart_num(String part_num) {
		this.part_num = part_num;
	}

	public String getPart_description() {
		return part_description;
	}

	public void setPart_description(String part_description) {
		this.part_description = part_description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
