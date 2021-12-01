public class BakedState implements PizzaState {

	private Pizza pizza;
	
	public BakedState(Pizza pizza) {
		
		this.pizza = pizza;
		
	}

	public void cook_pizza() throws Exception {
		
		throw new Exception("Can't cook a pizza already baked");
		
		
	}

	public void bake_pizza() throws Exception {
		
		
		throw new Exception("Can't bake a pizza already baked");
		
		
	}

	public void deliver_pizza() throws Exception {

		System.out.println("Delivering the pizza...");
		pizza.set_state(pizza.get_DeliveredState());
		
	}
	
	public void eat_pizza() throws Exception {
		
		System.out.println("Kitchen staff ate the pizza...");
		pizza.set_state(pizza.get_EatenState());
		
	}
	
}
