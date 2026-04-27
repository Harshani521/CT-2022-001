package Q10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.next();

        int middle = word.length() / 2;

        System.out.println(word.charAt(middle));

    }
}


