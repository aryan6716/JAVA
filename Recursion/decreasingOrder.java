package Recursion;

public class decreasingOrder {
    public static void decreasing(int n){   //recursive function
        if(n==1){  //base case
          System.out.print(n + " ");
          return;  
        }
        System.out.print(n + " ");
        decreasing(n-1);   //calling inner function
    }
    public static void main(String args[]){  //main function
        int n = 10;
        decreasing(n);
    }
}
