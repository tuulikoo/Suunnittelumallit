public class Jalapeno extends AbstractPizza{

    private final Pizza pizza;

    public Jalapeno(Pizza pizza){
    this.pizza = pizza;
    }

    @Override
    public String getFillings() {
        
        return pizza.getFillings() +   "jalapeno\n";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 1;
    }
    
}
