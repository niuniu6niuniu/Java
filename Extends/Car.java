package extendTest01;

public class Car {
	// Can only be accessed by itself
	private String engine;   
	// default can only be accessed under same package
	int seats;   
	// protected type, can only be accessed by its child type
	protected int doors;   
	// public with not limitations
	public String color;

	public void start() {
		this.engine = "Start the Engine";
		System.out.println(this.engine);
	}
}
