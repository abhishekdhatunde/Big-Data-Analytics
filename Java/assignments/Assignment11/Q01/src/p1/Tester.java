package p1;
import java.util.HashSet;
import java.util.Iterator;





public class Tester {
	
	public static void main(String[] args) {
		Bookdetails b1=new Bookdetails();
		HashSet<Bookdetails> Library=new HashSet<Bookdetails>();
		for(int i=0;i<5;i++) {
		Library.add(b1.accept_details());
		}
		
		
		Iterator<Bookdetails> b=(Iterator<Bookdetails>) Library.iterator();
		while(b.hasNext()) {
			System.out.println(b.next());
		}
		

	}
	
	
	
	
}


