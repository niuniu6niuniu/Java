package classAndObject.com;

public class Tape {
	public static int tapeNumber = 2;   // static, always 2 tapes for any package
	
	public static void tapePackage(Package packages) {
		System.out.println("Current working with " + packages.name+ 
				"'s package with " + tapeNumber + " tapes!");
		System.out.println();
	}
}
