package JavaClasswork;

import java.util.Scanner;

public class occurance {
    public static void main(String[] args) {
       Scanner sc  = new Scanner(System.in);

       System.out.println("enter number: ");
       long num =sc.nextLong();

       System.out.println("enter digit to check: ");
       int check = sc.nextInt();

       int count = 0;
       while(num>0){
       int rem = (int)num%10;

        if(rem==check) count ++;

        num /=10;
       }

       System.out.println(count);
       sc.close();
    }
}
