public class Pizza {

	private PizzaState cooked_state;
	private PizzaState baked_state;
	private PizzaState delivered_state;
	private PizzaState eaten_state;
	private PizzaState current_state;
	
	public Pizza() {
		
		cooked_state = new CookedState(this);
		baked_state = new BakedState(this);
		delivered_state = new DeliveredState(this);
		eaten_state = new EatenState(this);
		current_state = cooked_state;
		
	}
	
	public PizzaState get_CookedState() {
		
		return cooked_state;
		
	}
	
	public PizzaState get_BakedState() {
		
		return baked_state;
		
	}
	
	public PizzaState get_DeliveredState() {
		
		return delivered_state;
		
	}
	
	public PizzaState get_EatenState() {
		
		return eaten_state;
		
	}
	
	public PizzaState get_CurrentState() {
		
		return current_state;
		
	}
	
	public void set_state(PizzaState pizza_state) {
		
		current_state = pizza_state;
		
	}
	
	public void cook_pizza() throws Exception {
		
		current_state.cook_pizza();
		
	}
	
	public void bake_pizza() throws Exception {
		
		current_state.bake_pizza();
		
	}
	
	public void deliver_pizza() throws Exception {
		
		current_state.deliver_pizza();
		
	}
	
	public void eat_pizza() throws Exception {
		
		current_state.eat_pizza();
		
	}
	
	
}
