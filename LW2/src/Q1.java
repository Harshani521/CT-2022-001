public class Q1 {
    public static void main(String[] args) {

        double A = 2, B = 3, C = 4;
        double X = 5, Y = 2, r = 3;

        double result1 = Math.sqrt(B * B + 4 * A * C);
        double result2 = Math.sqrt(X + 4 * Math.pow(Y, 3));
        double result3 = Math.cbrt(X * Y);
        double result4 = Math.PI * r * r;

        System.out.println("Result1: " + result1);
        System.out.println("Result2: " + result2);
        System.out.println("Result3: " + result3);
        System.out.println("Result4: " + result4);
    }
}
