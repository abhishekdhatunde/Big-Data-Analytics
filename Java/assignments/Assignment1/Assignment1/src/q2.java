
public class q2 {

	public static void main(String[] args) {
		
		// NP TO P - BOXING
		float a = Float.valueOf(args[0]);
		System.out.println("BOXING : float to Float will be "+a);
		
		// P TO NP - UNBOXING
		Float b = new Float(a);
		System.out.println("UNBOXING : Float to float will be "+(b.valueOf(b)));
		
		// NP TO P - BOXING
		double d = Double.valueOf(args[1]);
		System.out.println("BOXING : double to Double will be "+d);
		
		// P TO NP - UNBOXING
		Double e = new Double(d);
		System.out.println("UNBOXING : Double to double will be "+(e.valueOf(e)));

	}

}
