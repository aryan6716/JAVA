package Oops;

public class hierchial_inheritence {

    public static void main(String args[]) {
        animal a = new animal();
        a.eat(); // this will internally print "yes"

        birds b = new birds();
        b.fly();
        b.breathe();

        fish f = new fish();
        f.swim();
    }
}

// base class or parent class
class animal {
    String color;;
    void eat() {
        System.out.println("yes");
    }

    void breathe() {
        System.out.println("yes");
    }
}

class mammals extends animal {
    void walk() {
        System.out.println("walk");
    }
}

class fish extends animal {
    void swim() {
        System.out.println("swim");
    }
}

class birds extends animal {
    void fly() {
        System.out.println("fly");
    }
}
