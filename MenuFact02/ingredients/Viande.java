package ingredients;

public class Viande extends Ingredient{
    public Viande(String nom, TypeIngredient T, String description) {
        super(nom, T, description);
        setTypeIngredient(TypeIngredient.VIANDE);
    }
}
