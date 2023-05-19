import java.util.ArrayList;

public class Q03 {

	public static void main(String[] args) {
		ArrayList<String> colors=new ArrayList<String>();
		colors.add("Red");
		colors.add("Black");
		colors.add("Green");
		colors.add("Purple");
		
		System.out.println("List before updating:"+"\n"+colors);
		System.out.println("----------------------------------");
		colors.set(1, "Brown");
		System.out.println("List after updating:"+"\n"+colors);

	}

}
