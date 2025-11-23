import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int temp = num;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }
            
            sum += fact;
            temp /= 10;
        }
  System.out.println(sum == num ? " is a Strong Number.":" is not a Strong Number.");

        sc.close();
    }
}
