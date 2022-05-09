package menufact.plats;

import ingredients.Ingredient;

import java.util.ArrayList;
import java.util.List;

public class IngredientPlat {

    private List<Ingredient> ingredients = new ArrayList<Ingredient>();
    public IngredientPlat(){

    }

    public void setIngredient(Ingredient ingredient){
        ingredients.add(ingredient);
    }

    public List<Ingredient> getIngredient(){
        return ingredients;
    }
}
