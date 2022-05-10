package menufact.facture;
import menufact.plats.PlatChoisi;
import menufact.Client;

import java.util.ArrayList;
import java.util.Date;
public class FactureView {


    public String update(Date date, String description, FactureEtat etat, ArrayList<PlatChoisi> platchoisi, int courant, Client client, double TPS, double TVQ) {
        String factureGenere = new String();
        if(platchoisi.isEmpty()){}else{
        String lesPlats = new String();

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
        double soustotal=0;
        for (PlatChoisi p : platchoisi)
            soustotal += p.getQuantite() * p.getPlat().getPrix();

               double tps1=TVQ*(TPS+1)*soustotal;
               double tvq1=TVQ*(TPS+1)*soustotal;
               double total =soustotal+tps1+tvq1;
        factureGenere += "          TtS:               " + tps1+ "\n";
        factureGenere += "          TVQ:               " + tvq1+ "\n";
        factureGenere += "          Le total est de:   " + total + "\n";



        }
    return factureGenere;
    }
}