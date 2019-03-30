package extendTest01;

public class VIPLevelThree extends VIPLevelTwo {
	// Vip3 = Player + Vip1 + Vip2 + Vip3
	public String serverPhone;
	public String mistake;
	
	public void callServer() {
		System.out.println("Request customer service");
	}
	
	public void dealMistake() {
		System.out.println("Reset mistake operations");
	}
}
