public class CookedState implements PizzaState  {
	
	private Pizza pizza;
	
	public CookedState(Pizza pizza) {
		
		this.pizza = pizza;
		
	}

	public void cook_pizza() throws Exception {
		
		throw new Exception("Pizza already is cooked");
		
		
	}

	public void bake_pizza() throws Exception {
		
		
		System.out.println("Baking the pizza...");
		pizza.set_state(pizza.get_BakedState());
		
		
	}

	public void deliver_pizza() throws Exception {

		throw new Exception("Can't deliver a pizza not baked yet");
		
	}
	
	public void eat_pizza() throws Exception {
		
		throw new Exception("Can't eat uncooked pizza");
		
	}
	
}
