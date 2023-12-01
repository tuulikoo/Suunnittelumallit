public class Ananas extends AbstractPizza {

    private final Pizza pizza;

    public Ananas(Pizza pizza){
    this.pizza = pizza;
    }
    

    @Override
    public String getFillings() {
        return pizza.getFillings() +   "ananas\n";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 1.00;
    }
    
}
