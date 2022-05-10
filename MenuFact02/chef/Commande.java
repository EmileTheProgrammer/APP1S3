package chef;


public class Commande implements EtatCommande{
    /**
     *
     * @param newEtat
     * @return
     */
    public EtatCommande changerEtat(EtatCommande newEtat){
        if(newEtat instanceof EnPreparation)
            return newEtat;
        return new EnPreparation();
    }

    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return "Commande";
    }
}
