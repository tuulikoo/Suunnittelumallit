package Memento_old;
import java.util.Random;

public class Arvuuttaja {
    private final Random random;

    public Arvuuttaja() {
        random = new Random();
    }

    public Memento liityPeliin() {
        int arvottuNumero = random.nextInt(50); // Arvotaan luku 0-49 välillä
        System.out.println(Thread.currentThread().getName() + " liittyi peliin. Arvuuttaja valitsi luvun: " + arvottuNumero);
        return new Memento(arvottuNumero);
    }

    public boolean arvaus(Memento memento, int arvaus) {
        int arvattu = memento.getNumber();
        System.out.println(Thread.currentThread().getName() + " arvaa: " + arvaus);

        if (arvaus == arvattu) {
            System.out.println("Oikea arvaus!");
            System.out.println(Thread.currentThread().getName() + " teki oikean arvauksen!");
            return true;
        } else {
            System.out.println(Thread.currentThread().getName() + " teki väärän arvauksen. Yritä uudelleen.");
            return false;
        }
    }
}
