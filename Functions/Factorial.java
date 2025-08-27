package Functions;
import java.util.*;
public class Factorial {
    public static int factorial(int a){
        int f = 1;
        for (int i = 1 ;i<=a ;i++){
            f*=i;
        }
        System.out.println(f);
        return f ; 
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        factorial(n);
        sc.close();
    }
}
