package chef;

import menufact.plats.PlatChoisi;

public abstract class Observer {
    protected Chef chef;
    public abstract void update(PlatChoisi plat);
}
