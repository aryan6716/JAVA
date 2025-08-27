package bitManipulataion;
import java.util.*;
public class clear_rangeOf_bits {
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         System.out.print("enter number: ");
         int num = sc.nextInt();
         System.out.print("enter the i-th bit: ");
         int i = sc.nextInt();
         System.out.print("enter the j-th bit: ");
         int j = sc.nextInt();
         int a = (-1<<(j+1)) ;
         int b = ((1<<i)-1);
         int c = a|b;
          System.out.print(num & c); 
         
    sc.close();
    }
}
