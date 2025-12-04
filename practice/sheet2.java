package practice;

import java.util.*;

//palindrome ;  
// public class sheet2 {
//     public static boolean checkPalindrome(int num) {
//         int temp = num, sum = 0;
//         while (num > 0) {
//             sum = num % 10 + sum * 10;
//             num /= 10;
//         }
//         return sum == temp;
//     }

//     public static void main(String[] args) {
//         System.out.println(checkPalindrome(Math.abs(new Scanner(System.in).nextInt())));
//     }
// }

// Is Palindrome Possible?
// public class sheet2 {
//     public static boolean PalindromePossible(int arr[]) {
//         boolean[] used = new boolean[arr.length];
//         int odd = 0;
//         for (int i = 0; i < arr.length; i++) {
//             if (used[i]) continue;
//             int count = 0;
//             for (int j = i; j < arr.length; j++) {
//                 if (arr[i] == arr[j]){
//                     count++;
//                     used[j] = true;   
//             }
//         }
//             if (count % 2 == 1){
//                 odd++;
//             }
//         }
//         return odd <= 1;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         char[] ch = String.valueOf(n).toCharArray();
//         int[] arr = new int[ch.length];

//         for (int i = 0; i < ch.length; i++) {
//             arr[i] = ch[i] - '0';
//         }
//         System.out.println(PalindromePossible(arr));
//     }
// }

//Create PIN Using Alpha, Beta, gamma
// public class sheet2 {
//     public static int lastDigitLeast(int alpha, int beta, int gamma) {
//         int a = alpha % 10;
//         int b = beta % 10;
//         int c = gamma % 10;
//         return Math.min(a, Math.min(b, c));
//     }

//     public static int middleDigitLeast(int alpha, int beta, int gamma) {
//         int a = (alpha / 10) % 10;
//         int b = (beta / 10) % 10;
//         int c = (gamma / 10) % 10;
//         return Math.min(a, Math.min(b, c));
//     }

//     public static int firstDigitLeast(int alpha, int beta, int gamma) {
//         int a = (alpha / 100) % 10;
//         int b = (beta / 100) % 10;
//         int c = (gamma / 100) % 10;
//         return Math.min(a, Math.min(b, c));
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int alpha = sc.nextInt(), beta = sc.nextInt(), gamma = sc.nextInt();
//         int last = lastDigitLeast(alpha, beta, gamma);
//         int middle = middleDigitLeast(alpha, beta, gamma);
//         int first = firstDigitLeast(alpha, beta, gamma);
//         System.out.println(""+first + middle + last);

//     }
// }

//Weight of a Hill Pattern
// public class sheet2 {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int weight = 0;
//         for(int i = 1 ; i < n+1 ; i++){
//             weight+=(i*i);
//         }
//         System.out.println(weight);
//     }
// }

//Return Second Word in Uppercase
// public class sheet2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String sentence = sc.nextLine();
//         String words[] = sentence.split(" ");

//         System.out.println(words.length < 2 ? "No second word" : words[1].toUpperCase());
//     }
// }

//Is Palindrome (String) 
// public class sheet2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str1 = sc.next();
//         String str2 = new StringBuilder(str1).reverse().toString();
//         System.out.println((str1.equals(str2)));
//     }
// }

//Weight of String Calculate the weight of a string based on character values. 
// public class sheet2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.next().toLowerCase();
//         int weight = 0;
//         for (int i = 0; i < s.length(); i++) {
//             char ch = s.charAt(i);
//             weight += (ch - 'a' + 1); 
//         }
//         System.out.println(weight);
//     }
// }

//Most Frequent Digit Find the most frequently occurring digit in the given number. 
// public class sheet2 {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = Math.abs(sc.nextInt());

//         String s = String.valueOf(n);
//         int[] arr = new int[s.length()];
//         for(int i = 0; i < s.length(); i++)
//             arr[i] = s.charAt(i) - '0';

//         int maxDigit = arr[0];
//         int maxCount = 1;

//         for(int i = 0; i < arr.length; i++){
//             int count = 0;
//             for(int j = 0; j < arr.length; j++){
//                 if(arr[i] == arr[j])
//                     count++;
//             }
//             if(count > maxCount){
//                 maxCount = count;
//                 maxDigit = arr[i];
//             }
//         }
//         System.out.println(maxDigit);
//     }
// }


