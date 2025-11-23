package strings;

public class comparing {
    public static void main(String args[]) {
        String a = "aryan";
        String b = "aryan";
        String c = new String("aryan");
        // equal bcz
        if (a == b) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
        // unequal bcz when we declare string with new it will create new string at
        // another location
        if (a == c) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}
