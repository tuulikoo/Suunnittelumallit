package clock;
import java.util.Observable;
import java.util.Observer;

public class DigitalClock implements Observer {

    //API:This method is called whenever the observed object is changed. An application calls an Observable object's notifyObservers method to have all the object's observers notified of the change.
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof ClockTimer) {
            ClockTimer clockTimer = (ClockTimer) o;
            draw(clockTimer.getHour(), clockTimer.getMinute(), clockTimer.getSecond());
        }
    }

    private void draw(int hour, int minute, int second) {
        // Näytä aika
        String formattedTime = String.format("%02d:%02d:%02d", hour, minute, second);
        System.out.println("Digital Clock: " + formattedTime);
    }
}
