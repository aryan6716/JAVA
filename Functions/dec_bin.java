package Functions;

public class dec_bin {
    public static int decimal(int num ){
            int c = 0;
            int bin = 0;
            while (num>0){
                int r =  num%2 ; 
                bin += r * Math.pow(10,c);
                num/=2;
                c++;
            }
        System.out.print(bin);
        return bin;
    }
    public static void main (String args[]){
        decimal(7);
    }
}


