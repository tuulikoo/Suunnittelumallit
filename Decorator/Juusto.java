public class Juusto extends AbstractPizza {

    private final Pizza pizza;

    public Juusto(Pizza pizza){
    this.pizza = pizza;
    }
    @Override
    public String getFillings() {
        
        return pizza.getFillings() +   "juusto\n";
    }

    @Override
    public double getPrice() {

        return pizza.getPrice() + 0.00;
    }
    

}
