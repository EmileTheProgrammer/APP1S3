package menufact.facture;

public class FactOuvert implements State {
    FactureEtat etat = FactureEtat.OUVERTE;
    @Override
    public State changerState(FactureEtat newEtat){
        if(newEtat == FactureEtat.FERMEE)
            return new FactFermee();
        else if(newEtat == FactureEtat.PAYEE)
            return new FactPayee();
        return null;
    }

    @Override
    public FactureEtat getState() {
        return etat;
    }
}
