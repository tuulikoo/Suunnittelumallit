package Memento_old;
import java.util.Random;
import java.util.Set;
import java.util.HashSet;

class Asiakas implements Runnable {
    private final Arvuuttaja arvuuttaja;
    private int arvaukset;
    private Set<Integer> arvatutNumerot;

    public Asiakas(Arvuuttaja arvuuttaja) {
        this.arvuuttaja = arvuuttaja;
        this.arvatutNumerot = new HashSet<>();
    }

    @Override
    public void run() {
        Memento memento = arvuuttaja.liityPeliin();
        String säie = Thread.currentThread().getName();
        
        while (true) {
            int arvaus;
            do {
                arvaus = new Random().nextInt(50); 
            } while (arvatutNumerot.contains(arvaus));

            arvatutNumerot.add(arvaus);
            arvaukset++;
            
            System.out.println("Säie " + säie + " arvasi " + arvaukset + ". kerralla: " + arvaus);
            if (arvuuttaja.arvaus(memento, arvaus)) {
                System.out.println("Säie " + säie + " teki oikean arvauksen " + arvaus+ "!");
                break;
            }
        }
    }
}
