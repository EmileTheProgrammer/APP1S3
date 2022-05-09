package chef;

public class ImpossibleDeServir implements EtatCommande{
    public EtatCommande changerEtat(EtatCommande newEtat){
        return newEtat;
    }

    @Override
    public String toString(){
        return "Impossible de servir";
    }
}
