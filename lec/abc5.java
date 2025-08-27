package lec;
import java.util.Scanner;

// prime check
// public class abc5 {
//     public static void isPrime(int num){
//         int count = 0;
//         for(int i=1;i<=num;i++){
//             if(num%i==0) count++;
//         }
//         if(count==2) System.out.println("Prime Number");
//         else System.out.println("Not Prime Number");
//     }
//         public static void main(String[] args) {
//         System.out.print("Enter number:");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         sc.close();
//         isPrime(n);
//     }
// }


// armstrong check
// public class abc5 {
//     public static void isArmstrong(int num){
//         int temp = num;
//         int sum = 0;
//         int count = (int)Math.log10(num)+1;
//         while(num>0){
//             int rem = num%10;
//             sum += (int)Math.pow(rem,count);
//             num/=10;
//         }
//         if(sum==temp) System.out.println("Armstrong Number");
//         else System.out.println("Not Armstrong Number");
//     }
//         public static void main(String[] args) {
//         System.out.print("Enter number:");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         sc.close();
//         isArmstrong(n);
//     }
//}


//Palindrome check
// public class abc5 {
//     public static void isPalindrome(int num){
//         int temp = num;
//         int reverse = 0;
//         while(num>0){
//             reverse = reverse*10 + num%10;
//             num/=10;
//         }
//         if(reverse==temp) System.out.println("Palindrome Number");
//         else System.out.println("Not Palindrome Number");
//     }
//         public static void main(String[] args) {
//         System.out.print("Enter number:");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         sc.close();
//         isPalindrome(n);
//     }
// }


//Fibonaci series
// public class abc5 {
//     public static void Fibonaci(int num){
//         int a =0;
//         int b =1;
//         int c = 0;
//         for(int i=0;i<num;i++){
//             System.out.print(a+",");
//             c = a+b;
//             a = b;
//             b = c;
//         }
//     }
//         public static void main(String[] args) {
//         System.out.print("Enter number:");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         sc.close();
//         Fibonaci(n);
//     }
// }