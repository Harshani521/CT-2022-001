package Q11;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int num = rand.nextInt(100) + 1;
        int guess;

        System.out.println("Guess a number between 1 and 100");

        do {

            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if (guess > num)
                System.out.println("Lower");
            else if (guess < num)
                System.out.println("Higher");
            else
                System.out.println("Correct! You guessed the number.");

        } while (guess != num);
    }
}
