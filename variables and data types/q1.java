// average of 3 no.

import java.util.*;
public class q1 {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();
       int average = (a+b+c)/3;
       System.out.print("average is :" + average);
       sc.close();
    }
    
}
