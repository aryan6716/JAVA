// price of pencil and pen including 18% of gst 

import java.util.*;
public class q2 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        float pencil = sc.nextFloat(); 
        float pen = sc.nextFloat();
        float total_price = (pencil+pen) + (0.18f * (pencil+pen));    //total price including gst
        System.out.print(total_price);      
        sc.close();
    }
}
