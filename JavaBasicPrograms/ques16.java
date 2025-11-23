package JavaBasicPrograms;
import java.util.Scanner;
public class ques16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        char lc = Character.toLowerCase(c);

    if(lc>='a' && lc<='z'){
        if(lc=='a' || lc=='e' || lc=='i' || lc=='o' || lc=='u'){
            System.out.println("VOWEL");
        }else {
        System.out.println("CONSONENT");
    }
    }else{
        System.out.println("INVALID");
    }

sc.close();
    }
}
