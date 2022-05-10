package tests;

import ingredients.Ingredient;
import ingredients.IngredientInventaire;
import ingredients.Viande;
import ingredients.exceptions.IngredientException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IngredientInventaireTest {
    private Ingredient ingredient;
    private Ingredient ingredientl;
private IngredientInventaire inv;



    @org.junit.jupiter.api.BeforeEach
    void setUp() {
          ingredient = new Viande(null,null,null) ;
        inv = new IngredientInventaire(ingredient , 3);
    }
    @Test
    void GetSetQuantite() throws IngredientException {
        int qty= -44;

        try {
            inv.setQuantite(qty);
            assertEquals(inv.getIngredient(), IngredientException.class, "Quantiter differente");
            fail();

        }catch (Exception e){


        }
    }
        @Test
    void getIngredient() {

        ingredientl = new Viande(null,null,null);
        assertEquals(inv.getIngredient().getNom(),ingredientl.getNom(),"Ingredients differents");
    }
}