package Q7;
import java.util.Scanner;

public class Main {
    public static int countDigits(int number) {

        number = Math.abs(number);

        if (number == 0) {
            return 1;
        }

        int count = 0;

        while (number > 0) {
            number = number / 10;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;

        while (true) {

            System.out.print("Enter an integer: ");
            num = input.nextInt();

            if (num < 0)
                break;

            System.out.print("Number of digits: " + countDigits(num));
        }

        System.out.println("Program terminated.");
    }
}
