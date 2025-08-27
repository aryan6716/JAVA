package bitManipulataion;
import java.util.*;
public class count_setBits {
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         int num = sc.nextInt();
         int count = 0;
         while(num>0){
            if((num & 1)!=0){
                count++;
            }
            num = num>>1;
         }
         sc.close();
    System.out.print(count);
    }  
}
