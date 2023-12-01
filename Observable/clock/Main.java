package clock;
public class Main {
    public static void main(String[] args) {
        // Luodaan ajastin
        ClockTimer clockTimer = new ClockTimer();

        // Luodaan digitaalinen kello
        DigitalClock digitalClock = new DigitalClock();

        // lisätään digitaalinen kello tarkkailijaksi
        clockTimer.addObserver(digitalClock);

        // Annetaan ajastimen pyöriä kaksi minuuttia
        int durationInSeconds = 120;
        long endTimeMillis = System.currentTimeMillis() + durationInSeconds * 1000;

        while (System.currentTimeMillis() < endTimeMillis) {
            clockTimer.tick(); // Simulate time passing
            try {
                Thread.sleep(1000); // Sleep 1 sekunti
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
