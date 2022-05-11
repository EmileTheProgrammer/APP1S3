package chef;

import menufact.plats.PlatChoisi;

/**
 * Classe observer
 */
public abstract class Observer {
    protected Chef chef;
    public abstract void update(PlatChoisi plat);
}
