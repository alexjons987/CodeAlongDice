import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int scoreMath = 0;
        int scoreRandom = 0;
        int roundCounter = 1;
        int roundLimit = 7;

        while (roundCounter <= roundLimit) {
            System.out.println("Press Enter to throw dice...");
            scanner.nextLine();

            int diceMath = (int) (Math.random() * 6) + 1;
            int diceRandom = random.nextInt(1, 6 + 1);

            System.out.printf("Round: %d\n", roundCounter);
            System.out.printf("Math dice: %d\n", diceMath);
            System.out.printf("Rand dice: %d\n", diceRandom);

            if (diceMath > diceRandom) {
                System.out.printf("Math wins round %d!\n", roundCounter);
                scoreMath++;
            } else if (diceRandom > diceMath) {
                System.out.printf("Random wins round %d!\n", roundCounter);
                scoreRandom++;
            } else {
                System.out.println("Draw! (Replaying round)");
                continue;
            }
            System.out.printf("Math %d - %d Random\n", scoreMath, scoreRandom);
            roundCounter++;
        }

        System.out.println(); // Newline for pretty console printing

        System.out.println("-Final score-");
        System.out.printf("Math %d - %d Random\n", scoreMath, scoreRandom);
        if (scoreMath > scoreRandom)
            System.out.print("Math wins!\n");
        else if (scoreRandom > scoreMath)
            System.out.print("Random wins!\n");
        else
            System.out.println("Draw!");
    }
}