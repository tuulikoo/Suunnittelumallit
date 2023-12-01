public class Rucola extends AbstractPizza{

    private final Pizza pizza;

    public Rucola(Pizza pizza){
    this.pizza = pizza;
    }
    @Override
    public String getFillings() {
       
        return pizza.getFillings() +  "rucola\n";
    }

    @Override
    public double getPrice() {
        
        return pizza.getPrice() + 1.00;
    }
    
}
