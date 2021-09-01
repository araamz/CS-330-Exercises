
public class Tank extends GameUnit {
	public Tank() {
		System.out.println("new Tank");
		movingBehavior = new movingBehavior_driving();
		attackingBehavior = new attackingBehavior_rocket();
	}
	
}
