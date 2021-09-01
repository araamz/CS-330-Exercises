
public class Grunt extends GameUnit {
	
	
	
	
	public Grunt() {

		System.out.println("new Grunt");
		movingBehavior = new movingBehavior_walking();
		attackingBehavior = new attackingBehavior_axe();

	}
	
}
