public class NVSlotStore extends SlotStore {
  SlotMachine createSlotMachine(String type) {
    if(type.equals("straight")) {
      return new StraightSlotMachine(new NVIngredientFactory());
    }
    else if(type.equals("bonus")) {
      return new BonusSlotMachine(new NVIngredientFactory());
    }
    else {
      return new ProgressiveSlotMachine(new NVIngredientFactory());
    }
  }
}