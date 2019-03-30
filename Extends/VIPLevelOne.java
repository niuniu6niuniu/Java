package extendTest01;

public class VIPLevelOne extends Player {
	// Vip1 privilege = Player + Vip1
	public String icon;
	public String discount;
	
	public void showIcon() {
		System.out.println("Show VIP icon");
	}
	
	public void buyWithDiscount() {
		System.out.println("Buy with discounts!");
	}
}
