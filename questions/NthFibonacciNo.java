package JAVA.questions;
import java.util.Scanner;
public class NthFibonacciNo {
        public static void fibonacciAt(int num){
            int a = 0; int b = 1;  int c = 0;
            
            for(int i=1;i<=10;i++){
                System.out.print(a+",");
                c = a+b; a = b;  b = c ;
            }
        }
        public static void main(String[] args){
        System.out.print("Enter Num:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibonacciAt(n);
        sc.close();
    }
}
