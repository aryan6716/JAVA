package Functions;
public class binomial_coefficient {

    public static int factorial(int a){
        int f = 1;
        for (int i = 1 ;i<=a ;i++){
            f*=i;
        }
        return f ; 
    }

    public static int binomial(int n , int r){
        int nf = factorial(n);
        int rf = factorial(r);
        int nmr = factorial(n-r);
        int ncr = nf/(rf * nmr);
        System.out.print(ncr);
        return ncr;
    }

    public static void main(String args[]){
        binomial(5,2);
    }
}
