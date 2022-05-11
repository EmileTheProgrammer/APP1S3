package tests;

import chef.Chef;
import chef.Observer;
import menufact.facture.Facture;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactureTest {

    Observer obs;
    Chef chef1;
    Facture facture;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        chef1 = Chef.getInstance();
        facture = new Facture("");
    }
    @Test
    void addObserver() {
        facture.addObserver(chef1);
        facture.addObserver(chef1);
        assertEquals(facture.getObserver().size(), 1);
    }
}