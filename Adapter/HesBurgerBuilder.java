


public class HesBurgerBuilder  implements IBurgerBuilder{
    
    private HesBurger burger;
    
    public void createNewBurgerProduct() {
        burger = new HesBurger();
    }
    
    public void buildBun() {
        burger.setBun(new Bun("Whole grain bun"));
    }
    
    public void buildProtein() {
        burger.setProtein(new Protein("Fish patty"));
    }
    
    public void buildSauce() {
        burger.setSauce(new Sauce("Mayo"));
    }
    
    public void buildFilling() {
        Filling filling = new Filling();
        filling.addIngredient("Lettuce");
        filling.addIngredient("Tomato");
        filling.addIngredient("Onion");
        burger.setFilling(filling);
    }
    
    public HesBurger getBurger() {
        return burger;
    }
}
