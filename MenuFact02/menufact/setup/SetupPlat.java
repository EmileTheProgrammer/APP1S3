package menufact.setup;

import ingredients.Fruit;
import ingredients.Ingredient;
import menufact.plats.PlatAuMenu;
import menufact.plats.PlatSante;

import java.util.ArrayList;
import java.util.List;

public class SetupPlat {

    private List<Ingredient> ingredients;
    public SetupPlat() {
        PlatAuMenu p1 = new PlatAuMenu(0, "PlatAuMenu0", 10);

        PlatSante ps1 = new PlatSante(10, "PlatSante0", 10, 11, 11, 11);
        }


}
