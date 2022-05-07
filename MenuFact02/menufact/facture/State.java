package menufact.facture;

public interface State {
    public abstract void changerState(Facture facture);
    public abstract FactureEtat getState();
}
