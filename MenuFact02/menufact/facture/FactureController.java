package menufact.facture;

public class FactureController {
    private Facture model;
    private FactureView view;
    public FactureController(Facture model, FactureView view){
        this.model=model;
        this.view = view;
    }
    public void updateVue(){
view.update(model.getDate(),model.getDescription(),model.getEtat(),model.getPlatChoisi(),model.getCourant(),model.getClient(),model.getTPS(),model.getTVQ() );
    }
}
