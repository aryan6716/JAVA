//leap  year

import java.util.*;
public class q4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if ( (year%400==0) || (year%100!=0 && year%4==0)){
            System.out.print("LEAP YEAR");
        }
        else {
            System.out.print("NOT LEAP,YEAR");
        }
        sc.close();
    }
}
