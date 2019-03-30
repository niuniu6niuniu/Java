package extendTest01;

public class carDemo {
	
	public static void main(String[] args) {
		Porsche porsche = new Porsche();
		porsche.start();   // extends from father Car
		
		System.out.println("Porsche has " + porsche.door + " doors");
		// Can't access private type
		// porsche.engine = "Stop";
	}
}
