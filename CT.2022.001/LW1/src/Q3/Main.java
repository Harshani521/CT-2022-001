package Q3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String firstName = sc.next();

        System.out.print("Enter Middle Name: ");
        String middleName = sc.next();

        System.out.print("Enter Last Name: ");
        String lastName = sc.next();

        System.out.println(firstName + " " + middleName.charAt(0) + ". " + lastName);
    }
}
