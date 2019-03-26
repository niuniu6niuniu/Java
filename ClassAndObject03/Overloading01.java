package classAndObject3;
// Method Overloading
public class Overloading01 {
	private String Chinese;
	private String Math;
	private String English;
	// Method overloading: Name of method is same, parameters is different
	// The type of parameters could be different
	// Only the name of the parameter is different, number and type of parameters are same, CAN'T OVERLOADING! 
	public void copyWorks(String Chinese) {
		this.Chinese = Chinese;
	}
	// Method overloading: Name of method is same, parameters is different
	public void copyWorks(String Chinese,String Math) {
		this.Chinese = Chinese;
		this.Math = Math;
	}
	// Method overloading: Name of method is same, parameters is different
	public void copyWorks(String Chinese,String Math,String English) {
		this.Chinese = Chinese;
		this.Math = Math;
		this.English = English;
	}
	
	public static void main(String[] args) {
		String Chinese = "语文作业";
		String Math = "Expectation Maximazation Algorithm";
		String English = "To be or not to be";
		
		Overloading01 overload = new Overloading01();
		
		overload.copyWorks(Chinese);
		System.out.println("First method:");
		System.out.println(overload.Chinese);
		
		overload.copyWorks(Chinese,Math);
		System.out.println("Second method:");
		System.out.println(overload.Chinese);
		System.out.println(overload.Math);
		
		overload.copyWorks(Chinese,Math,English);
		System.out.println("Third method:");
		System.out.println(overload.Chinese);
		System.out.println(overload.Math);
		System.out.println(overload.English);	
	}
}
