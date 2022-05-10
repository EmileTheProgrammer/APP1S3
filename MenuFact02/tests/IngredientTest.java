package tests;

import ingredients.Ingredient;
import ingredients.TypeIngredient;
import ingredients.Viande;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IngredientTest {
private Ingredient ingredient;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        ingredient = new Viande(null,null,null) ;
          }
    @Test
    void GetSetNom() {
    String nom = "Legume";
    ingredient.setNom(nom);
    assertEquals(nom, ingredient.getNom(),"Nom different");
    }

    @Test
    void getSetDescription() {
        String desc = "Description";
        ingredient.setDescription(desc);
        assertEquals(desc, ingredient.getDescription(),"Description differente");
    }
        @Test
    void GetSetTypeIngredient() {
        TypeIngredient type = TypeIngredient.LEGUME;
        ingredient.setTypeIngredient(type);
        assertEquals(ingredient.getTypeIngredient(),type,"Type differents");

    }


}