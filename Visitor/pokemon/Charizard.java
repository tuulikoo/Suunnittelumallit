package pokemon;

// Charizard class implements the State interface
class Charizard implements State {
    
    // Charizard state action for battling
    @Override
    public void taistele() {
        System.out.println("Charizard tekee ilmahyökkäyksen!"); // Charizard performs an aerial attack
        System.out.println("Charizard tekee Air Slashin"); // Charizard executes Air Slash
    }

    // Charizard state action for evolution
    @Override
    public void kehity(Context context) {
        System.out.println("Charizard on korkeimmassa kehitysmuodossaan!"); // Charizard is in its highest evolution form
    }

    // Accept a visitor, allowing external actions to be performed on this state
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
