public class Pizzalista {
    
public static void main(String[] args) {
        //Marherita
        Pizza Margherita = new Juusto(new Tomaattikastike(new Pohja()));
        System.out.println("Pizza Margherita:\n" + Margherita.getFillings());
        System.out.println("Margheritan hinta: $\n" + Margherita.getPrice() + "\n");

        //Tropical
        Pizza Tropical = new Ananas(new Aurajuusto(Margherita));
        System.out.println("Pizza Tropical:\n" + Tropical.getFillings());
        System.out.println("Price: $\n" + Tropical.getPrice()+ "\n");

        // Fantasia
        Pizza Fantasia = new Jalapeno(new Oliivi(new Rucola(Tropical)));
        System.out.println("Pizza Fantasia: \n" + Fantasia.getFillings());
        System.out.println("Price: $\n" + Fantasia.getPrice()+ "\n");

    }
}
