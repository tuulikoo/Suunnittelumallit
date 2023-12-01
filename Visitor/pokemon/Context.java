package pokemon;

// Context class that maintains the state of a Pokemon and handles state transitions
public class Context {
    private State currentState; // Current state of the Pokemon
    private int battleCount; // Counter to track the number of battles

    // Constructor initializes the context with Charmander as the initial state
    public Context() {
        // Aluksi ollaan Charmander-tilassa (Initially in Charmander state)
        currentState = new Charmander();
    }

    // Set the current state of the Pokemon
    public void setState(State state) {
        currentState = state;
    }

    // Perform a battle action based on the current state
    public void taistele() {
        currentState.taistele(); // Call the battle action of the current state
        battleCount++; // Increment the battle count

        // Check if the battle count is a multiple of 3 to trigger evolution
        if (battleCount % 3 == 0) {
            kehity(); // Evolve the Pokemon
        }
    }

    // Trigger the evolution action based on the current state
    public void kehity() {
        currentState.kehity(this); // Call the evolution action of the current state and provide the context
    }

    // Accept a visitor, allowing external actions to be performed on the current state
    public void accept(Visitor visitor) {
        currentState.accept(visitor);
    }
}
