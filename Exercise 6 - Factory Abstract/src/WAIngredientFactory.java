public class WAIngredientFactory implements IngredientFactory {
  public WAIngredientFactory() {}
  
  public AbstractCabinet createCabinet(String SlotType) {
    if(SlotType == "straight") {
      return new LargeCabinet();
    }
    else if(SlotType == "bonus") {
      return new MediumCabinet();
    }
    else {
      return new LargeCabinet();
    }
  }
  public AbstractDisplay createDisplay(String SlotType) {
    if(SlotType == "straight") {
      return new ReelsDisplay();
    }
    else if(SlotType == "bonus") {
      return new VGADisplay();
    }
    else {
      return new ReelsDisplay();
    }
  }
  public AbstractPayment createPayment(String SlotType) {
    if(SlotType == "straight") {
      return new BillsPayment();
    }
    else if(SlotType == "bonus") {
      return new TicketInTicketOutPayment();
    }
    else {
      return new CoinsPayment();
    }
  }
  public AbstractGPU createGPU(String SlotType) {
    if(SlotType == "straight") {
      return new ARMGPU();
    }
    else if(SlotType == "bonus") {
      return new ARMGPU();
    }
    else {
      return new ARMGPU();
    }
  }
  public AbstractOS createOS(String SlotType) {
    if(SlotType == "straight") {
      return new LinuxOS();
    }
    else if(SlotType == "bonus") {
      return new SymbianOS();
    }
    else {
      return new AndroidOS();
    }
  }
}