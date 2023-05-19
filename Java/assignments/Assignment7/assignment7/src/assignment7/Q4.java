package assignment7;

enum color{
	RED(10), YELLOW(15), GREEN(20);
	
	private int value;

	color(int value) {
		this.value= value;
	}

	public int getValue() {
		return value;
	}

}

public class Q4 {

	public static void main(String[] args) {
		System.out.println(color.valueOf("RED")+ " = "+color.RED.getValue());
		System.out.println(color.valueOf("YELLOW")+ " = "+color.YELLOW.getValue());
		System.out.println(color.valueOf("GREEN")+ " = "+color.GREEN.getValue());
		

	}

}
