/*
Question 2 :
You are given a number (eg - 2019), convert it into a String of english like
“two zero one nine”. Use a recursive function to solve this problem.
NOTE - The digits of the number will only be in the range 0-9 and the last digit of a number
can’t be 0.
Sample Input : 1947
Sample Output : “one nine four seven”
 */

package Recursion;

public class ques2 {
    public static void printString(int n){
        String digits[] = {"zero", "one", "two", "three", "four", "five", "six",
                                "seven", "eight", "nine"};
          if(n==0) {
            return;
        }
          printString(n/10);
          System.out.print(digits[n%10] + " ");
    }

        public static void main(String[] args) {
        int n = 1947;
        printString(n);
        System.out.println();
    }}
/*

The function is called with n = 1947:
1947 % 10 = 7 (last digit)
Calls printString(1947 / 10) → printString(194)
The function is now processing n = 194:
194 % 10 = 4
Calls printString(194 / 10) → printString(19)
Now with n = 19:
19 % 10 = 9
Calls printString(19 / 10) → printString(1)
Finally, n = 1:
1 % 10 = 1
Calls printString(1 / 10) → printString(0)
Base Case Reached (n = 0):
The function stops execution.

Returning Step-by-Step (Printing starts now!):
printString(1) → prints "one "
printString(19) → prints "nine "
printString(194) → prints "four "
printString(1947) → prints "seven "
 
 */