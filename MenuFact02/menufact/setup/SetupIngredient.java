package menufact.setup;

import ingredients.Ingredient;
import ingredients.IngredientInventaire;
import ingredients.TypeIngredient;
import ingredients.IngredientFactory;

import java.util.ArrayList;
import java.util.List;

public class SetupIngredient {
    private List<IngredientInventaire> ingredients = new ArrayList<IngredientInventaire>();
    public SetupIngredient(){
        IngredientFactory factory = new IngredientFactory();
        ingredients.add(new IngredientInventaire(factory.getIngredient("Poivre", TypeIngredient.EPICE, "EPICE"),10));
        ingredients.add(new IngredientInventaire(factory.getIngredient("Sel", TypeIngredient.EPICE, "EPICE"),10));
        ingredients.add(new IngredientInventaire(factory.getIngredient("Fraise", TypeIngredient.FRUIT, "FRUIT"),10));
        ingredients.add(new IngredientInventaire(factory.getIngredient("Pomme", TypeIngredient.FRUIT, "FRUIT"),10));
        ingredients.add(new IngredientInventaire(factory.getIngredient("Framboise", TypeIngredient.FRUIT, "FRUIT"),10));
        ingredients.add(new IngredientInventaire(factory.getIngredient("Carotte", TypeIngredient.LEGUME, "LEGUME"),10));
        ingredients.add(new IngredientInventaire(factory.getIngredient("Patate", TypeIngredient.LEGUME, "LEGUME"),10));
        ingredients.add(new IngredientInventaire(factory.getIngredient("Brocolie", TypeIngredient.LEGUME, "LEGUME"),10));
        ingredients.add(new IngredientInventaire(factory.getIngredient("Steak", TypeIngredient.VIANDE, "VIANDE"),5));
        ingredients.add(new IngredientInventaire(factory.getIngredient("Porc", TypeIngredient.VIANDE, "VIANDE"),8));
        ingredients.add(new IngredientInventaire(factory.getIngredient("Poisson", TypeIngredient.VIANDE, "VIANDE"),3));
        ingredients.add(new IngredientInventaire(factory.getIngredient("Lait", TypeIngredient.LAITIER, "LAITIER"),20));
        ingredients.add(new IngredientInventaire(factory.getIngredient("Fromage", TypeIngredient.LAITIER, "LAITIER"),10));
    }

    public List<IngredientInventaire> getListIngredients(){
        return ingredients;
    }
}
