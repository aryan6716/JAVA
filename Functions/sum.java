package Functions;
import java.util.*;
public class sum {
    public static void calculatesum(int num1 , int num2){   //parameters => i/p
        int sum = num1 + num2 ; 
        System.out.print(sum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        calculatesum(a,b);  // a,b => arguments
    sc.close();
  }
}
