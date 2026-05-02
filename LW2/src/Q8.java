import java.util.Scanner;

public class Q8 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter radius: ");
            double radius = sc.nextDouble();

            double volume = (4.0 / 3) * (Math.PI * Math.pow(radius, 3));

            System.out.println("Volume =  " + volume);
        }

}
