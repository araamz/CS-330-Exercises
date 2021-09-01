public abstract class GameUnit {

	AttackingBehavior attackingBehavior;
	MovingBehavior movingBehavior;

	
	public GameUnit() {
		
	}
	
	public void unitMove() {
		System.out.print(this.getClass().getName() + " ");
		movingBehavior.moving();
	}
	
	public void unitAttack() {
		System.out.print(this.getClass().getName() + " ");
		attackingBehavior.attacking();
	}
	
	public void setAttack(AttackingBehavior ab) {
		attackingBehavior = ab;
	}
	
	public void setMove(MovingBehavior mb) {
		movingBehavior = mb; 
	}
	
	
}
