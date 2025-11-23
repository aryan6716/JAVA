package strings;

import java.util.*;

public class palindrome {
    public static boolean check(String str) {
        String new_str = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            new_str += str.charAt(i);
        }
        if (new_str.equals(str)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(check(str));
        sc.close();
    }

}
