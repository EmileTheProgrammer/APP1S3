package chef;

public class Commande implements EtatCommande{
    public EtatCommande changerEtat(EtatCommande newEtat){
        if(newEtat instanceof EnPreparation)
            return newEtat;
        return new EnPreparation();
    }

    @Override
    public String toString(){
        return "Commande";
    }
}
