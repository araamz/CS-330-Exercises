public class TestDriver {

	public static void main(String[] args) throws Exception {
		
		// Testing Application in Cooked State -> Baked State -> Deliver State
		Pizza pizza_one = new Pizza();
		pizza_one.bake_pizza();
		pizza_one.deliver_pizza();
		
		// Testing Application in Cooked State -> Baked State -> Eaten State -> (Function State Test w/ Exception)
		Pizza pizza_two = new Pizza();
		pizza_two.bake_pizza();
		pizza_two.eat_pizza();
		pizza_two.deliver_pizza();

	}

}
