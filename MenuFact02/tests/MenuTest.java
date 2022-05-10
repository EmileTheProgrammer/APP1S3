package tests;

import menufact.Menu;
import menufact.plats.PlatAuMenu;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MenuTest {
 private Menu m1;
 private Menu m2;
 private String nomExpected = "Menu 1";
    private int courant=2;
    private ArrayList<PlatAuMenu> plat = new ArrayList<PlatAuMenu>();
    private PlatAuMenu platMenu;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        m1 = Menu.getInstance(nomExpected);
        m2 = Menu.getInstance("Menu 2");

        platMenu = new PlatAuMenu(1,null,2.0);
    }
    @Test
    void getInstance() {
     assertEquals(m2.toString(),m1.toString(),"Create deux objets differents");
    }

    @Test
    void ajoute() {
        plat.add(platMenu);
        assertEquals(plat.get(0),platMenu,"Najoute pas correctement");
    }

    @Test
    void position() {
        int i=2;
        assertEquals(courant, i,"Pas la bonne position");
    }

    @Test
    void platCourant() {
        int i= 2;
        assertEquals(courant, i,"Pas la bonne position");
    }

    @Test
    void positionSuivante() {

    }

    @Test
    void positionPrecedente() {
    }

    @Test
    void testToString() {

        assertEquals(m1.toString(),m2.toString(),"Print non fonctionnel");
    }
}