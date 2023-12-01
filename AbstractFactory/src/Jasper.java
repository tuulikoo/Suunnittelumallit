public class Jasper {
    private VaateTehdas tehdas;
    private Lippis lippis;
    private Tpaita paita;
    private Farkut farkut;
    private Lenkkarit lenkkarit;

    //tehdas luodaan pääohjelmassa
    public Jasper(VaateTehdas tehdas) {
        this.tehdas = tehdas;
        lippis = tehdas.teeLippis();
        paita = tehdas.teeTpaita();
        farkut = tehdas.teeFarkut();
        lenkkarit = tehdas.teeLenkkarit();
    }

    public void kerroVaatteet() {
        System.out.println("Jasperilla on nyt päällä " + lippis + ", " + paita + ", " + farkut + " ja " + lenkkarit);
    } 
}
