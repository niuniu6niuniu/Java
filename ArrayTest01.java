package arrayTest01;

public class ArrayTest01 {
	public static void main(String[] args) {
	// Initialize array static
	int[] arrTest1 = {1,2,3};	
	System.out.println(arrTest1);
	
	// Initialize array new
	int[] arrTest2;
	arrTest2 = new int[] {4,5,6};
	for(int val1 : arrTest2) {
		System.out.print(val1 + " ");
	}
	System.out.println();
	// Initialize array dynamic
	int[] arrTest3 = new int[3];
	for(int i = 0;i < arrTest3.length;i++) {
		arrTest3[i] = i + 5;
		}
	for (int val2 : arrTest3) {
		System.out.print(val2 + " ");
		}
	}
}
