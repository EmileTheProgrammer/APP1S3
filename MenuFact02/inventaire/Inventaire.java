package inventaire;

import ingredients.Ingredient;

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
    private ArrayList<Ingredient> lesIngredients = new ArrayList<Ingredient>();

    public void ajouter (Ingredient ingredient)
    {
        lesIngredients.add(ingredient);
    }

}
