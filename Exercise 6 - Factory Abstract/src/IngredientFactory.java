public interface IngredientFactory {
  public AbstractCabinet createCabinet(String SlotType);
  public AbstractDisplay createDisplay(String SlotType);
  public AbstractPayment createPayment(String SlotType);
  public AbstractGPU createGPU(String SlotType);
  public AbstractOS createOS(String SlotType);
}