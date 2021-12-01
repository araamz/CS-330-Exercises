public abstract class SlotStore {
  public SlotMachine orderSlotMachine(String type) {
    SlotMachine slotMachine;
    slotMachine = createSlotMachine(type);

    slotMachine.assembleComponents();
    slotMachine.uploadSoftware();
    return slotMachine;
  }
  abstract SlotMachine createSlotMachine(String type);
}