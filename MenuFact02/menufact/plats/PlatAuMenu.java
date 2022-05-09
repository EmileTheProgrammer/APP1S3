package menufact.plats;

import ingredients.Fruit;
import ingredients.Ingredient;

import java.util.List;

public class PlatAuMenu {
    private int code;
    private String description;
    private double prix;



    private double proportion;

    private List<Ingredient> ingre;

    public PlatAuMenu(int code, String description, double prix) {
        this.code = code;
        this.description = description;
        this.prix = prix;
        proportion = 1;
    }

    public PlatAuMenu() {
    }

    @Override
    public String toString() {
        return "menufact.plats.PlatAuMenu{" +
                "code=" + code +
                ", description='" + description + '\'' +
                ", prix=" + prix +
                "}\n";
    }

    public int getCode() {
        return code;
    }

    public double getProportion() {
        return proportion;
    }
    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setIngredientPlat(List<Ingredient> ingredientPlat){
        ingre = ingredientPlat;
    }

    public List<Ingredient> getIngredientPlat(){
        return ingre;
    }
}
