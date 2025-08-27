package Recursion;

public class sumUptoN {
    public static int calculateSum(int n){
        if(n==0){ //base case
            return 0;
        }
        int sum  = n + calculateSum(n-1);  //recursive call
        return sum;
   
       // or   return (n == 0) ? 0 : n + calculateSum(n-1);

       // direct formula => sum = n * (n + 1) / 2
    }

    public static void main(String args[]){  //main function
        int n = 5;
        System.out.print(calculateSum(n));
    }
}
