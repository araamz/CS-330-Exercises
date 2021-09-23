public class Lime extends CocktailDecorator {
  
  public Lime(Cocktail cocktail){
    this.cocktail=cocktail;
  }

  public String getDescription(){
    return cocktail.getDescription() + ", 1 Lime";
  }

  public int calorie_value(){
    return 2 + cocktail.calorie_value();
  }
}