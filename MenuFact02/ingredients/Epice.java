package ingredients;

public class Epice extends Ingredient{

    public Epice(String nom, TypeIngredient T, String description) {
        super(nom, T, description);
        setTypeIngredient(TypeIngredient.EPICE);
    }

}
