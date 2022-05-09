package ingredients;

public class Legume extends Ingredient{
    public Legume(String nom, TypeIngredient T, String description) {
        super(nom, T, description);
        setTypeIngredient(TypeIngredient.LEGUME);
    }
}
