package practice;

import java.util.Scanner;

//Find String Code Generate a numeric code based on ASCII values of characters in the given string. 
// public class sheet3 {
//         public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         int code = 0;
//         for (int i = 0; i < s.length(); i++) {
//             char ch = s.charAt(i);  
//             code = code + (int)ch; 
//         }
//         System.out.println(code);
//     }
// }

//Get Code Through Strings Derive a code using transformation logic applied to the input string. 

//Addition Using Strings Add large numbers provided as strings without converting directly to integers. 

//Simple Encoded Array Decode or encode elements in an array based on a given rule

//Decreasing Sequence Check or generate a sequence where each element is smaller than the previous one. 
// public class sheet3 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         boolean b = true;
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         for (int i = 0 ; i < n - 1; i++) {
//             if (arr[i] < arr[i + 1]){
//                 b = false;
//                 break;
//         }
//     }
//         System.out.println(b);
//     }
// }

//Most Frequently Occurring Digit Identify the digit that appears most often in the array elements. 

//Sum of Powers of Digits Calculate the sum of digits each raised to a specific power. 
// public class sheet3 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int p = sc.nextInt();
//         int sum = 0;
//         num = Math.abs(num);
//         while (num > 0) {
//             int d = num % 10;
//             sum += (int)Math.pow(d, p);   // FIXED
//             num /= 10;
//         }
//         System.out.println(sum);
//     }
// }

//Sum of Sums of Digits in Cyclic Order Compute sums of digits for cyclic permutations of a number
// public class sheet3 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int sum = 0 ;
//         int temp = num;
//         while(num>0){
//             sum += num%10;
//             num/=10;
//         }
//         System.out.println(sum* ((int)Math.log10(Math.abs(temp))+1));
//     }
// }


//calclte sum of non prime index
// public class sheet3 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sum = 0;
//         int arr[] = new int[n];
//         boolean b = true;
//         for (int i = 0; i < n; i++) {
//             int x = sc.nextInt();
//             if(i != 2 && i != 3 && i != 5 && i != 7 && i != 11 && i != 13 && i != 17 && i != 19 && i != 23) sum+=x;
//         }
//          System.out.println(sum);
//     }
// }

//The “Nambiar Number” Generator 