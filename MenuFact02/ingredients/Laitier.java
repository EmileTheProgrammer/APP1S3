package ingredients;

public class Laitier extends Ingredient{

    public Laitier(String nom, TypeIngredient T, String description) {
        super(nom, T, description);
        setTypeIngredient(TypeIngredient.LAITIER);
    }
}
