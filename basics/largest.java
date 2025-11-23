package basics;
import java.util.Scanner;
public class largest {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        
    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // int c = sc.nextInt();

    //int max = a;
    // if(b>max) max = b;
    // if(c>max) max = c;
    // System.out.println(max);

//or
    // System.out.println(Math.max(a,Math.max(b,c)));

//or
    System.out.println(Math.max(sc.nextInt(),Math.max(sc.nextInt(),sc.nextInt())));
    }
}
