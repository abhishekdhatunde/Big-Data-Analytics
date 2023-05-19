import java.util.ArrayList;

public class Q02 {

	public static void main(String[] args) {
		ArrayList<String> colors=new ArrayList<String>();
		colors.add("Red");
		colors.add("Black");
		colors.add("Green");
		colors.add("Purple");
		
		System.out.println(colors);
		
		colors.sort(null);
		System.out.println(colors);
		
	}

}
