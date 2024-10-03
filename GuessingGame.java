import java.util.Scanner;
import java.util.Random;

public class GuessingGame{

    public static void main(String[] args) {
        // Create a Scanner object for user input and a Random object for generating random number
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generate a random number between 1 and 100
        int randomNumber = random.nextInt(100) + 1;
        int guess = 0;
        int attempts = 0;

        System.out.println("Welcome to the Guess the Number Game!");
        System.out.println("I have selected a random number between 1 and 100.");
        System.out.println("Try to guess the number!");

        // Loop until the user guesses the correct number
        while (guess != randomNumber) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number " + randomNumber + " in " + attempts + " attempts.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
