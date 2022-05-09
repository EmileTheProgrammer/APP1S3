package chef;

import menufact.plats.PlatChoisi;

public class Chef extends Observer {
    private static Chef chef;

    private String nom;
    public Chef(){

    }

    public static Chef getInstance(){
        if(chef == null){
            return chef = new Chef();
        }
        return chef;
    }

    public boolean notify(PlatChoisi plat){
        commande(plat);
        if(verificationIngredient(plat)){
            enPreparation(plat);
            servi(plat);
            termine(plat);
            return true;
        }
        return false;
    }

    public void commande(PlatChoisi plat){
        plat.setEtat(new Commande());
    }

    public void enPreparation(PlatChoisi plat){
        plat.setEtat(new EnPreparation());
    }

    public void servi(PlatChoisi plat){
        plat.setEtat(new Servi());
    }

    public void termine(PlatChoisi plat){
        plat.setEtat(new Termine());
    }

    public boolean verificationIngredient(PlatChoisi plat){
        return true;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public String getNom(){
        return nom;
    }

    @Override
    public void update() {

    }
}
