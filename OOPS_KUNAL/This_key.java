package OOPS_KUNAL;

public class This_key {
    void show() {
        System.out.println(this); // OOPS_KUNAL.This_key@7ad041f3
    }

    public static void main(String[] args) {
        This_key r = new This_key();
        System.out.println(r); // OOPS_KUNAL.This_key@7ad041f3
        r.show();
    }
}
// "this" keyword : refers the current obj inside method or constructor