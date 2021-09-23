public class Cherry extends CocktailDecorator {
  
  public Cherry(Cocktail cocktail){
    this.cocktail=cocktail;
  }

  public String getDescription(){
    return cocktail.getDescription() + ", 1 Cherry";
  }

  public int calorie_value(){
    return 40 + cocktail.calorie_value();
  }
}