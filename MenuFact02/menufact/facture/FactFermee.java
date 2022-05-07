package menufact.facture;

public class FactFermee implements State{
    @Override
    public void changerState(Facture facture) {
        facture.setState(new FactOuvert());
    }

    @Override
    public FactureEtat getState() {
        return FactureEtat.FERMEE;
    }
}
