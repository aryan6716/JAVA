package Oops;

public class var_argsMethod {
    public static void main(String[] args) {
        A r = new A();
        r.add();
        r.add(1);
        r.add(1, 2);
        r.add(1, 2, 3);
    }
}

class A {
    void add(int... a) { // var-args method
        int sum = 0;
        for (int x : a) { // use x, not a
            sum += x;
        }
        System.out.println("Sum: " + sum);
    }
}

// | You write | Java internally converts to |
// | -------------- | --------------------------------- |
// | `add(5)` | `add(new int[]{5});` |
// | `add(1,2,3,4)` | `add(new int[]{1,2,3,4});` |
// | `add()` | `add(new int[]{});` (empty array) |

// or
/*
 * public class var_argsMethod {
 * public static void main(String[] args) {
 * add();
 * add(1);
 * add(1, 2);
 * add(1, 2, 3);
 * }
 * static void add(int... a) {
 * int sum = 0;
 * for (int x : a) {
 * sum += x;
 * }
 * System.out.println("Sum: " + sum);
 * }
 * }
 */