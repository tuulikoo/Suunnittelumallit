package Memento_new;
import java.util.Random;
import java.util.Set;
import java.util.HashSet;

// Asiakas-luokka toteuttaa Runnable-rajapinnan ja edustaa pelaajaa
class Asiakas implements Runnable {
    private final Arvuuttaja arvuuttaja; // Viittaus arvuuttajaan
    private int arvaukset; // Pelaajan tekemien arvausten määrä
    private Set<Integer> arvatutNumerot; // Setti arvattuja numeroita

    // Konstruktorissa asiakas ottaa arvuuttajan parametrina
    public Asiakas(Arvuuttaja arvuuttaja) {
        this.arvuuttaja = arvuuttaja;
        this.arvatutNumerot = new HashSet<>();
    }

    @Override
    public void run() {
        Arvuuttaja.MementoHolder mementoHolder = arvuuttaja.liityPeliin(); // Liitytään peliin ja saadaan Memento-olio
        String säie = Thread.currentThread().getName(); // Haetaan nykyisen säikeen nimi
        

        while (true) {
            int arvaus;
            do {
                // Laitetaan satunnainen numero arvaukseksi
                arvaus = new Random().nextInt(50);
            } while (arvatutNumerot.contains(arvaus)); // Asiakkaan pitää arvata joka kierroksella sellainen numero, jota hän ei ole vielä arvannut

            arvatutNumerot.add(arvaus); // Lisätään arvaus arvattujen numeroiden joukkoon
            arvaukset++;

            // Tulostetaan arvaus ja säikeen nimi
            System.out.println("Säie " + säie + " arvasi " + arvaukset + ". kerralla: " + arvaus);

            
            if (arvuuttaja.arvaus(mementoHolder, arvaus)) {
                System.out.println("Säie " + säie + " teki oikean arvauksen " + arvaus + "!");
                break; // Poistutaan silmukasta, jos arvaus on oikein
            }
        }
    }
}