package menufact;

import menufact.facture.Facture;
import menufact.plats.PlatAuMenu;
import menufact.plats.PlatChoisi;
import menufact.plats.PlatSante;

import java.util.Scanner;

public class menuFactFacade {
public void menuClient(){
MenuAcceuil MenuAcceuil = new MenuAcceuil();    PlatSante ps2 = new PlatSante(3, "Salade Cesar", 8.25, 100, 10, 1);
    Menu menu = Menu.getInstance("Menu1");
    System.out.println("Quel plat a choisir");
    Scanner sc = new Scanner(System.in);
    PlatChoisi pch1 = new PlatChoisi(ps2, 5);
    menu.ajoute(ps2);
    Facture facture = new Facture("Ma facture");
    MenuFin MenuFin = new MenuFin();







}
}
