package Recursion;

public class fibonacci_terms {
    public static int fib(int n){
        if(n==0 || n==1){  // base case
            return n;
        }
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fn = fnm1 + fnm2;
        return fn;
        
    // or
    // if(n == 0 || n == 1) return n;
    // return fib(n-1) + fib(n-2);

    }
    public static void main(String args[]){
        int n = 5;
        System.out.print(fib(n));
    }
}
