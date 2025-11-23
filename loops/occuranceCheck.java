package loops;

import java.math.BigInteger;
import java.util.Scanner;

public class occuranceCheck {
    public static void main(String[] args) {
       Scanner sc  = new Scanner(System.in);

       System.out.println("enter number: ");
       BigInteger num = new BigInteger(sc.nextLine());

       System.out.println("enter digit to check: ");
       int check = sc.nextInt();

       int count = 0;
       while(num.compareTo(BigInteger.ZERO)>0){
       int rem = num.mod(BigInteger.TEN).intValue();

        if(rem==check) count ++;

        num = num.divide(BigInteger.TEN);
       }

       System.out.println(count);
       sc.close();
    }
}


/*
 🔹 Why BigInteger?
In Java, int and long have limits:
int: up to ~2 billion.  long: up to ~9 quintillion
Your number (2234757478967578788656576) is much larger than long can handle.
So we use BigInteger (from java.math) which can store any size integer.
⚡But since it’s not a normal primitive type, you can’t use: +, -, %, /, >
Instead, you must use methods provided by BigInteger.

BigInteger is a class in java.math package.
It is used to represent very large or very small integers that cannot fit in Java’s primitive types (int, long).

👉 For example:
long x = 999999999999999999L; // works
long y = 999999999999999999999999999999L; // ❌ ERROR (too big)
import java.math.BigInteger;
BigInteger big = new BigInteger("999999999999999999999999999999"); // ✅ works fine

-Java provides some constants:
BigInteger.ZERO   // 0
BigInteger.ONE    // 1
BigInteger.TEN    // 10

🔹 Basic Arithmetic Operations

-Since you can’t use + - * / %, you use methods:
BigInteger a = new BigInteger("100");
BigInteger b = new BigInteger("20");

BigInteger sum  = a.add(b);        // 120
BigInteger diff = a.subtract(b);   // 80
BigInteger prod = a.multiply(b);   // 2000
BigInteger div  = a.divide(b);     // 5
BigInteger rem  = a.remainder(b);  // 0

-You can’t use > < == directly. Instead:
BigInteger x = new BigInteger("50");
BigInteger y = new BigInteger("100");
x.equals(y);   // false
x.compareTo(y); // returns -1 (x < y)
y.compareTo(x); // returns 1  (y > x)
x.compareTo(x); // returns 0  (equal)

BigInteger num = new BigInteger("27");
BigInteger mod = num.mod(BigInteger.valueOf(5)); // 27 % 5 = 2
 */