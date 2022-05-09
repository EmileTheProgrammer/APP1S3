package menufact.setup;

import ingredients.Ingredient;
import ingredients.IngredientInventaire;
import ingredients.TypeIngredient;

import java.util.ArrayList;
import java.util.List;

public class SetupIngredient {
    private List<IngredientInventaire> ingredients = new ArrayList<IngredientInventaire>();
    public SetupIngredient(){
        ingredients.add(new IngredientInventaire(new Ingredient("Poivre", TypeIngredient.EPICE, "EPICE"),10));
        ingredients.add(new IngredientInventaire(new Ingredient("Sel", TypeIngredient.EPICE, "EPICE"),10));
        ingredients.add(new IngredientInventaire(new Ingredient("Fraise", TypeIngredient.FRUIT, "FRUIT"),10));
        ingredients.add(new IngredientInventaire(new Ingredient("Pomme", TypeIngredient.FRUIT, "FRUIT"),10));
        ingredients.add(new IngredientInventaire(new Ingredient("Framboise", TypeIngredient.FRUIT, "FRUIT"),10));
        ingredients.add(new IngredientInventaire(new Ingredient("Carotte", TypeIngredient.LEGUME, "LEGUME"),10));
        ingredients.add(new IngredientInventaire(new Ingredient("Patate", TypeIngredient.LEGUME, "LEGUME"),10));
        ingredients.add(new IngredientInventaire(new Ingredient("Brocolie", TypeIngredient.LEGUME, "LEGUME"),10));
        ingredients.add(new IngredientInventaire(new Ingredient("Steak", TypeIngredient.VIANDE, "VIANDE"),5));
        ingredients.add(new IngredientInventaire(new Ingredient("Porc", TypeIngredient.VIANDE, "VIANDE"),8));
        ingredients.add(new IngredientInventaire(new Ingredient("Poisson", TypeIngredient.VIANDE, "VIANDE"),3));
        ingredients.add(new IngredientInventaire(new Ingredient("Lait", TypeIngredient.LAITIER, "LAITIER"),20));
        ingredients.add(new IngredientInventaire(new Ingredient("Fromage", TypeIngredient.LAITIER, "LAITIER"),10));
    }

    public List<IngredientInventaire> getListIngredients(){
        return ingredients;
    }
}
