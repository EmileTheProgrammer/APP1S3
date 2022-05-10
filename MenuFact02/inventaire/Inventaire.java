package inventaire;

import ingredients.Ingredient;
import ingredients.IngredientInventaire;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Emile Boutin , Samuel Trepanier
 * Implementation de la classe Inventaire permettant de gerer les ingredients
 */
public class Inventaire {

    private static Inventaire inventaire;
    private Inventaire(){

    }

    /**
     *
     * @return
     */
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
