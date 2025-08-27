package Functions;

public class bin_dec {
    public static int decimal(int num ){
            int c = 0;
            int sum = 0;
            while (num>0){
                int r = num%10 ; 
                sum += r * Math.pow(2,c);
                num/=10;
                c++;
            }
        System.out.print(sum);
        return sum;
    }
    public static void main (String args[]){
        decimal(101);
    }
}
