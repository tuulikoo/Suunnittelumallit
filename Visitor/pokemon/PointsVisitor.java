package pokemon;

// PointsVisitor class implements the Visitor interface
public class PointsVisitor implements Visitor {
    private int totalPoints = 0; // Total points accumulated by the visitor

    // Visit method for Charmander state
    @Override
    public void visit(Charmander charmander) {
        totalPoints += 100; // Add 100 points for Charmander
        System.out.println("Bonuspisteet Charmanderille: " + totalPoints + "!"); // Print bonus points for Charmander
    }

    // Visit method for Charmeleon state
    @Override
    public void visit(Charmeleon charmeleon) {
        totalPoints += 200; // Add 200 points for Charmeleon
        System.out.println("Bonuspisteet Charmeleonille: " + totalPoints + "! "); // Print bonus points for Charmeleon
    }

    // Visit method for Charizard state
    @Override
    public void visit(Charizard charizard) {
        totalPoints += 300; // Add 300 points for Charizard
        System.out.println("Bonuspisteet Charizardille: " + totalPoints + "! "); // Print bonus points for Charizard
    }
}
