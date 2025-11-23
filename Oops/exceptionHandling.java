package Oops;

public class exceptionHandling {
    public static void main(String[] args) {
        int a = 10, b = 0, c;
        try {
            c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Program continues...");
    }
}
// java.lang.ArithmeticException: / by zero
