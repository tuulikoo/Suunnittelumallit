package pokemon;
class Charmeleon implements State {
    //Charmeleon state
    @Override
    public void taistele() {
        System.out.println("Charmeleon tekee Flamethrower-hyökkäyksen!");
        kehity(new Context()); 
    }

    @Override
    public void kehity(Context context) {
        System.out.println("Charmeleon kehittyy Charizardiksi!");
        context.setState(new Charizard());
    }
}