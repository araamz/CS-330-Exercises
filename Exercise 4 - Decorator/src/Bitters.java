public class Bitters extends CocktailDecorator {
  
  public Bitters(Cocktail cocktail){
    this.cocktail=cocktail;
  }

  public String getDescription(){
    return cocktail.getDescription() + ", 1 Bitters";
  }

  public int calorie_value(){
    return 20 + cocktail.calorie_value();
  }
}