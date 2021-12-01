public class NVIngredientFactory implements IngredientFactory {
  public NVIngredientFactory() {}
  
  public AbstractCabinet createCabinet(String SlotType) {
    if(SlotType == "straight") {
      return new LargeCabinet();
    }
    else if(SlotType == "bonus") {
      return new SmallCabinet();
    }

      return new MediumCabinet();
    
  }
  public AbstractDisplay createDisplay(String SlotType) {
    if(SlotType == "straight") {
      return new ReelsDisplay();
    }
    else if(SlotType == "bonus") {
      return new CRTDisplay();
    }

      return new LCDDisplay();
    
  }
  public AbstractPayment createPayment(String SlotType) {
    if(SlotType == "straight") {
      return new TicketInTicketOutPayment();
    }
    else if(SlotType == "bonus") {
      return new TicketInTicketOutPayment();
    }

      return new TicketInTicketOutPayment();
    
  }
  public AbstractGPU createGPU(String SlotType) {
    if(SlotType == "straight") {
      return new ARMGPU();
    }
    else if(SlotType == "bonus") {
      return new X86GPU();
    }

      return new X77GPU();
    
  }
  public AbstractOS createOS(String SlotType) {
    if(SlotType == "straight") {
      return new LinuxOS();
    }
    else if(SlotType == "bonus") {
      return new LinuxOS();
    }

      return new AndroidOS();
    
  }
}