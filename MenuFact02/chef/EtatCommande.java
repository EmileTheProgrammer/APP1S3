package chef;

/**
 * Interface de letat de la commande
 */
public interface EtatCommande {
    public EtatCommande changerEtat(EtatCommande newEtat);
    public String toString();
}
