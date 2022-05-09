package ingredients;

public abstract class Ingredient {
    private String nom;
    private String description;
    private TypeIngredient typeIngredient;

    public Ingredient(String nom, TypeIngredient typeIngredient, String description){
        this.nom = nom;
        this.typeIngredient = typeIngredient;
        this.description = description;
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TypeIngredient getTypeIngredient() {
        return typeIngredient;
    }

    public void setTypeIngredient(TypeIngredient typeIngredient) {
        this.typeIngredient = typeIngredient;
    }
}
