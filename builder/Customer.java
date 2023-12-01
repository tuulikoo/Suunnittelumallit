

public class Customer {
    public static void main(String[] args) {

        Waiter waiter = new Waiter();

        HesBurgerBuilder burgerbuilder = new HesBurgerBuilder();
        waiter.setBurgerBuilder(burgerbuilder);
        waiter.constructBurger();
        HesBurger burger = burgerbuilder.getBurger();
        System.out.println(burger);
    
        
        McDonaldsBurgerBuilder burgerbuilder2 = new McDonaldsBurgerBuilder();
        waiter.setBurgerBuilder(burgerbuilder2);
        waiter.constructBurger();
        McDonaldsBurger burger2 = burgerbuilder2.getBurger();
        System.out.println(burger2); 
        }
}
