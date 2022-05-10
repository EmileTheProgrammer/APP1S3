package ingredients;

/**
 * Implementation du design patern factory
 */
public class IngredientFactory  {
    public Ingredient getIngredient(String nom, TypeIngredient T, String description){
        if(T==TypeIngredient.FRUIT){
            return new Fruit(nom, T, description);
        }
        else if(T==TypeIngredient.LEGUME){
            return new Legume(nom, T, description);
        }
        else if(T==TypeIngredient.VIANDE){
            return new Viande(nom, T, description);
        }
        else if(T==TypeIngredient.EPICE)
            return new Epice(nom, T, description);
        else if(T==TypeIngredient.LAITIER)
            return new Laitier(nom, T, description);

        else{return null;}
    }}
