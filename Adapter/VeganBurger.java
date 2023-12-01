import java.util.ArrayList;
import java.util.List;

public class VeganBurger {
    private String bread;
    private List<String> components = new ArrayList<>();

    public void setBread(String bread) {
        this.bread = bread;
    }

    public void setComponents(List<String> components) {
        this.components = components;
    }

    public String toString() {
        return "Vegan burger: " + bread + " " + components;
    }
}
