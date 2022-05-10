package chef;

import ingredients.Ingredient;
import ingredients.IngredientInventaire;
import ingredients.exceptions.IngredientException;
import inventaire.Inventaire;
import menufact.plats.PlatChoisi;

/**
 * @author Emile Boutin, Samuel Trepanier
 * Classe permettant de controler le chef
 */
public class Chef extends Observer {
    private static Chef chef;
    private Inventaire inventaire = Inventaire.getInstance();
    private String nom;
    public Chef(){

    }

    /**
     *
     * @return
     */
    public static Chef getInstance(){
        if(chef == null){
            return chef = new Chef();
        }
        return chef;
    }

    /**
     *
     * @param plat
     * @return
     * @throws IngredientException
     */
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

    /**
     *
     * @param plat
     */
    public void commande(PlatChoisi plat){
        plat.setEtat(new Commande());
        System.out.println(plat.getEtat().toString());
    }

    /**
     *
     * @param plat
     */
    public void enPreparation(PlatChoisi plat){
        plat.setEtat(new EnPreparation());
        System.out.println(plat.getEtat().toString());
    }

    /**
     *
     * @param plat
     */
    public void servi(PlatChoisi plat){
        plat.setEtat(new Servi());
        System.out.println(plat.getEtat().toString());
    }

    /**
     *
     * @param plat
     */
    public void termine(PlatChoisi plat){
        plat.setEtat(new Termine());
        System.out.println(plat.getEtat().toString());
    }

    /**
     *
     * @param plat
     * @return
     */
    public boolean verificationIngredient(PlatChoisi plat){
        for(Ingredient verifIngre : plat.getPlat().getIngredientPlat()){
            double platQty = plat.getQuantite() * plat.getProportion();
            double inventaireQty = getQtyIngredientInventaire(verifIngre);
            if(inventaireQty == -1 || inventaireQty - platQty < 0) {
                plat.setEtat(new ImpossibleDeServir());
                System.out.println(plat.getEtat().toString());
                return false;
            }
        }
        return true;
    }

    /**
     *
     * @param ingre
     * @return
     */
    private double getQtyIngredientInventaire(Ingredient ingre){
        for(IngredientInventaire ingreInv : inventaire.getIngredientInventaire()){
            if(ingreInv.getIngredient() == ingre){
                return ingreInv.getQuantite();
            }
        }
        return -1;
    }

    /**
     *
     * @param plat
     * @throws IngredientException
     */
    public void platConsomme(PlatChoisi plat) throws IngredientException{
        for(Ingredient Ingre : plat.getPlat().getIngredientPlat()){
            double qty = plat.getQuantite() * plat.getProportion();
            for(IngredientInventaire ingreInv : inventaire.getIngredientInventaire()){
                if(ingreInv.getIngredient() == Ingre){
                    ingreInv.setQuantite(ingreInv.getQuantite() - qty);
                }
            }
        }
    }

    /**
     *
     * @param nom
     */
    public void setNom(String nom){
        this.nom = nom;
    }

    /**
     *
     * @return
     */
    public String getNom(){
        return nom;
    }

    /**
     *
     * @param plat
     */
    @Override
    public void update(PlatChoisi plat) {
        commande(plat);
        if(verificationIngredient(plat)){
            try {
                platConsomme(plat);
            } catch (IngredientException e) {
                throw new RuntimeException(e);
            }
            enPreparation(plat);
            servi(plat);
            termine(plat);
        }
    }
}
