package Q8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        int index = sentence.indexOf("!");

        String part1 = sentence.substring(0, index);
        String part2 = sentence.substring(index + 1);
        part2 = part2.replace(",", "");
        System.out.println(part1.trim());
        System.out.println(part2.trim());
    }
}
