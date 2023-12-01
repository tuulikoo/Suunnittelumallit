import java.util.Random;

public class Football extends Game {
    private int team1Goals;
    private int team2Goals;
    private int maxGoals;

    @Override
    void initializeGame() {
        System.out.println("Jalkapallo-ottelu alkaa!");
        maxGoals = (int) (Math.random() * 16); // Valitaan maalien määrä väliltä 0-15
        System.out.println("Maaleja pelissä: " + maxGoals);
    }

    @Override
    void makePlay(int player) {
        // Simulate a goal being scored for each team
        int team1GoalScored = (int) (Math.random() * 2); // 0 or 1
        int team2GoalScored = (int) (Math.random() * 2); // 0 or 1

        if (team1GoalScored == 1) {
            System.out.println("Barcelona teki maalin!");
            team1Goals++;
        }

        if (team2GoalScored == 1) {
            System.out.println("Real Madrid teki maalin!");
            team2Goals++;
        }
    }

  

    @Override
    boolean endOfGame() {
        return team1Goals+team2Goals >= maxGoals ;
    }

    @Override
    void printWinner() {
        if (team1Goals > team2Goals) {
            System.out.println("Barcelona voitti pelin " + team1Goals + " maalilla!");
        } else if (team2Goals > team1Goals) {
            System.out.println("Real Madrid voitti pelin " + team2Goals + " maalilla!");
        } else {
            System.out.println("Tasapeli, kumpikin teki: " + team1Goals + " maalia!");
        }
    }
}