package pokemon;

public class Context {
    private State currentState;

    public Context() {
        // Aluksi ollaan Charmander-tilassa
        currentState = new Charmander();
    }

    public void setState(State state) {
        currentState = state;
    }

    public void taistele() {
        currentState.taistele();
    }

    public void kehity() {
        currentState.kehity(this);
    }
}