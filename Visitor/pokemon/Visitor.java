package pokemon;

// Visitor interface defining methods for visiting different Pokemon states
public interface Visitor {
    // Method to visit Charmander state
    void visit(Charmander charmander);

    // Method to visit Charmeleon state
    void visit(Charmeleon charmeleon);

    // Method to visit Charizard state
    void visit(Charizard charizard);
}
