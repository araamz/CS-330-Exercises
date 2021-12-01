public class EatenState implements PizzaState {
	
	private Pizza pizza;
	
	public EatenState(Pizza pizza) {
		
		this.pizza = pizza;
		
	}

	public void cook_pizza() throws Exception {
		
		throw new Exception("Pizza already cooked");
		
	}

	public void bake_pizza() throws Exception {
		
		throw new Exception("Pizza already baked");
		
	}

	public void deliver_pizza() throws Exception {

		throw new Exception("Pizza already eaten by kitchen staff and can't be delivered");
		
	}
	
	public void eat_pizza() throws Exception {
		
		throw new Exception("Pizza already eaten by staff");
		
	}
	
}
