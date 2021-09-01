
public class TestRTS {

	public static void main(String[] args) {
		
		GameUnit grunt = new Grunt();
		GameUnit tank = new Tank();
		grunt.unitMove();
		grunt.unitAttack();
		tank.unitMove();
		tank.unitAttack();
		tank.setAttack(new attackingBehavior_canon());
		tank.unitAttack();
		grunt.setAttack(new attackingBehavior_pistol());
		grunt.unitAttack();

		
	}
	
}
