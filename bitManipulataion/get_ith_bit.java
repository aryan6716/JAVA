package bitManipulataion;
import java.util.*;
public class get_ith_bit {
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         System.out.print("enter number: ");
         int num = sc.nextInt();
         System.out.print("enter the bit: ");
         int i = sc.nextInt();
         if ((num & (1<<i))==0){
           System.out.print("0"); 
         }else{
           System.out.print("1"); 
         }
    sc.close();
    }
}
