package ingredients;

public class Viande extends Ingredient{
    /**
     *
     * @param nom
     * @param T
     * @param description
     */
    public Viande(String nom, TypeIngredient T, String description) {
        super(nom, T, description);
        setTypeIngredient(TypeIngredient.VIANDE);
    }
}
