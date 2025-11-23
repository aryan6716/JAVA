package loops;
import java.util.Scanner;
public class gcd {
     public static void GCD(int num1, int num2) {
        int gcd=1;
        int smaller = Math.min(num1, num2) ;
        for(int i=smaller;i>=1;i--){
            if(num1%i==0 && num2%i==0) {
                gcd=i;
                break;
            }
        }
        System.out.println("GCD is: " + gcd);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number1: ");
        int num1 = sc.nextInt();

        System.out.println("Enter number2: ");
        int num2 = sc.nextInt();
        sc.close();

        GCD(num1,num2);
    }
}
