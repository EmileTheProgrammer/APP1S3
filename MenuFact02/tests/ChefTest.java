package tests;

import chef.Chef;
import chef.Commande;
import chef.EtatCommande;
import menufact.Client;
import menufact.Menu;
import menufact.facture.Facture;
import menufact.facture.FactureController;
import menufact.facture.FactureView;
import menufact.plats.PlatAuMenu;
import menufact.plats.PlatChoisi;
import menufact.plats.PlatSante;

import static org.junit.jupiter.api.Assertions.*;

class ChefTest {
    private Chef chef1;
    private Chef chef2;
    private PlatChoisi plat;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        chef1 = Chef.getInstance();
        chef2 = Chef.getInstance();
        PlatAuMenu p4 = new PlatAuMenu(3,"PlatAuMenu3",40);
        Menu m1 = Menu.getInstance("menufact.Menu 1");
        m1.ajoute(p4);
    plat = new PlatChoisi(m1.platCourant(),2);


    }
    @org.junit.jupiter.api.Test
    void getInstance() {
        assertEquals(chef1.hashCode(),chef2.hashCode(),"Chef different");
    }

    @org.junit.jupiter.api.Test
    void testNotify() {


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
    }

    @org.junit.jupiter.api.Test
    void servi() {
    }

    @org.junit.jupiter.api.Test
    void termine() {

    }

    @org.junit.jupiter.api.Test
    void verificationIngredient() {

    }

    @org.junit.jupiter.api.Test
    void platConsomme() {

    }

    @org.junit.jupiter.api.Test
    void GetSetNom() {
        String nom="Jean";
        chef1.setNom(nom);
        assertEquals(chef1.getNom(),nom,"Noms differents");

    }

    @org.junit.jupiter.api.Test
    void update() {


    }
}