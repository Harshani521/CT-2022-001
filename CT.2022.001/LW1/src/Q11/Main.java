package Q11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full name: ");
        String first = sc.next();
        String middle = sc.next();
        String last = sc.next();

        System.out.println(last + ", " + first + " " + middle.charAt(0) + ".");

    }
}

