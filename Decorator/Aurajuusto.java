public class Aurajuusto extends AbstractPizza {

    private final Pizza pizza;

    public Aurajuusto(Pizza pizza){
    this.pizza = pizza;
    }
    @Override
    public String getFillings() {

        return pizza.getFillings() +   "aurajuusto\n";
    }

    @Override
    public double getPrice() {

        return pizza.getPrice() + 1.00;
    }
    
}
