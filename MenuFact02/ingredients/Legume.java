package ingredients;

public class Legume extends Ingredient{
    /**
     *
     * @param nom
     * @param T
     * @param description
     */
    public Legume(String nom, TypeIngredient T, String description) {
        super(nom, T, description);
        setTypeIngredient(TypeIngredient.LEGUME);
    }
}
