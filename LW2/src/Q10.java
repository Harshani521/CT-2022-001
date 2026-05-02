import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int months = 12;

        System.out.print("Loan Amount: ");
        double loan = sc.nextDouble();

        System.out.print("Annual Interest Rate: ");
        double rate = sc.nextDouble();

        System.out.print("Years: ");
        int years = sc.nextInt();

        double monthlyRate = rate / 100.0 / months;
        int payments = years * months;

        double monthlyPayment = (loan * monthlyRate) /
                (1 - Math.pow(1 / (1 + monthlyRate), payments));

        double totalPayment = monthlyPayment * payments;

        System.out.println("Monthly Payment = " + monthlyPayment);
        System.out.println("Total Payment = " + totalPayment);
    }
}
