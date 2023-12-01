public class App{


    public static void main(String[] args) throws Exception {
        
        Laiteosa muistipiiri = new Muistipiiri();
        Laiteosa prosessori = new Prosessori(); 
        Laiteosa verkkokortti = new Verkkokortti(); 
        Laiteosa näytönohjain = new Naytonohjain(); 

        Laiteosa emolevy = new Emolevy();

        ((Emolevy) emolevy).lisaaOsa(prosessori);
        ((Emolevy) emolevy).lisaaOsa(muistipiiri);

        Laiteosa kotelo = new Kotelo();

        ((Kotelo) kotelo).lisaaOsa(verkkokortti);
        ((Kotelo) kotelo).lisaaOsa(näytönohjain);
        ((Kotelo) kotelo).lisaaOsa(emolevy);

        double totalHinta = kotelo.getHinta();
        System.out.println("Tietokoneen hinta on " + totalHinta + " ja se koostuu seuraavista osista: \n" + kotelo.getNimi());
    }
}
