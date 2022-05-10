package tests;

import menufact.plats.PlatAuMenu;
import menufact.plats.PlatChoisi;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlatChoisiTest {
private PlatChoisi plat;
private PlatAuMenu platMenu;
    @BeforeEach
    void setUp() {
        platMenu=new PlatAuMenu(1,null,2.0);
        plat = new PlatChoisi(platMenu,3);
    }


    @Test
    void setGetQuantite() {
    }

    @Test
    void getPlat() {
    }

    @Test
    void setEtat() {
    }

    @Test
    void getEtat() {
    }

    @Test
    void getProportion() {
    }
}