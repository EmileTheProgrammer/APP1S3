package ingredients;

public class Fruit extends Ingredient{
    /**
     *
     * @param nom
     * @param T
     * @param description
     */
  public Fruit(String nom, TypeIngredient T, String description) {
       super(nom, T, description);
        setTypeIngredient(TypeIngredient.FRUIT);
    }
}
