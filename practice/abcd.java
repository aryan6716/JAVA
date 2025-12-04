package practice;

import java.util.Scanner;

public class abcd {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int inp = x.nextInt();
        inp = Math.abs(inp);
        System.out.println( inp>10 ? Math.abs(inp/10)%10 : -1);
    }
}



// public class sheet2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//     }
// }
