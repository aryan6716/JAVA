package Functions;
import java.util.*;
public class product {
    public static int multiply(int num1 , int num2){
        int product = num1 * num2;
        System.out.print(product);
        return product;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        multiply(a,b);
        sc.close();
    }
}






// package Functions;
// public class product1 {
//     public static int multiply(int num1 , int num2){
//         int product = num1 * num2;
//         System.out.println(product);
//         return product;
//     }
//     public static void main (String args[]){
//         multiply(10,20);
//         multiply(1,2);
//     }
// }
