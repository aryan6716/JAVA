package Functions;
import java.util.*;
public class print_prime {
    public static void checkprime(int n){
        for (int i = 2 ; i<n ; i++){
              int c = 0;
            for (int j = 2 ; j<i ; j++){
                 if (i%j==0){
                c++;
                }
            }  
             if (c==0){
            System.out.println(i);
            }     
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        checkprime(n);
        sc.close();
    }
}
