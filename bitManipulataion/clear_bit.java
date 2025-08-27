package bitManipulataion;
import java.util.*;
public class clear_bit {
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         System.out.print("enter number: ");
         int num = sc.nextInt();
         System.out.print("enter the clear bit: ");
         int i = sc.nextInt();
           System.out.print(num & (~(1<<i)) ); 
    sc.close();
    }
}
