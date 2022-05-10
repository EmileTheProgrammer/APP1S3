package ingredients;

/**
 * @author Emile Boutin, Samuel Trepanier
 * Classe absraitre definissant les ingredients
 */
public abstract class Ingredient {
    private String nom;
    private String description;
    private TypeIngredient typeIngredient;

    /**
     *
     * @param nom
     * @param typeIngredient
     * @param description
     */
    public Ingredient(String nom, TypeIngredient typeIngredient, String description){
        this.nom = nom;
        this.typeIngredient = typeIngredient;
        this.description = description;
    }

    /**
     *
     * @return
     */
    public String getNom() {
        return nom;
    }

    /**
     *
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     */
    public TypeIngredient getTypeIngredient() {
        return typeIngredient;
    }

    /**
     *
     * @param typeIngredient
     */
    public void setTypeIngredient(TypeIngredient typeIngredient) {
        this.typeIngredient = typeIngredient;
    }
}
