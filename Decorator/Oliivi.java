public class Oliivi extends AbstractPizza {

    private final Pizza pizza;

    public Oliivi(Pizza pizza){
    this.pizza = pizza;
    }
    @Override
    public String getFillings() {

        return pizza.getFillings() +   "oliivi\n";
    }

    @Override
    public double getPrice() {
        // TODO Auto-generated method stub
       return pizza.getPrice() + 1.00;
    }
    
}
