package strings;
import java.util.Scanner;
public class ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next().toLowerCase();
        String B = sc.next().toLowerCase();
    
        String newStr = A + B;
        System.out.println(newStr);

        System.out.println(A.compareTo(B)>0 ? "yes" : "No");  

        System.out.println(A.substring(0,1).toUpperCase() + " " + B.substring(0,1).toUpperCase());

sc.close();
    }
}
