public class WASlotStore extends SlotStore {
  SlotMachine createSlotMachine(String type) {
    if(type.equals("straight")) {
      return new StraightSlotMachine(new WAIngredientFactory());
    }
    else if(type.equals("bonus")) {
      return new BonusSlotMachine(new WAIngredientFactory());
    }
    else {
      return new ProgressiveSlotMachine(new WAIngredientFactory());
    }
  }
}