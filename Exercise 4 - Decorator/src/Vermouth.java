public class Vermouth extends CocktailDecorator {
  
  public Vermouth(Cocktail cocktail){
    this.cocktail=cocktail;
  }

  public String getDescription(){
    return cocktail.getDescription() + ", 1 Vermouth";
  }

  public int calorie_value(){
    return 40 + cocktail.calorie_value();
  }
}