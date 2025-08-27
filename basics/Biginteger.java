package basics;

import java.util.*;
import java.math.BigInteger;

public class Biginteger {

    public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);
 BigInteger a = new BigInteger(sc.nextLine());
 BigInteger b = new BigInteger(sc.nextLine());

       sc.close();
       System.out.println(a.add(b));
       System.out.println(a.multiply(b));
    }
}
