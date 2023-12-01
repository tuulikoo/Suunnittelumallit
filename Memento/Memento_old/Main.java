package Memento_old;
public class Main {
    public static void main(String[] args) {
        Arvuuttaja arvuuttaja = new Arvuuttaja();

        // Luodaan useita asiakkaita (säikeitä)
        for (int i = 0; i < 5; i++) {
            Thread asiakasThread = new Thread(new Asiakas(arvuuttaja));
            asiakasThread.start();
        }
    }
}