public class NJIngredientFactory implements IngredientFactory {
  public NJIngredientFactory() {}
  
  public AbstractCabinet createCabinet(String SlotType) {
    if(SlotType == "straight") {
      return new SmallCabinet();
    }
    else if(SlotType == "bonus") {
      return new LargeCabinet();
    }

      return new SmallCabinet();
    
  }
  public AbstractDisplay createDisplay(String SlotType) {
    if(SlotType == "straight") {
      return new LCDDisplay();
    }
    else if(SlotType == "bonus") {
      return new ReelsDisplay();
    }

      return new CRTDisplay();
    
  }
  public AbstractPayment createPayment(String SlotType) {
    if(SlotType == "straight") {
      return new CoinsPayment();
    }
    else if(SlotType == "bonus") {
      return new CoinsPayment();
    }

      return new BillsPayment();
    
  }
  public AbstractGPU createGPU(String SlotType) {
    if(SlotType == "straight") {
      return new ARMGPU();
    }
    else if(SlotType == "bonus") {
      return new ARMGPU();
    }

      return new X86GPU();
    
  }
  public AbstractOS createOS(String SlotType) {
    if(SlotType == "straight") {
      return new WindowsMEOS();
    }
    else if(SlotType == "bonus") {
      return new WindowsMEOS();
    }

      return new WindowsMEOS();
    
  }
}