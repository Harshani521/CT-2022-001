package Q6;

import javax.swing.JFrame;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter width: ");
        int w = sc.nextInt();
        System.out.print("Enter height: ");
        int h = sc.nextInt();
        System.out.print("Enter title: ");
        String title = sc.next();

        JFrame frame = new JFrame();
        frame.setTitle(title);
        frame.setSize(w, h);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
