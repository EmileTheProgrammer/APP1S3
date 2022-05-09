package chef;

import ingredients.Ingredient;
import ingredients.IngredientInventaire;
import ingredients.exceptions.IngredientException;
import inventaire.Inventaire;
import menufact.plats.PlatChoisi;

public class Chef {
    private static Chef chef;
    private Inventaire inventaire = Inventaire.getInstance();
    private String nom;
    private Chef(){

    }

    public static Chef getInstance(){
        if(chef == null){
            return chef = new Chef();
        }
        return chef;
    }

    public boolean notify(PlatChoisi plat) throws IngredientException{
        commande(plat);
        if(verificationIngredient(plat)){
            platConsomme(plat);
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
        for(Ingredient verifIngre : plat.getPlat().getIngredientPlat()){
            double platQty = plat.getQuantite() * plat.getProportion();
            double inventaireQty = getQtyIngredientInventaire(verifIngre);
            if(inventaireQty == -1 || inventaireQty - platQty < 0)
                return false;
        }
        return true;
    }

    private double getQtyIngredientInventaire(Ingredient ingre){
        for(IngredientInventaire ingreInv : inventaire.getIngredientInventaire()){
            if(ingreInv.getIngredient() == ingre){
                return ingreInv.getQuantite();
            }
        }
        return -1;
    }

    public void platConsomme(PlatChoisi plat) throws IngredientException{
        for(Ingredient Ingre : plat.getPlat().getIngredientPlat()){
            double qty = plat.getQuantite() * plat.getProportion();
            for(IngredientInventaire ingreInv : inventaire.getIngredientInventaire()){
                if(ingreInv.getIngredient() == Ingre){
                    ingreInv.setQuantite((int) (ingreInv.getQuantite() - qty));
                }
            }
        }
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public String getNom(){
        return nom;
    }
}
