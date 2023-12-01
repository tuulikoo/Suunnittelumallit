package pokemon;
public class Main {
    public static void main(String[] args) {
        Context pokemon = new Context();


        for (int i = 0; i < 3; i++) {
            System.out.println("Kierros " + (i + 1));
            pokemon.taistele();
        
            System.out.println("******************");
        }
    }
}