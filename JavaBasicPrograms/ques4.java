package JavaBasicPrograms;
import java.util.*;
import java.util.Scanner;

public class ques4{
    public static void main(String[] args) {
        System.out.println("Input:");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int temp = num1; num1=num2; num2=temp;
        System.out.println(num1 + "," + num2);
        sc.close();
    }
}
