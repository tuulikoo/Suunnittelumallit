public class Tomaattikastike extends AbstractPizza{

    private final Pizza pizza;

    public Tomaattikastike(Pizza pizza){
    this.pizza = pizza;
    }
    @Override
    public String getFillings() {
        
        return pizza.getFillings() +  "Tomaattikastike\n";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 0.00;
    }
    
    
}
