package chef;

public interface EtatCommande {
    public EtatCommande changerEtat(EtatCommande newEtat);
    public String toString();
}
