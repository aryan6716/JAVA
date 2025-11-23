package JavaBasicPrograms;
import java.util.Scanner;;
public class ques17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum = 0;
    for(int i=0;i<=n;i++)sum+=i;  // or System.out.println(n * (n + 1) / 2)
    System.out.println(sum);
    
sc.close();
    }
}
