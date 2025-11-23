package Oops;

public class multiinheritence {
    public static void main(String[] args) {
        C c = new C();
        c.add();
    }
}


class A { // super
    int a, b, c;

    void add() {
        a = 10;
        b = 20;
        c = a + b;
        System.out.println("sum: " + c);
    }

    void sub() {
        a = 10;
        b = 20;
        c = a + b;
        System.out.println("sub: " + c);
    }
}

class B extends A { // sub 1
    void mul() {
        a = 10;
        b = 20;
        c = a * b;
        System.out.println("mul: " + c);
    }

    void div() {
        a = 10;
        b = 20;
        c = a / b;
        System.out.println("div: " + c);
    }
}

class C extends B { // sub 2
    void rem() {
        a = 10;
        b = 20;
        c = a % b;
        System.out.println("rem: " + c);
    }
}
