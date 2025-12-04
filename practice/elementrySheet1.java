package practice;

import java.util.*;

// import OOPS_2.static_keyword;

// Section A
//ques 1 and 2 even and odd
// public class elementrySheet1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         System.out.println( a%2==0 ? "even" : "odd");
//     }
// }

//ques 3 last digit
// public class elementrySheet1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         System.out.println( Math.abs(num%10));
//     }
// }

//ques 3 second last digit
// public class elementrySheet1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int input = sc.nextInt();
//         input = Math.abs(input);
//         System.out.println( (input>10) ?  Math.abs(input/10)%10 : -1);
//     }
// }

//ques 4  sum of last two digit of two numbers
// public class elementrySheet1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         num = Math.abs(num);
//         int c = 0;
//         int sum = 0;
//         if (num >= 10) {
//             while (c < 2) {
//                 sum += num % 10;
//                 c++;
//                 num /= 10;
//             }
//             System.out.println(sum);
//         }
//         else {
//             System.out.println(-1);
//         }
//     }
// }

//ques 5 Is N an Exact Multiple of M? 
// public class elementrySheet1 {
//     public static boolean check(int num , int n){
//         num = Math.abs(num);
//         return num % n == 0;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int n = sc.nextInt();
//         System.out.println(check(Math.abs(num) ,Math.abs(n)));
//     }
// }
//or
// public class elementrySheet1 {
//     public static boolean check(int a,int b){ return a % b == 0; }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println(check(Math.abs(sc.nextInt()), Math.abs(sc.nextInt())));
//     }
// }

//ques 6 Of Given 5 Numbers, How Many Are Even? 
// public class elementrySheet1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int even = 0 , odd = 0;
//         System.out.println("Enter 5 numbers:");
//         for (int i = 0; i < 5; i++) {
//             if (sc.nextInt() % 2 == 0) even++;
//             else odd++;
//         }
//         System.out.println("Number of even numbers: " + even);
//         System.out.println("Number of even numbers: " + odd);
//     }
// }

//Section B

//ques 1 prime check
// public class elementrySheet1 {
//     public static boolean check(int num) {
//         if (num < 2) return false;
//         for (int i = 2; i <= Math.sqrt(num); i++) {
//             if (num % i == 0)
//                 return false;
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         System.out.println(check( Math.abs(sc.nextInt())));
//     }
// }

// ques 2 Number of Primes in a Specified Range
// public class elementrySheet1 {
//     public static void Prime(int L, int R) {
//         for (int i = L; i < R; i++) {
//             int c = 0;
//             if (i < 2) continue;
//             for (int j = 2; j <= Math.sqrt(i); j++) {
//                 if (i % j == 0) c++;
//             }
//             if (c == 0) System.out.print(i + " ");
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter range (L R): \n");
//         Prime(sc.nextInt(), sc.nextInt());
//     }
// }

// ques 3 Count of All Digits in a Number
// public class elementrySheet1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println( (int)(Math.log10(Math.abs(sc.nextInt()))) + 1);
//     }
// }

// ques 4 digitSum Even: Sum of Even Digits Only
// public class elementrySheet1 {
//     public static void count(int num) {
//         int c = 0, sum = 0, evenSum = 0, oddSum = 0;
//         while (num > 0) {
//             int rem = num % 10;
//             if (rem % 2 == 0)
//                 evenSum += rem;
//             else if (rem % 2 == 1)
//                 oddSum += rem;
//             sum += rem;
//             num /= 10;
//         }
//         System.out.println("sum of digits : " + sum);
//         System.out.println("sum of even digits : " + evenSum);
//         System.out.println("sum of odd digits : " + oddSum);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         count(Math.abs(sc.nextInt()));
//     }
// }

//ques Nth Prime Number 
// public class elementrySheet1 {
//     public static void Prime(int L, int R) {
//         for (int i = L; i < R; i++) {
//             int c = 0;
//             if (i < 2) continue;
//             for (int j = 2; j <= Math.sqrt(i); j++) {
//                 if (i % j == 0) c++;
//             }
//             if (c == 0) System.out.print(i + " ");
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter range (L R): \n");
//         Prime(sc.nextInt(), sc.nextInt());
//     }
// }

// fibonacci
// public class elementrySheet1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt(), a = 0, b = 1,c = 0;
//         for (int i = 0; i < n; i++) {
//             System.out.print(a + " ");
//             c = a + b;
//             a = b;
//             b = c;
//         }
//         System.out.println("\nNth Fibonacci: " + (b-a));
//     }
// }

