package Memento_new;
public class Main {
    public static void main(String[] args) {
        Arvuuttaja arvuuttaja = new Arvuuttaja(); // Luodaan arvuuttaja
        //Pelaaja-luokaan pitää extendata Thread-luokkaa, jotta pelaaja voi olla säie
        

        // Luodaan useita pelaajasäikeitä ja käynnistetään peli
        for (int i = 0; i < 5; i++) {
            Thread asiakasThread = new Thread(new Asiakas(arvuuttaja));
            asiakasThread.start();
        }
    }
}