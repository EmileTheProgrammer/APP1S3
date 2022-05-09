package menufact.facture;

public class FactPayee implements State{
    FactureEtat etat = FactureEtat.PAYEE;
    @Override
    public State changerState(FactureEtat newEtat) {
        return new FactPayee();
    }

    @Override
    public FactureEtat getState() {
        return etat;
    }
}
