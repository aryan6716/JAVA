package bitManipulataion;
import java.util.*;
public class set_ith_bit {
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         System.out.print("enter number: ");
         int num = sc.nextInt();
         System.out.print("enter the set bit: ");
         int i = sc.nextInt();
           System.out.print(num | (1<<i)); 
    sc.close();
    }
}
