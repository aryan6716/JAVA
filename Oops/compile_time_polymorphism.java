package Oops;

public class compile_time_polymorphism {
    public static void main(String[] args) {
        A a = new A();
        a.add();
        a.add(2, 3);
        a.add(1, 3.5);
    }
}

class A {
    void add() {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(c);
    }

    void add(int x, int y) {
        int c = x + y;
        System.out.println(c);
    }

    void add(int x, double y) {
        double c = x + y;
        System.out.println(c);
    }
}
/*  here the name of method is same but behaviour is diff so it is call
polymorohism (compiler time polymorphism bcz compiler already know which
method to be called first on the basis of parameters by this example of
method overloading)*/
