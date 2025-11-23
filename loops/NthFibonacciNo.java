package loops;

import java.util.Scanner;

public class NthFibonacciNo {
    public static void fibonacciAt(int num) {
        int a = 0;
        int b = 1;
        int c = 0;

        System.out.print("\nFibonacci series: ");
        for (int i = 0; i < num; i++) {
            System.out.print(a + ",");
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println("\n");
        System.out.println(num + "th Fibonacci number is: " + a);
    }

    public static void main(String[] args) {
        System.out.print("Enter Num:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibonacciAt(n);
        sc.close();
    }
}
