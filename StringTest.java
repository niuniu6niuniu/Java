package test.String01;

public class StringTest {
	
	public static void main(String[] args) {
		// Initialize string like normal type
		String stringTest1 = "hello";
		String stringTest2 = "hello";
		// charAt(i) print out the character with the corresponding index 
		System.out.println(stringTest1.charAt(0));
		System.out.println(stringTest1.charAt(1));
		System.out.println(stringTest1.charAt(2));
		System.out.println(stringTest1.charAt(3));
		System.out.println(stringTest1.charAt(4));
		
		// Initialize string like reference type
		String stringTest01 = new String("hello");
		String stringTest02 = new String("hello");
		// Normal type with same name has same address
		System.out.println("Address of normal type string1 and string2: ");
		System.out.println(stringTest1 == stringTest2);
		// Compare the address of the object,normal type different with reference type(new)
		System.out.println("Address of normal type string1 and reference type string01 "); 
		System.out.println(stringTest1 == stringTest01);
		// Compare the string
		System.out.println("Contents of normal type string1 and reference type string01:");
		System.out.println(stringTest1.equals(stringTest01));
		// Reference type created with new has different address
		System.out.println("Address of reference string01 and string02: ");
		System.out.println(stringTest01 == stringTest02);
	}
}
