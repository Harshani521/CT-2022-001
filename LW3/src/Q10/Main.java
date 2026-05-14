package Q10;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word or phrase: ");
        String text = sc.nextLine();

        String reverse = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reverse = reverse + text.charAt(i);
        }

        if (text.equalsIgnoreCase(reverse))
            System.out.println("It is a palindrome");
        else
            System.out.print("It is not a palindrome");
    }
}
