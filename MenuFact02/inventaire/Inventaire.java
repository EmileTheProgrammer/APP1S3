package inventaire;

import ingredients.Ingredient;
import ingredients.IngredientInventaire;

import java.util.ArrayList;
import java.util.List;

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
    private ArrayList<IngredientInventaire> lesIngredientsInventaire = new ArrayList<IngredientInventaire>();

    public void ajouter (IngredientInventaire ingredient) {
        lesIngredientsInventaire.add(ingredient);
        lesIngredients.add(ingredient.getIngredient());
    }

    public List<IngredientInventaire> getIngredientInventaire(){
        return lesIngredientsInventaire;
    }

    public Ingredient getIngredient(String nom){
        for(Ingredient ingre : lesIngredients){
            if(ingre.getNom() == nom)
                return ingre;
        }
        return null;
    }

}
