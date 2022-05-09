package chef;

public class EnPreparation implements EtatCommande{
    public EtatCommande changerEtat(EtatCommande newEtat){
        if(newEtat instanceof Termine)
            return newEtat;
        return new EnPreparation();
    }

    @Override
    public String toString(){
        return "En preparation";
    }
}
