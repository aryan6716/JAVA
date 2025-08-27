package Functions;
import java.util.*;
public class prime {
    public static void checkprime(int n){
        int c = 0;
        for (int i = 2 ; i<=n-1 ; i++){
            if (n%i==0){
                c++;
            }
        }
        if (c==0){
            System.out.print("prime");
        } 
        else{
            System.out.print("not prime");
        }  
     }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        checkprime(n);
        sc.close();
    }
}
