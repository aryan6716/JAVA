package Oops;

public class hierchial_inheritence {
    
    public static void main(String args[]){
        animal a = new animal();
        a.eat();  // this will internally print "yes"

        birds b = new birds();
        b.fly();

        fish f = new fish();
        f.swim();
    }
}

//base class or parent class
class animal{
    String colour;;
    void eat(){
        System.out.print("yes");
    }
    void breathe(){
        System.out.print("yes");
    }
}

class mammals extends animal{
    void walk(){
        System.out.print("walk");
    }
}

class fish extends animal{
    void swim(){
        System.out.print("swim");
    }
}

class birds extends animal{
    void fly(){
        System.out.print("fly");
    }
}

    
