package clock;

import java.util.Observable;

public class ClockTimer extends Observable {
    private int hour;
    private int minute;
    private int second;

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void tick() {
        // Lisätään sekunteja
        second++;

        if (second == 60) {
            second = 0;
            minute++;

            if (minute == 60) {
                minute = 0;
                hour++;

                if (hour == 24) {
                    hour = 0;
                }
            }
        }

        // Ilmoitetaan muutoksesta
        //API: Marks this Observable object as having been changed; the hasChanged method will now return true.
        setChanged();

        //API:If this object has changed, as indicated by the hasChanged method, then notify all of its observers and then call the clearChanged method to indicate that this object has no longer changed.
        notifyObservers(); 
        
    }
}
