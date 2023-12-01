package pokemon;
class Charmeleon implements State {
    //Charmeleon state
    @Override
    public void taistele() {
        System.out.println("Charmeleon tekee Flamethrower-hyökkäyksen!");
    }

    @Override
    public void kehity(Context context) {
        System.out.println("Charmeleon kehittyy Charizardiksi!");
        context.setState(new Charizard());
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}