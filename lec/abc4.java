package lec;
import java.util.Scanner;

//print natural
// public class abc4 {
//     public static void printNatural(int num){
//         int i = 1;
//         while(num!=i){
//             System.out.print(i+",");
//             i++;
//         }
//     }
//     public static void main(String[] args) {
//         System.err.println(("enter number:"));
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        printNatural(n);
//        sc.close();
//     }
// }


//print reverse natural
// public class abc4 {
//     public static void printNatural(int num){
//         for(int i = num;i>0;i--){
//             System.out.print(i+",");
//         }
//     }
//     public static void main(String[] args) {
//         System.err.println(("enter number:"));
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        printNatural(n);
//        sc.close();
//     }
// }


//print alphabet
// public class abc4 {
//     public static void main(String[] args) {
//         System.err.println(("all alphabets are as follows:"));
//         char c = 'a' ;
//         while(c <='z'){
//             System.out.print(c+",");
//             c++;
//         }
//     }
// }


//print even
// public class abc4 {
//     public static void main(String[] args) {
//         System.out.println("even numbers are as follows:");
//         int i = 2 ;
//         while(i <=100){
//                 System.out.println(i);
//                 i+=2; 
//         }
//     }
// }


//print odd
// public class abc4 {
//     public static void main(String[] args) {
//         System.out.println("even numbers are as follows:");
//         int i = 1 ;
//         while(i <=100){
//             if(i%2==1){
//                 System.out.print(i+",");  
//             }  
//              i++;    
//         }
//     }
// }


//sum upto n
// public class abc4 {
//     public static void sumUptoN(int num){
//         int sum = 0;
//         int i=1;
//         while(num>=i){
//             sum+=i;
//             i++;  
//         }
//          System.out.print("sum:"+sum);
//     }
//     public static void main(String[] args) {
//         System.err.println(("enter number:"));
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        sumUptoN(n);
//        sc.close();
//     }
// }


//sum upto n even
// public class abc4 {
//     public static void sumUptoN(int num){
//         int sum = 0;
//         for(int i=0;i<=num;i+=2){
//             sum+=i;
//         }
//          System.out.print("sum:"+sum);
//     }
//     public static void main(String[] args) {
//         System.err.println(("enter number:"));
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        sumUptoN(n);
//        sc.close();
//     }
// }


//sum upto n odd
// public class abc4 {
//     public static void sumUptoN(int num){
//         int sum = 0;
//         for(int i=0;i<=num;i++){
//             if(i%2==1) sum+=i;
//         }
//          System.out.print("sum:"+sum);
//     }
//     public static void main(String[] args) {
//         System.err.println(("enter number:"));
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        sumUptoN(n);
//        sc.close();
//     }
// }


//table
// public class abc4 {
//     public static void table(int num){
//         for(int i=1;i<=10;i++){
//          System.out.println(num + " * " + i + " = " + num*i);
//         }  
//     }
//     public static void main(String[] args) {
//         System.err.println(("enter number:"));
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        table(n);
//        sc.close();
//     }
// }


 //count no of digits in a number
// public class abc4 {
//     public static void totalCount(int num){
//         int count = 0 ;
//         int temp = num;
//         while(num>0){
//             count++;
//             num/=10;
//         } 
//          System.out.println("total count:"+count);
//     }
//     public static void main(String[] args) {
//         System.out.println(("enter number:"));
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        totalCount(n);
//        sc.close();
//     }
// }


//first and last digit of number
public class abc4 {
    public static void digits(int num){
        int temp = num;

        while(num>0){
              
        } 
    }
    public static void main(String[] args) {
        System.out.println(("enter number:"));
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       digits(n);
       sc.close();
    }
}