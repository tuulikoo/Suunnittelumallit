package pokemon;
class Charizard implements State {
    //Charizard-state
    @Override
    public void taistele() {
        System.out.println("Charizard tekee ilmahyökkäyksen!");
        System.out.println("Charizard tekee Air Slashin");
        kehity(new Context()); 
    }

    @Override
    public void kehity(Context context) {
        System.out.println("Charizard on korkeimmassa kehitysmuodossaan!");
    }
}