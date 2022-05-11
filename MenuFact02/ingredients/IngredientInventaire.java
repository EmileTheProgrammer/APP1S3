package ingredients;

import ingredients.exceptions.IngredientException;

public class IngredientInventaire {
    private Ingredient ingredient;
    private double quantite;

    public IngredientInventaire(Ingredient ingredient, int quantite) {
        this.ingredient = ingredient;
        this.quantite = quantite;
    }

    public double getQuantite() {
        return quantite;
    }

    /**
     *
     * @param quantite
     * @throws IngredientException
     */
    public void setQuantite(double quantite) throws IngredientException{

        if (quantite < 0)
            throw new IngredientException("Il n'est pas possible d'avoir une quantité negative");
        else
            this.quantite = quantite;
    }

    public Ingredient getIngredient(){
        return ingredient;
    }
}
