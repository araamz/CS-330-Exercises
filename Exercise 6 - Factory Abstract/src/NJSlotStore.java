public class NJSlotStore extends SlotStore {
  SlotMachine createSlotMachine(String type) {
    if(type.equals("straight")) {
      return new StraightSlotMachine(new NJIngredientFactory());
    }
    else if(type.equals("bonus")) {
      return new BonusSlotMachine(new NJIngredientFactory());
    }
    else {
      return new ProgressiveSlotMachine(new NJIngredientFactory());
    }
  }
}