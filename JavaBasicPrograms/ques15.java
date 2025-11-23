package JavaBasicPrograms;
import java.util.Scanner;
public class ques15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int square = num * num;
        int sum=0;
        while(square>0){
            sum += square%10;
            square/=10;
        }

       if(sum==num) System.out.println("neon number");
       else System.out.println("Not neon");

       sc.close();
    }
}
