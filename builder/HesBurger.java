

import java.util.ArrayList;
import java.util.List;

public class HesBurger {
    
    private List<String> ingredients = new ArrayList<>();

    public void setBun(Bun bun) {
        ingredients.add(bun.toString());
    }

    public void setProtein(Protein protein) {
        ingredients.add(protein.toString());
    }

    public void setSauce(Sauce sauce) {
        ingredients.add(sauce.toString());
    }

    public void setFilling(Filling filling) {
        ingredients.addAll(filling.getFilling());
    }

    @Override
    public String toString() {
        return "Hesburger burger: " + String.join(", ", ingredients);
    }
}
