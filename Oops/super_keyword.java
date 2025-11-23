package Oops;

public class super_keyword {
    public static void main(String[] args) {
        B b = new B();
        b.show();
    }
}

// class A {
//     int a = 10;
// }

// class B extends A {
//     int a = 100;

//     void show() {
//         System.out.println("a is: " + a);//100
//         System.out.println("a is: " + super.a);//10
//     }
// }

class A {
    void show(){
        System.out.println("super ");
    }
}

class B extends A {
    void show() {
        super.show();
        System.out.println("sub ");
    }
}
//super
//sub