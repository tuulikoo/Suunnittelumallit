

public class Sauce {
    private String type;

    public Sauce(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() { return type; }
}
