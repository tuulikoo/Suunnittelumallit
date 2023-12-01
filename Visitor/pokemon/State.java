package pokemon;

// State interface defining the common methods for Pokemon states
public interface State {
    // Method for simulating a battle action
    void taistele();

    // Method for triggering evolution, takes the context as a parameter
    void kehity(Context context);

    // Method for accepting a visitor, allowing external actions on the current state
    void accept(Visitor visitor);
}
