package JavaBasicPrograms;
import java.util.Scanner;
public class ques13{ 
        public static void reverseNum(int num){
            int reverse = 0;
            int temp = num;
            while(num>0){
            reverse = reverse*10 + num%10;
            num/=10;
            }
            if(reverse==temp) System.out.println("Palindrome");
            else System.out.println("Not Palindrome");
        }
        public static void main(String[] args){
        System.out.print("Enter Number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        reverseNum(number);
        sc.close();
    }
}
