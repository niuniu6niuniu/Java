package classAndObject.com;

public class Package {
	// normal member variable
	public String name;   // receiver of the package
	public float size;      // size of the package
	public int number;    // number of packages
	
	// normal method
	public void getPackage() {
		System.out.println(this.name + " please take the " + this.number + 
				" packages with size " + this.size);
		System.out.println();
	}
	
	public static void main(String[] args) {
		Package package1 = new Package();
		package1.name = "Messi";
		package1.size = 1.69f;
		package1.number = 19;
		
		Package package2 = new Package();
		package2.name = "Coutinho";
		package2.size = 1.7f;
		package2.number = 7;
		
		// Tape with tape tool using static method, all packages are same, call by Class
		Tape.tapePackage(package1);
		Tape.tapePackage(package2);
		// Receive package by created method, with different instances, call by object
		package1.getPackage();
		package2.getPackage();
	}
}

