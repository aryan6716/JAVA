package lec;
import java.util.Scanner;

// print upto n
// public class abc2 {
//     public static void main(String[] args) {
//         System.out.println("Enter N:");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();


    //    for(int i=1;i<=n;i++){
    //     System.out.println(i);
    //    }

    // int i=1;
    // while(i<=n){
    //     System.out.println(i);
    //     i++;
    // }

//     int i=1;
//     do{
//             System.out.println(i);
//             i++;
//         }
//         while(i<=n);
//     }
// }


//print even odd
// public class abc2 {
//     public static void main(String[] args) {
//         System.out.println("Enter N:");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//        System.out.print("even:");
//        for(int i=1;i<=n;i++){
//             if(i%2==0) System.out.print(i+",");
//        }
// System.out.println();
//        System.out.print("odd:");
//        for(int i=1;i<=n;i++){
//             if(i%2==1) System.out.print(i+",");
//        }
//     } 
// }

//sum upto n
// public class abc2{
//     public static void main(String[] args) {
//         System.out.print("Enter N:");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//     int sum = 0;
//        for(int i=1;i<=n;i++){
//         sum+=i;
//        }
//        System.out.print(sum);
//     }
// }


//public class abc2{ 
//         public static int factorial(int num){
//             int f=1;
//             for(int i=1;i<=num;i++){
//                 f*=i;
//             }
//             System.out.print(f);
//             return f;
//         }
//         public static void main(String[] args){
//         System.out.print("Enter N:");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         factorial(n);
//     }
// }


// table
// public class abc2{ 
//         public static void table(int num){
//             for(int i=1;i<=10;i++){
//                 System.out.println(num+"*"+i+"="+num*i);
//             }
//         }
//         public static void main(String[] args){
//         System.out.print("Enter Num:");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         table(n);
//         sc.close();
//     }
// }


//fibonacci series
// public class abc2{ 
//         public static void fibonacci(int num){
//             int a = 0;
//             int b = 1;
//             int c = 0;
//             for(int i=1;i<=10;i++){
//                 System.out.print(a+",");
//                 c = a+b;
//                 a = b;
//                 b = c ;
//             }
//         }
//         public static void main(String[] args){
//         System.out.print("Enter Num:");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         fibonacci(n);
//         sc.close();
//     }
// }


// reverse num
// public class abc2{ 
//         public static void reverseNum(int num){
//             int reverse = 0;
//             int temp = num;
//             while(num>0){
//             reverse = reverse*10 + num%10;
//             num/=10;
//             }
//             System.out.println(reverse);
//         }
//         public static void main(String[] args){
//         System.out.print("Enter Number:");
//         Scanner sc = new Scanner(System.in);
//         int number = sc.nextInt();
//         reverseNum(number);
//         sc.close();
//     }
// }


//palindrome
// public class abc2{ 
//         public static void reverseNum(int num){
//             int reverse = 0;
//             int temp = num;
//             while(num>0){
//             reverse = reverse*10 + num%10;
//             num/=10;
//             }
//             if(reverse==temp) System.out.println("Palindrome");
//             else System.out.println("Not Palindrome");
//         }
//         public static void main(String[] args){
//         System.out.print("Enter Number:");
//         Scanner sc = new Scanner(System.in);
//         int number = sc.nextInt();
//         reverseNum(number);
//         sc.close();
//     }
// }


