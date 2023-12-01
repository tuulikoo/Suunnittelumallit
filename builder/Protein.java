

public class Protein {
    private String type;

    public Protein(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() { return type; }
}
