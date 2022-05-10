package chef;

public class Servi implements EtatCommande{
    /**
     *
     * @param newEtat
     * @return
     */
    public EtatCommande changerEtat(EtatCommande newEtat){
        if(newEtat instanceof Termine)
            return newEtat;
        return new Servi();
    }

    @Override
    public String toString(){
        return "Servi";
    }
}
