package extendTest01;

public class VIPLevelTwo extends VIPLevelOne {
	// Vip2 privilege = Player + Vip1 + Vip2
	public String vipWeapon;
	public String informName;
		
	public void getVipWeapon() {
		System.out.println("Get VIP Weapon!");
	}
		
	public void freezeInform() {
		System.out.println("Block the informer account");
	}
}
