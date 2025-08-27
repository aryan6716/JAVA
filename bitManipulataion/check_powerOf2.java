package bitManipulataion;
import java.util.*;
public class check_powerOf2 {
 
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         System.out.print("enter number: ");
         int num = sc.nextInt();
         if ((num & (num-1))==0){
           System.out.print("yes"); 
    }else{
        System.out.print("no");
    }
    sc.close();
    }
}


