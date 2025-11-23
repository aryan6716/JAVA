package JavaBasicPrograms;
import java.util.Scanner;
public class ques8 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();
//         int largest = 0;
//         if(a>b && a>c) largest = a;
//         else if(b>a && b>c) largest = b;
//         else largest = c;
//         System.out.println("largest: "+largest);
//         sc.close();
//     }
// }


//or
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Largest: "+Math.max(s.nextInt(),Math.max(s.nextInt(),s.nextInt())));
        s.close();
    }

}

