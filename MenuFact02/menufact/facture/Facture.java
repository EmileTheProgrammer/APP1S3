package menufact.facture;

import chef.Chef;
import chef.ImpossibleDeServir;
import ingredients.exceptions.IngredientException;
import menufact.Client;
import menufact.facture.exceptions.FactureException;
import menufact.plats.PlatChoisi;
import chef.Observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Une facture du systeme Menufact
 * @author Emile Boutin, Samuel Trepanier
 * @version 1.0
 */
public class Facture {
    private Date date;
    private String description;
    private State etat;
    private ArrayList<PlatChoisi> platchoisi = new ArrayList<PlatChoisi>();
    private int courant;
    private Client client;

    private Chef chef;

    private ArrayList <Observer> obs = new ArrayList<Observer>();

    /**********************Constantes ************/
    private final double TPS = 0.05;
    private final double TVQ = 0.095;

    /**
     *
     * @param client le client de la facture
     */
    public void associerClient (Client client)
    {
        this.client = client;
    }
    public void addObserver(Observer obs1){
        if(!obs.contains(obs1)){
            obs.add(obs1);
        }}

    public List<Observer> getObserver(){
        return obs;
    }
    public void NotifyAllObservers(PlatChoisi p){

            for(int i=0; i <obs.size();i++){
                Observer o = obs.get(i);
                o.update(p);
            }
    }

    /**
     * Calcul du sous total de la facture
     * @return le sous total
     */
    public double sousTotal()
    {
        double soustotal=0;
         for (PlatChoisi p : platchoisi)
             soustotal += p.getQuantite() * p.getPlat().getPrix();
        return soustotal;
    }

    /**
     *
     * @return le total de la facture
     */
    public double total(){
        return sousTotal()+tps()+tvq();
    }

    /**
     *
     * @return la valeur de la TPS
     */
    private double tps(){
        return TPS*sousTotal();
    }

    /**
     *
     * @return la valeur de la TVQ
     */
    private  double tvq(){
        return TVQ*(TPS+1)*sousTotal();
    }

    /**
     * Permet de chager l'état de la facture à PAYEE
     */
    public void payer()
    {
       etat = etat.changerState(FactureEtat.PAYEE);
       System.out.println(etat.getState());
    }
    /**
     * Permet de chager l'état de la facture à FERMEE
     */
    public void fermer()
    {
       etat = etat.changerState(FactureEtat.FERMEE);
       System.out.println(etat.getState());
    }

    /**
     * Permet de changer l'état de la facture à OUVERTE
     * @throws FactureException en cas que la facture soit PAYEE
     */
    public void ouvrir() throws FactureException
    {
        if (etat.getState() == FactureEtat.PAYEE)
            throw new FactureException("La facture ne peut pas être reouverte.");
        else {
            etat = etat.changerState(FactureEtat.OUVERTE);
        }
    }

    /**
     *
     * @return l'état de la facture
     */
    public FactureEtat getEtat()
    {
        return etat.getState();
    }
    public Date getdate(){return date;}
    public String getDescription(){return description;}
    public int getCourant(){return courant;}

    /**
     *
     * @param description la description de la Facture
     */
    public Facture(String description) {
        date = new Date();
        etat = new FactOuvert();
        chef = Chef.getInstance();
        chef.setNom("MasterChef");
        addObserver(chef);
        courant = -1;
        this.description = description;
    }


    /**
     *
     * @param p un plat choisi
     * @throws FactureException Seulement si la facture est OUVERTE
     */
    public void ajoutePlat(PlatChoisi p) throws FactureException, IngredientException
    {
        if (etat.getState() == FactureEtat.OUVERTE) {
            platchoisi.add(p);
            NotifyAllObservers(p);
            if(p.getEtat() instanceof ImpossibleDeServir)
                retirerPlat(p);
        }
        else
            throw new FactureException("On peut ajouter un plat seulement sur une facture OUVERTE.");
    }

    public void retirerPlat(PlatChoisi plat){
        platchoisi.remove(plat);
    }

    /**
     *
     * @return le contenu de la facture en chaîne de caracteres
     */
    @Override
    public String toString() {
        return "menufact.facture.Facture{" +
                "date=" + date +
                ", description='" + description + '\'' +
                ", etat=" + etat +
                ", platchoisi=" + platchoisi +
                ", courant=" + courant +
                ", client=" + client +
                ", TPS=" + TPS +
                ", TVQ=" + TVQ +
                '}';
    }

    /**
     *
     * @return une chaîne de caractères avec la facture à imprimer
     */
    public String genererFacture()
    {
        String lesPlats = new String();
        String factureGenere = new String();

        int i =1;


        factureGenere =   "Facture generee.\n" +
                          "Date:" + date + "\n" +
                          "Description: " + description + "\n" +
                          "Client:" + client.getNom() + "\n" +
                          "Les plats commandes:" + "\n" + lesPlats;

        factureGenere += "Seq   Plat         Prix   Quantite\n";
        for (PlatChoisi plat : platchoisi)
        {
            factureGenere +=  i + "     " + plat.getPlat().getDescription() +  "  " + plat.getPlat().getPrix() +  "      " + plat.getQuantite() + "\n";
            i++;
        }

        factureGenere += "          TPS:               " + tps() + "\n";
        factureGenere += "          TVQ:               " + tvq() + "\n";
        factureGenere += "          Le total est de:   " + total() + "\n";

        return factureGenere;
    }

    public Date getDate() {
        return date;
    }

    public Client getClient() {
        return client;
    }

    public double getTPS() {
        return TPS;
    }

    public double getTVQ() {
        return TVQ;
    }
    public ArrayList<PlatChoisi> getPlatChoisi(){
        return platchoisi;
    }
}
