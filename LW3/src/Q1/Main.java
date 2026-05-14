package Q1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        int smallest;

        if (num1 <= num2 && num1 <= num3)
            smallest = num1;
        else if (num2 <= num1 && num2 <= num3)
            smallest = num2;
        else
            smallest = num3;

        System.out.print("Smallest: "+smallest);
    }
}
