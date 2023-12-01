package pokemon;

// Main class to demonstrate the Pokemon context and visitor pattern
public class Main {
    public static void main(String[] args) {
        // Create a Pokemon context (initially in Charmander state)
        Context pokemon = new Context();

        // Create a visitor (PointsVisitor) to perform actions on the Pokemon states
        Visitor visitor = new PointsVisitor();

        // Accept the visitor to perform initial actions on the Pokemon
        pokemon.accept(visitor);

        // Simulate battles and evolution over multiple rounds
        for (int i = 0; i < 9; i++) {
            System.out.println("Kierros " + (i + 1)); // Print the current round number
            pokemon.taistele(); // Simulate a battle action
            System.out.println("******************"); // Separator for better readability
            pokemon.accept(visitor); // Accept the visitor to perform actions on the current state
        }
    }
}
