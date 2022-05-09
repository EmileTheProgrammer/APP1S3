package inventaire;

import ingredients.Ingredient;
import ingredients.IngredientInventaire;

import java.util.ArrayList;

public class Inventaire {

    private static Inventaire inventaire;
    private Inventaire(){

    }

    public static Inventaire getInstance(){
        if(inventaire == null)
            return inventaire = new Inventaire();
        return inventaire;
    }
    private ArrayList<IngredientInventaire> lesIngredients = new ArrayList<IngredientInventaire>();

    public void ajouter (IngredientInventaire ingredient) {
        lesIngredients.add(ingredient);
    }

    public void platConsomme(){

    }


}
