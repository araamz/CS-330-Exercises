public class LimeJuice extends CocktailDecorator {
  
  public LimeJuice(Cocktail cocktail){
    this.cocktail=cocktail;
  }

  public String getDescription(){
    return cocktail.getDescription() + ", 1 LimeJuice";
  }

  public int calorie_value(){
    return 8 + cocktail.calorie_value();
  }
}