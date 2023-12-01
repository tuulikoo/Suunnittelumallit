package pokemon;

class Charmander implements State {
    //Charmander-state
    @Override
    public void taistele() {
        System.out.println("Charmander ampuu tulisia kipinöitä!");
        kehity(new Context());

    }

    @Override
    public void kehity(Context context) {
        System.out.println("Charmander kehittyy Charmeleoniksi!");
        context.setState(new Charmeleon());
    }
}