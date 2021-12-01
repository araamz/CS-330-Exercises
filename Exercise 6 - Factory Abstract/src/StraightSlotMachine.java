public class StraightSlotMachine implements SlotMachine {
  
  IngredientFactory ingredientFactory; 

  StraightSlotMachine(IngredientFactory ingredientFactory) {
    this.ingredientFactory = ingredientFactory;
  }

  public void uploadSoftware() {

    System.out.println("Installing Software " + ingredientFactory.createOS("straight").toString());

  } 

  public void assembleComponents() {

    System.out.println("Assembling Hardware for Straight Slot Machine: " + ingredientFactory.createDisplay("straight").toString() + ", " + ingredientFactory.createCabinet("straight").toString() + ", " + ingredientFactory.createPayment("straight").toString() + ", " + ingredientFactory.createGPU("straight").toString());

  } 
}

/*



public SlotMachine {

public SlotMachine {

  public void abstract testSoftware();
  public void abstract uploadSoftware();
  public void abstract testHardware();
  public void abstract assembleComponents();
  public void abstract detachComponents();

}

public interface IngredientFactory {
  Cabinet createCabinet(string);
  Display createDisplay(string);
  Payment createPayment(string);
  GPU createGPU(string);
  OS createOS(string);
}




*/