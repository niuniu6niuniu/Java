package classAndObject3;
// The Transfer of Parameters in Method
public class Beauty {
	// My answer is empty 
	private String myAnswer = " ";
	// Copy others LOL, Method, Formal Parameters here: copyAnswer, No
	public void copyWork(String copyAnswer,int No) {
		myAnswer = copyAnswer;
		// Local variable only works in my answer
		No += 10;
		System.out.println("Papers of mine: " + No);
	}
	
	public static void main(String[] args) {
		Beauty beauty = new Beauty();
		// My answer is empty, nothing printed 
		System.out.println(beauty.myAnswer);
		// The beauty's answer
		String answer = "Beauty says the last one is C";
		int No = 5;
		// Actual Parameters here, transfer to the Formal Parameters: answer, No
		// Formal parameters can be different with actual parameters, the order must same
		beauty.copyWork(answer, No);
		
		System.out.println(beauty.myAnswer);
		System.out.println("Papers of beauty: " + No);	
	}
}
