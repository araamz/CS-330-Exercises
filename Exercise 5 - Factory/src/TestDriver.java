public class TestDriver {

  public TestDriver() {

      SlotMachineFactory factory = new SlotMachineFactory();
    
      System.out.println("The Taj Mahal orders a:");
      printing(factory.makeNewSlotMachine("New Jersey Bonus"));
      System.out.println("The Peppermill orders a:");
      printing(factory.makeNewSlotMachine("Nevada progressive"));
    
  }

  public void printing(SlotMachine machine) {

    System.out.println("-- Making a " + machine.getname() + " Slot Machine--");

    System.out.println("fetching components: " + machine.getcabinet() + " " + machine.getpayment() + " " + machine.getdisplay() + " " + machine.getGPU());
    System.out.println("uploading software: " + machine.getOS());
    //newSlot = SlotMachineFactory.makeNewSlotMachine("Nevada straight");



  }

}