package classAndObject3;
// Constructor Overloading
public class Overloading02 {
	private String Chinese;
	private String Math;
	private String English;
	
	public Overloading02() {}
	
	// Constructor overloading
	public Overloading02(String Chinese,String Math) {
		this.Chinese = Chinese;
		this.Math = Math;
	}
	// Constructor overloading
	public Overloading02(String Chinese,String Math,String English) {
		// Constructor call using "this"
		this(Chinese,Math);
		this.English = English;
	}
	
	public void copyWorks(String Chinese,String Math) {
		this.Chinese = Chinese;
		this.Math = Math;
	}
	
	public void copyWorks(String Chinese,String Math,String English) {
		// Method call using method name"
		copyWorks(Chinese,Math);
		this.English = English;
	}
	
	public static void main(String[] args) {
		String Chinese = "语文作业";
		String Math = "Expectation Maximazation Algorithm";
		String English = "To be or not to be";
		
		Overloading02 overload1 = new Overloading02("","");
		Overloading02 overload2 = new Overloading02("","","");
		
		overload1.copyWorks(Chinese,Math);   // Without "English"
		overload2.copyWorks(Chinese,Math,English);
		System.out.println("Second method:");
		System.out.println(overload1.Chinese);
		System.out.println(overload1.Math);
		System.out.println(overload1.English);  // Print "null"

		System.out.println("Third method:");
		System.out.println(overload2.Chinese);
		System.out.println(overload2.Math);
		System.out.println(overload2.English);	
	}
}
