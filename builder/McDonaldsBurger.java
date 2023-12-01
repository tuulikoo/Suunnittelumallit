

import java.util.ArrayList;
import java.util.List;

public class McDonaldsBurger {
    private Bun bun;
    private Protein protein;
    private Sauce sauce;
    private List<String> fillings = new ArrayList<>();

    public McDonaldsBurger() {}

    public void setBun(Bun bun) {
        this.bun = bun;
    }

    public void setProtein(Protein protein) {
        this.protein = protein;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public void setFilling(String filling) {
        fillings.add(filling);
    }

    @Override
    public String toString() {
        return "McDonaldsBurger:" +
                "bun=" + bun +
                ", protein=" + protein +
                ", sauce=" + sauce +
                ", fillings=" + fillings;
    }

    
}
