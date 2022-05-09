package menufact.facture;

public class FactFermee implements State{
    FactureEtat etat = FactureEtat.FERMEE;
    @Override
    public State changerState(FactureEtat newEtat) {
        if(newEtat == FactureEtat.OUVERTE)
            return new FactOuvert();
        else if(newEtat == FactureEtat.PAYEE)
            return new FactOuvert();
        return null;
    }

    @Override
    public FactureEtat getState() {
        return etat;
    }
}
