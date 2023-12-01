package pokemon;

// Charmander class implements the State interface
class Charmander implements State {
    
    // Charmander state action for battling
    @Override
    public void taistele() {
        System.out.println("Charmander ampuu tulisia kipinöitä!"); // Charmander shoots fiery sparks
    }

    // Charmander state action for evolution
    @Override
    public void kehity(Context context) {
        System.out.println("Charmander kehittyy Charmeleoniksi!"); // Charmander evolves into Charmeleon
        context.setState(new Charmeleon()); // Set the context's state to Charmeleon
    }

    // Accept a visitor, allowing external actions to be performed on this state
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
