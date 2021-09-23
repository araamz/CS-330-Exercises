public class SlotMachineFactory {

  public SlotMachine makeNewSlotMachine(String slotmachinetype)
  {
      SlotMachine slot = null;
      if(slotmachinetype.equals("Nevada straight"))
      {

            return new NevadaSlotMachine_Straight();
      }
      else if (slotmachinetype.equals("Nevada Bonus"))
      {

  
          return new NevadaSlotMachine_Bonus();
    

      }
      else if(slotmachinetype.equals("Nevada progressive"))
      {


          return new NevadaSlotMachine_Progressive();
      }
      if(slotmachinetype.equals("Washington straight"))
      {

            return new WashingtonSlotMachine_Straight();
      }
      else if (slotmachinetype.equals("Washington Bonus"))
      {


          return new WashingtonSlotMachine_Bonus();
    

      }
      else if(slotmachinetype.equals("Washington progressive"))
      {
  
          return new WashingtonSlotMachine_Progressive();
      }
      if(slotmachinetype.equals("New Jersey straight"))
      {
       
            return new NewJerseySlotMachine_Straight();
      }
      else if (slotmachinetype.equals("New Jersey Bonus"))
      {

          return new NewJerseySlotMachine_Bonus();
    

      }
      else if(slotmachinetype.equals("New Jersey progressive"))
      {

          return new NewJerseySlotMachine_Progressive();
      }
      else
      {
      
      return null;
      }
  }



}