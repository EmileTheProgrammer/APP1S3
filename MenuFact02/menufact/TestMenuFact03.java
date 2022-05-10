package menufact;

import ingredients.Ingredient;
import ingredients.IngredientInventaire;
import ingredients.exceptions.IngredientException;
import inventaire.Inventaire;
import menufact.facture.exceptions.FactureException;
import menufact.exceptions.MenuException;
import menufact.facture.Facture;
import menufact.plats.PlatAuMenu;
import menufact.plats.PlatChoisi;
import menufact.plats.PlatSante;
import menufact.setup.SetupIngredient;

import java.util.ArrayList;
import java.util.List;

public class TestMenuFact03 {
    public static void main(String[] args) {
        TestMenuFact02 t = new TestMenuFact02();
        SetupIngredient setupIngredient = new SetupIngredient();
        Inventaire inventaire = Inventaire.getInstance();
        for(IngredientInventaire ingredient : setupIngredient.getListIngredients()){
            inventaire.ajouter(ingredient);
        }

        List<Ingredient> plat1 = new ArrayList<Ingredient>();

        PlatAuMenu p1 = new PlatAuMenu(0,"PlatAuMenu0",10);
        plat1.add(inventaire.getIngredient("Poivre"));
        plat1.add(inventaire.getIngredient("Steak"));
        plat1.add(inventaire.getIngredient("Patate"));
        p1.setIngredientPlat(plat1);

        /*PlatAuMenu p2 = new PlatAuMenu(1,"PlatAuMenu1",20);
        PlatAuMenu p3 = new PlatAuMenu(2,"PlatAuMenu2",30);
        PlatAuMenu p4 = new PlatAuMenu(3,"PlatAuMenu3",40);
        PlatAuMenu p5 = new PlatAuMenu(4,"PlatAuMenu4",50);*/


        PlatSante ps1 = new PlatSante(10,"PlatSante0",10,11,11,11);
        /*PlatSante ps2 = new PlatSante(11,"PlatSante1",20,11,11,11);
        PlatSante ps3 = new PlatSante(12,"PlatSante2",30,11,11,11);
        PlatSante ps4 = new PlatSante(13,"PlatSante3",40,11,11,11);
        PlatSante ps5 = new PlatSante(14,"PlatSante4",50,11,11,11);*/

        Facture f = new Facture("fact");
        PlatChoisi pc = new PlatChoisi(p1,1);
        try {
            f.ajoutePlat(pc);
        }
        catch (FactureException e) {
            throw new RuntimeException(e);
        }
        catch (IngredientException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }

    }
}
