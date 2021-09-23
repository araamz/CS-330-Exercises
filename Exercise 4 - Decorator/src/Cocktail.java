public abstract class Cocktail {
  String description = "unknown Cocktail";

  public String getDescription(){
    return description;
  }

  public abstract int calorie_value();
}
