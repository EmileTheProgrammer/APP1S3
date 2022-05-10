package menufact;

import ingredients.Ingredient;
import ingredients.IngredientInventaire;
import ingredients.exceptions.IngredientException;
import inventaire.Inventaire;
import menufact.facture.Facture;
import menufact.facture.FactureController;
import menufact.facture.FactureView;
import menufact.facture.exceptions.FactureException;
import menufact.plats.PlatAuMenu;
import menufact.plats.PlatChoisi;
import menufact.plats.PlatEnfant;
import menufact.plats.PlatSante;
import menufact.setup.SetupIngredient;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class menuFactFacade {
    private MenuAcceuil MenuAcceuil;
    private MenuFin MenuFin;
public void menuClient(){
    MenuAcceuil = new MenuAcceuil();
    SetupIngredient setupIngredient = new SetupIngredient();
    Inventaire inventaire = Inventaire.getInstance();
    Menu menu = Menu.getInstance("Menu principal");
    Client client = new Client(1234, "Steve", "4231578");

    for(IngredientInventaire ingredient : setupIngredient.getListIngredients()){
        inventaire.ajouter(ingredient);
    }

    List<Ingredient> plat1 = new ArrayList<Ingredient>();
    List<Ingredient> plat2 = new ArrayList<Ingredient>();
    List<Ingredient> plat3 = new ArrayList<Ingredient>();

    System.out.println("===Ajout du premier plat===");

    PlatAuMenu p1 = new PlatAuMenu(0,"PlatAuMenu0",10);
    plat1.add(inventaire.getIngredient("Poivre"));
    plat1.add(inventaire.getIngredient("Steak"));
    plat1.add(inventaire.getIngredient("Patate"));
    p1.setIngredientPlat(plat1);

    System.out.println("===Ajout du deuxieme plat===");

    PlatSante ps1 = new PlatSante(6,"PlatSante0",10,11,11,11);
    plat2.add(inventaire.getIngredient("Poisson"));
    plat2.add(inventaire.getIngredient("Brocolie"));
    plat2.add(inventaire.getIngredient("Poisson"));
    plat2.add(inventaire.getIngredient("Carotte"));
    ps1.setIngredientPlat(plat2);

    System.out.println("===Ajout du troisieme plat===");

    PlatEnfant pe1 = new PlatEnfant(10,"PlatEnfant0", 10, 0.5);
    plat3.add(inventaire.getIngredient("Porc"));
    plat3.add(inventaire.getIngredient("Brocolie"));
    plat3.add(inventaire.getIngredient("Poisson"));
    plat3.add(inventaire.getIngredient("Carotte"));
    pe1.setIngredientPlat(plat3);

    menu.ajoute(p1);
    menu.ajoute(ps1);
    menu.ajoute(pe1);
    System.out.println(menu.toString());


    System.out.println("===Creation de la facture===");
    Facture f = new Facture("Facture");
    System.out.println("===Ajout d'un client===");
    System.out.println(client.toString());
    f.associerClient(client);
    PlatChoisi pc1 = new PlatChoisi(p1,1);
    PlatChoisi pc2 = new PlatChoisi(ps1, 4);
    PlatChoisi pc3 = new PlatChoisi(pe1, 2);
    try {
        System.out.println("===Ajout du premier plat===");
        f.ajoutePlat(pc1);
        System.out.println("===Ajout du deuxieme plat===");
        f.ajoutePlat(pc2);
        System.out.println("===Ajout du deuxieme plat===");
        f.ajoutePlat(pc3);
    }
    catch (FactureException e) {
        throw new RuntimeException(e);
    }
    catch (IngredientException e) {
        System.out.println(e.getMessage());
        throw new RuntimeException(e);
    }
    FactureView view = new FactureView();
    FactureController factControl = new FactureController(f,view);
    System.out.println(factControl.updateVue());
    MenuFin = new MenuFin();
}
}
