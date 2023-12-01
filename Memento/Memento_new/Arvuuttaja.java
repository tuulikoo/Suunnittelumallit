package Memento_new;
import java.util.Random;

public class Arvuuttaja {
    private final Random random;

    //lisätty memento sisäluokaksi ettei asiakas pääse siihen käsiksi
    private class Memento {
        private final int numero;

        Memento(int numero) {
            this.numero = numero;
        }

        int getNumber() {
            return numero;
        }
    }

    class MementoHolder {
        private final Memento memento;

        MementoHolder(Memento memento) {
            this.memento = memento;
        }

        Memento getMemento() {
            return memento;
        }
    }

    // Konstruktorissa alustetaan satunnaislukugeneraattori
    public Arvuuttaja() {
        random = new Random();
    }

    // Metodi pelaajan liittymiseksi peliin ja Memento-olion saamiseksi, joka sisältää satunnaisesti valitun numeron
        MementoHolder liityPeliin() {
        int arvottuNumero = random.nextInt(50); // satunnainen luku väliltä 0-49
        System.out.println(Thread.currentThread().getName() + " liittyi peliin. Arvuuttaja valitsi luvun: " + arvottuNumero);
        return new MementoHolder(new Memento(arvottuNumero)); // Palautetaan "Memento"-olio valitulla numerolla
        

    }

    // Metodi joka tarkistaa, täsmääkö pelaajan arvaus "Memento"-olion tallennettuun numeroon
    public boolean arvaus(MementoHolder mementoHolder, int arvaus) {
        int arvottu = mementoHolder.getMemento().getNumber(); // Haetaan Mementosta tallennettu numero
        System.out.println(Thread.currentThread().getName() + " arvaa: " + arvaus);

        if (arvaus == arvottu) {
            System.out.println("Oikea arvaus!");
            System.out.println(Thread.currentThread().getName() + " teki oikean arvauksen!");
            return true; // Arvaus on oikein
        } else {
            System.out.println(Thread.currentThread().getName() + " teki väärän arvauksen. Yritä uudelleen.");
            return false; // Arvaus on väärin
        }
    }
}