public class Sugar extends CocktailDecorator {
  
  public Sugar(Cocktail cocktail){
    this.cocktail=cocktail;
  }

  public String getDescription(){
    return cocktail.getDescription() + ", 1 Sugar";
  }

  public int calorie_value(){
    return 300 + cocktail.calorie_value();
  }
}