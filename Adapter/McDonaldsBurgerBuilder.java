

public class McDonaldsBurgerBuilder implements IBurgerBuilder {
    
    private McDonaldsBurger burger;
    
    public void createNewBurgerProduct() {
        burger = new McDonaldsBurger();
    }
    
    public void buildBun() {
        burger.setBun(new Bun("Wheat bun"));
    }
    
    public void buildProtein() {
        burger.setProtein(new Protein("Double Beef"));
    }
    
    public void buildSauce() {
        burger.setSauce(new Sauce("Bic Mac sauce"));
    }
    
    public void buildFilling() {
        burger.setFilling("Lettuce, Tomato, Pickles, Onions");
    }
    
    public McDonaldsBurger getBurger() {
        return burger;
    }
}
