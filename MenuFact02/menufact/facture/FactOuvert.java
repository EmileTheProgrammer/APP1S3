package menufact.facture;

public class FactOuvert implements State {

    @Override
    public void changerState(Facture facture) {
        facture.setState(new FactFermee());
    }

    @Override
    public FactureEtat getState() {
        return FactureEtat.OUVERTE;
    }
}
