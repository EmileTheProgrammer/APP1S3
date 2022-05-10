package menufact;

import ingredients.Ingredient;
import ingredients.IngredientInventaire;
import ingredients.exceptions.IngredientException;
import inventaire.Inventaire;
import menufact.facture.FactureController;
import menufact.facture.FactureView;
import menufact.facture.exceptions.FactureException;
import menufact.exceptions.MenuException;
import menufact.facture.Facture;
import menufact.plats.PlatAuMenu;
import menufact.plats.PlatChoisi;
import menufact.plats.PlatEnfant;
import menufact.plats.PlatSante;
import menufact.setup.SetupIngredient;

import java.util.ArrayList;
import java.util.List;

public class TestMenuFact03 {
    public static void main(String[] args) {
        menuFactFacade facade = new menuFactFacade();
        facade.menuClient();
    }
}
