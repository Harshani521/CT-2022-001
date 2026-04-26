package Q5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Date today = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("EEEE, MMMM dd, yyyy");

        System.out.println(sdf.format(today));
    }
}
