import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int maxAttempts = 5;
        int rangeStart = 1;
        int rangeEnd = 100;
        int numberToGuess = random.nextInt(rangeEnd - rangeStart + 1) + rangeStart;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between " + rangeStart + " and " + rangeEnd);
        System.out.println("You have " + maxAttempts + " attempts to guess the number.");

        for (int i = 1; i <= maxAttempts; i++) {
            System.out.print("Attempt " + i + ": Enter your guess: ");
            int playerGuess = scanner.nextInt();

            if (playerGuess == numberToGuess) {
                System.out.println("Congratulations! You've guessed the right number.");
                return;
            } else if (playerGuess < numberToGuess) {
                System.out.println("Too Low!");
            } else {
                System.out.println("Too High!");
            }
        }

        System.out.println("Sorry, you've used all your attempts. The correct number was " + numberToGuess);
    }
}
