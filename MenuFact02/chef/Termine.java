package chef;

public class Termine implements EtatCommande{
    /**
     *
     * @param newEtat
     * @return
     */
    public EtatCommande changerEtat(EtatCommande newEtat){
        if(newEtat instanceof EnPreparation)
            return newEtat;
        return new Termine();
    }

    @Override
    public String toString(){
        return "Termine";
    }
}
