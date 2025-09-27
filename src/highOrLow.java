
import java.util.Random;
import java.util.Scanner;

public class highOrLow
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random randomNumber = new Random();
        int numValues = 0;
        int newRandomNumber = randomNumber.nextInt(10) + 1;
        boolean done = false;

        do {
            System.out.print("Guess the number between 1 and 10 (inclusive): ");
            // Check if the input is an integer and handle potential non-integer input
            while (!in.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                System.out.print("Guess the number between 1 and 10 (inclusive): ");
                in.next(); // consume the invalid input
            }
            numValues = in.nextInt(); // Read the valid number

            if (numValues < 1 || numValues > 10) {
                System.out.println("Your guess must be between 1 and 10.");
            }
        } while (numValues < 1 || numValues > 10); // Loop until the input is valid

        // 3. Display the random number and compare the guess
        System.out.println("\nThe random number was: " + newRandomNumber);

        if (numValues == newRandomNumber) {
            System.out.println("Congratulations! Your guess was on the money!");
        } else if (numValues < newRandomNumber) {
            System.out.println("Your guess was too low!");
        } else {
            System.out.println("Your guess was too high!");
            done = true;
            in.close();
        }
    }
}


