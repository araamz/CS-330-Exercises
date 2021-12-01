public class DeliveredState implements PizzaState {
	
	private Pizza pizza;
	
	public DeliveredState(Pizza pizza) {
		
		this.pizza = pizza;
		
	}

	public void cook_pizza() throws Exception {
		
		throw new Exception("Can't deliver a pizza not baked yet");
		
	}

	public void bake_pizza() throws Exception {
		
		
		throw new Exception("Can't bake a pizza already delivered");
		
		
	}

	public void deliver_pizza() throws Exception {

		throw new Exception("Pizza is already delivered"); 
		
	}
	
	public void eat_pizza() throws Exception {
		
		throw new Exception("Pizza is already delivered and can't be eaten"); 
		
	}

}
