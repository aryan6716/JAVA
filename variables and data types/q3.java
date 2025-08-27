//check if i/p number is +ve -ve zero

import java.util.*;
public class q3 {
    public static void main(String args[]){
       Scanner sc = new Scanner (System.in);
       int a = sc.nextInt();
    if (a>0){
        System.out.print("positive");
    }
    else if (a<0){
        System.out.print("Negative");
    }
    else {
        System.out.print("zero");
    }
sc.close();
    }
}
