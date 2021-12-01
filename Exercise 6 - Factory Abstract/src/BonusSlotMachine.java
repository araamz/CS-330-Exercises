public class BonusSlotMachine implements SlotMachine {

  IngredientFactory ingredientFactory; 

  BonusSlotMachine(IngredientFactory ingredientFactory) {
    this.ingredientFactory = ingredientFactory;
  }

  public void uploadSoftware() {

    System.out.println("Installing Software " + ingredientFactory.createOS("bonus").toString());

  } 

  public void assembleComponents() {

    System.out.println("Assembling Hardware for Bonus Slot Machine: " + ingredientFactory.createDisplay("bonus").toString() + ", " + ingredientFactory.createCabinet("bonus").toString() + ", " + ingredientFactory.createPayment("bonus").toString() + ", " + ingredientFactory.createGPU("bonus").toString());

  } 

  public void detachComponents() {

    System.out.println("Detaching Hardware for Straight Slot Machine");

  }
}

  
