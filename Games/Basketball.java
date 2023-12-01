import java.util.Random;

public class Basketball extends Game {
    private int team1Hoops;
    private int team2Hoops;
    private int maxHoops;
    private int team1Points;
    private int team2Points;
    private int points;


    @Override
    void initializeGame() {
        System.out.println("Koripallo-ottelu alkaa!");
        maxHoops = (int) (Math.random() * 50) + 10; // Valitaan korien määrä väliltä 10-60
        System.out.println("Koreja tulee tässä pelissä: " + maxHoops);
    }

    @Override
    void makePlay(int player) {
        // Korit
        int team1HoopScored = (int) (Math.random() * 2); // 0 or 1
        int team2HoopScored = (int) (Math.random() * 2); // 0 or 1

        if (team1HoopScored == 1) {
            team1Hoops++;
            //random number between 1 and 3 for points
            points = (int) (Math.random() * 3) + 1;
            team1Points += points;
            System.out.println("Utah teki " + points + " pisteen korin!");
        }

        if (team2HoopScored == 1) {
            team2Hoops++;
            points = (int) (Math.random() * 3) + 1;
            team2Points += points;
            System.out.println("Houston teki " + points + " pisteen korin!");
        }
    }

  

    @Override
    boolean endOfGame() {
        return team1Hoops+team2Hoops >= maxHoops ;
    }

    @Override
    void printWinner() {
        if (team1Points > team2Points) {
            System.out.println("Utah voitti pelin " + team1Points + " pisteellä ja " + team1Hoops + " korilla!");
        } else if (team2Points > team1Points) {
            System.out.println("Houston voitti pelin " + team2Points + " pisteellä ja " + team2Hoops + " korilla!");
        } else {
            System.out.println("Tasapeli, kumpikin teki: " + team1Points + " pistettä!");
        }
    }
}