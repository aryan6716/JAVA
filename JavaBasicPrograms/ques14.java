package JavaBasicPrograms;
import java.util.Scanner;
public class ques14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = (int)Math.log10(num) + 1;
        int sum=0; int temp = num;
        while(num>0){
            sum += Math.pow(num%10, count);
            num/=10;
        }
        if(sum==temp) System.out.println("armstrong");
        else System.out.println("not armstrong");
    }
}
