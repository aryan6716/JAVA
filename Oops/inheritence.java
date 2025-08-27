package Oops;

public class inheritence {
    public static void main(String args[]){
        fish f = new fish();
        f.eat();  // this will internally print "yes"

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

//derived class or child class or subclass 
class fish extends animal{
    String colour;;
    void swims(){
        System.out.print("yes");
    }
}