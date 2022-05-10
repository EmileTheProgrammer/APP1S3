package ingredients;

public class Epice extends Ingredient{
    /**
     *
     * @param nom
     * @param T
     * @param description
     */
    public Epice(String nom, TypeIngredient T, String description) {
        super(nom, T, description);
        setTypeIngredient(TypeIngredient.EPICE);
    }

}
