package Q7;

import javax.swing.JFrame;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Date now = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");

        JFrame frame = new JFrame();

        frame.setTitle(sdf.format(now));
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}


