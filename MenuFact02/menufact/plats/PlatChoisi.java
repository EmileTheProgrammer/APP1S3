package menufact.plats;

import chef.Commande;
import chef.EtatCommande;

public class PlatChoisi{
    private PlatAuMenu plat;
    private int quantite;

    private EtatCommande etat;
    public PlatChoisi(PlatAuMenu plat, int quantite) {
        this.plat = plat;
        this.quantite = quantite;
        etat = new Commande();
    }

    @Override
    public String toString() {
        return "menufact.plats.PlatChoisi{" +
                "quantite=" + quantite +
                ", plat=" + plat +
                '}';
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public PlatAuMenu getPlat() {
        return plat;
    }

    public void setEtat(EtatCommande etat){
        this.etat = etat;
    }

    public EtatCommande getEtat(){
        return etat;
    }

    public double getProportion(){
        return plat.getProportion();
    }
}
