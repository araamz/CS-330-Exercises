public class ProgressiveSlotMachine implements SlotMachine {
  IngredientFactory ingredientFactory;

  public ProgressiveSlotMachine(IngredientFactory ingredientFactory) {
    this.ingredientFactory = ingredientFactory;
  }

  public void uploadSoftware() {

    System.out.println("Installing Software " + ingredientFactory.createOS("progressive").toString());

  } 

  public void assembleComponents() {

    System.out.println("Assembling Hardware for Progressive Slot Machine: " + ingredientFactory.createDisplay("progressive").toString() + ", " + ingredientFactory.createCabinet("progressive").toString() + ", " + ingredientFactory.createPayment("progressive").toString() + ", " + ingredientFactory.createGPU("progressive").toString());

  } 
}

  
