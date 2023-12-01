

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Filling {
    private List<String> fillings = new ArrayList<>();

    public Filling() {

    }

    public void setFilling(List<String> fillings) {
        this.fillings = fillings;
    }

    // Set a single string as filling
    public void setFilling(String filling) {
        this.fillings = Arrays.asList(filling.split(", "));
    }

    public List<String> getFilling() {
        return fillings;
    }

    public String addIngredient(String ingredient) {
        fillings.add(ingredient);
        return ingredient;
    }

    public String toString() {
        return "Burger details: " + String.join(", ", fillings);
    }

}

