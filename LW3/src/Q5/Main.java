package Q5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] items = {
                "Tofu Burger", "Cajun Chicken", "Buffalo Wings", "Rainbow Fillet",
                "Rice Cracker", "No-Salt Fries", "Zucchini", "Brown Rice",
                "Cafe Mocha", "Cafe Latte", "Espresso", "Oolong Tea"
        };

        double[] prices = {
                3.49, 4.59, 3.99, 2.99,
                0.79, 0.69, 1.09, 0.59,
                1.99, 1.90, 2.49, 0.99
        };

        int[] quantities = new int[12];

        int choice;

        do {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Entree");
            System.out.println("2. Side Dish");
            System.out.println("3. Drink");
            System.out.println("4. Exit");

            System.out.print("Select Category: ");
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\n--- Entree ---");
                    System.out.println("0. Tofu Burger - $3.49");
                    System.out.println("1. Cajun Chicken - $4.59");
                    System.out.println("2. Buffalo Wings - $3.99");
                    System.out.println("3. Rainbow Fillet - $2.99");

                    System.out.print("Enter item ID: ");
                    int entree = input.nextInt();

                    System.out.print("Enter quantity: ");
                    int qty1 = input.nextInt();

                    quantities[entree] += qty1;
                    break;

                case 2:
                    System.out.println("\n--- Side Dish ---");
                    System.out.println("4. Rice Cracker - $0.79");
                    System.out.println("5. No-Salt Fries - $0.69");
                    System.out.println("6. Zucchini - $1.09");
                    System.out.println("7. Brown Rice - $0.59");

                    System.out.print("Enter item ID: ");
                    int side = input.nextInt();

                    System.out.print("Enter quantity: ");
                    int qty2 = input.nextInt();

                    quantities[side] += qty2;
                    break;

                case 3:
                    System.out.println("\n--- Drink ---");
                    System.out.println("8. Cafe Mocha - $1.99");
                    System.out.println("9. Cafe Latte - $1.90");
                    System.out.println("10. Espresso - $2.49");
                    System.out.println("11. Oolong Tea - $0.99");

                    System.out.print("Enter item ID: ");
                    int drink = input.nextInt();

                    System.out.print("Enter quantity: ");
                    int qty3 = input.nextInt();

                    quantities[drink] += qty3;
                    break;

                case 4:
                    System.out.println("\n===== ORDER SUMMARY =====");

                    double total = 0;

                    for (int i = 0; i < items.length; i++) {

                        if (quantities[i] > 0) {

                            double subtotal = quantities[i] * prices[i];

                            System.out.println(items[i] +
                                    " | Price: $" + prices[i] +
                                    " | Qty: " + quantities[i] +
                                    " | Subtotal: $" + subtotal);

                            total += subtotal;
                        }
                    }

                    System.out.println("Overall Total: $" + total);
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 4);
    }
}
