

public class Waiter {
    private IBurgerBuilder burgerBuilder;

    public void setBurgerBuilder(IBurgerBuilder bb) { burgerBuilder = bb; }

    public void constructBurger() {
        
        burgerBuilder.createNewBurgerProduct();
        burgerBuilder.buildBun();
        burgerBuilder.buildProtein();
        burgerBuilder.buildSauce();
        burgerBuilder.buildFilling();
    } 
}
