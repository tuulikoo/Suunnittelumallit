

public interface IBurgerBuilder {
    
    public abstract void createNewBurgerProduct();
    public abstract void buildBun();
    public abstract void buildProtein();
    public abstract void buildSauce();
    public abstract void buildFilling();
    public abstract Object getBurger();
}
