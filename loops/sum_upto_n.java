package loops;
import java.util.*;
public class sum_upto_n {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
    int a = 1;
    int sum = 0 ;
    while(a<=n){
        sum+=a;
        a++;
    }
    System.out.print(sum);
    sc.close();
    }
}
