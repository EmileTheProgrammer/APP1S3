package tests;

import chef.*;
import ingredients.Ingredient;
import ingredients.IngredientInventaire;
import inventaire.Inventaire;
import menufact.Client;
import menufact.Menu;
import menufact.facture.Facture;
import menufact.facture.FactureController;
import menufact.facture.FactureView;
import menufact.plats.PlatAuMenu;
import menufact.plats.PlatChoisi;
import menufact.plats.PlatSante;
import menufact.setup.SetupIngredient;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ChefTest {
    private Chef chef1;
    private Chef chef2;
    private PlatChoisi plat;
    Inventaire inventaire;
    Menu m1;
    PlatAuMenu p4;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        chef1 = Chef.getInstance();
        chef2 = Chef.getInstance();
        inventaire = Inventaire.getInstance();
        p4 = new PlatAuMenu(3,"PlatAuMenu3",40);
        m1 = Menu.getInstance("menufact.Menu 1");
        m1.ajoute(p4);
        plat = new PlatChoisi(m1.platCourant(),1);

    }

    @org.junit.jupiter.api.Test
    void verificationIngredient() {
        SetupIngredient set = new SetupIngredient();
        for(IngredientInventaire ingredient : set.getListIngredients()){
            inventaire.ajouter(ingredient);
        }
        List<Ingredient> plat1 = new ArrayList<Ingredient>();
        plat1.add(inventaire.getIngredient("Poivre"));
        plat1.add(inventaire.getIngredient("Steak"));
        plat1.add(inventaire.getIngredient("Patate"));
        p4.setIngredientPlat(plat1);
        plat = new PlatChoisi(m1.platCourant(),1);
        assertEquals(chef1.verificationIngredient(plat), true, "verification1 non fonctionnelle");
        plat = new PlatChoisi(m1.platCourant(),20);
        assertEquals(chef1.verificationIngredient(plat), false, "verification1 non fonctionnelle");
    }

    @org.junit.jupiter.api.Test
    void getInstance() {
        assertEquals(chef1.hashCode(),chef2.hashCode(),"Chef different");
    }

    @org.junit.jupiter.api.Test
    void commande() {
        EtatCommande etat;
        etat=new Commande();
        plat.setEtat(new Commande());
        assertEquals(plat.getEtat().toString(), etat.toString(), "Pas la Bonne etat");
    }

    @org.junit.jupiter.api.Test
    void enPreparation() {
        EtatCommande etat;
        etat=new EnPreparation();
        plat.setEtat(new EnPreparation());
        assertEquals(plat.getEtat().toString(), etat.toString(), "Pas la Bonne etat");
    }

    @org.junit.jupiter.api.Test
    void servi() {
        EtatCommande etat;
        etat=new Servi();
        plat.setEtat(new Servi());
        assertEquals(plat.getEtat().toString(), etat.toString(), "Pas la Bonne etat");
    }

    @org.junit.jupiter.api.Test
    void termine() {
        EtatCommande etat;
        etat=new Termine();
        plat.setEtat(new Termine());
        assertEquals(plat.getEtat().toString(), etat.toString(), "Pas la Bonne etat");
    }



    @org.junit.jupiter.api.Test
    void GetSetNom() {
        String nom="Jean";
        chef1.setNom(nom);
        assertEquals(chef1.getNom(),nom,"Noms differents");

    }

}