package p1;
import java.util.*;
enum Category{
	cate(1,"ROMANCE");
	private int i;
	private String name;
	private Category(int i, String name) {
		this.i = i;
		this.name = name;
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
}





public class Bookdetails 
{
	
	Category category;
	String isbn;
	double price;
	Date PublishDate;
	String authorName;
	int quantity;
	
public Bookdetails() {
		
	}
	
	public Bookdetails(String isbn, double price, Date publishDate, String authorName,
	int quantity) {
	this.isbn = isbn;
	this.price = price;
	PublishDate = publishDate;
	this.authorName = authorName;
	this.quantity = quantity;
}


	@Override
	public int hashCode() {
		return Objects.hash(PublishDate, authorName, isbn, price, quantity);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bookdetails other = (Bookdetails) obj;
		if(Objects.equals(isbn, other.isbn)) {
			return true;
		}
		else 
			return false;		
	}
	public Bookdetails accept_details() {
		Bookdetails b1=new Bookdetails();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the book details: ");
		System.out.println("enter the book Uniqu id: ");
		b1.isbn=sc.next();
		System.out.println("Enter the Author Name: ");
		b1.authorName=sc.next();
		System.out.println("enter the Price: ");
		b1.price=sc.nextDouble();
		b1.PublishDate=new Date();
		System.out.println("enter the publish date; ");
		System.out.println("enter the publish day:");
		b1.PublishDate.setDate(sc.nextInt());
		System.out.println("enter the publish month: ");
		b1.PublishDate.setMonth(sc.nextInt());
		System.out.println("ennter the Publish year");
		b1.PublishDate.setYear(sc.nextInt());
		System.out.println("entert the category: ");
		b1.category.cate.setName(sc.next());
		System.out.println("enter the quntity: ");
		b1.quantity=sc.nextInt();
		return b1;
	}

	@Override
	public String toString() {
		return "Bookdetails [category=" + Category.cate.getName() + ", isbn=" + isbn + ", price=" + price + ", PublishDate="
				+ PublishDate + ", authorName=" + authorName + ", quantity=" + quantity + "]";
	}


	


	
}
	

