package bitManipulataion;
import java.util.*;
public class update_ith_bit {
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         System.out.print("enter number: ");
         int num = sc.nextInt();
         System.out.print("enter the ith bit: ");
         int i = sc.nextInt();
         System.out.print("enter the new ith bit: ");
         int newBit = sc.nextInt();

         if (newBit==0){
           System.out.print(num & (~(1<<i)));   //clear
         }else{
           System.out.print(num | (1<<i));  //set
         }
    sc.close();
    }
}
