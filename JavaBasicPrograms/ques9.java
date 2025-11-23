package JavaBasicPrograms;
import java.util.Scanner;

public class ques9 {
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int max = Math.max(a,b);
    
    int g = 0;
    for(int i=1 ;i<=max;i++){
        if(a%i==0 && b%i==0)  g=i;
    }
     int lcm = (a*b)/g;
     System.out.println(lcm);
   }
}
