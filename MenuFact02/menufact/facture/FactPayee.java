package menufact.facture;

public class FactPayee implements State{
    @Override
    public void changerState(Facture facture) {

    }

    @Override
    public FactureEtat getState() {
        return FactureEtat.PAYEE;
    }
}
