package leo.com.test;

public class ForTest01 {
	public static void main(String[] args) {

		for (int i = 1; i < 10; i++) {
			System.out.print("The " + i + " Row: ");
			for (int j = 1;j <= i;j++) {
				if (j == i) {
					System.out.println(j + "*" + i + "=" + i*j + "   ");
				} else {
				System.out.print(j + "*" + i + "=" + i*j + "   ");
				}
			}
		}
	}
}
