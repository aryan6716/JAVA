package Recursion;

public class Factorial {
    public static int factorial(int n){
        if(n==0){ //base case
            return 1;
        }
        int f  = n * factorial(n-1);  //recursive call
        return f;
   
    //   or  return (n == 0) ? 1 : n * factorial(n - 1);

    }

    public static void main(String args[]){  //main function
        int n = 5;
        System.out.print(factorial(n));
    }
}



