package ingredients;

public class Fruit extends Ingredient{
  public Fruit(String nom, TypeIngredient T, String description) {
       super(nom, T, description);
        setTypeIngredient(TypeIngredient.FRUIT);
    }
}
