package JavaBasicPrograms;
import java.util.*;
import java.util.Scanner;

public class ques7{
    public static void main(String[] args) {
        System.out.println("Input:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num%2==0) System.out.println("even");
        else System.out.println("odd");
        sc.close();
    }
}