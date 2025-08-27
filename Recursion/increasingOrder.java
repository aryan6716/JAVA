
package Recursion;

public class increasingOrder {
    public static void increasing(int n){   //recursive function
        if(n==1){  //base case
          System.out.print(n + " ");
          return;  
        }
        increasing(n-1);   //calling inner function
        System.out.print(n + " "); 
    }
    public static void main(String args[]){  //main function
        int n = 10;
        increasing(n);
    }
}
