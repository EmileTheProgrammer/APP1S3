package menufact.facture;

/**
 * Les states
 */
public interface State {
    public abstract State changerState(FactureEtat etat);
    public abstract FactureEtat getState();
}
