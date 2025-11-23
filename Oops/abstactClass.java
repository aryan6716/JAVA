package Oops;

public class abstactClass {
    public static void main(String[] args) {
        dog d = new dog();
        lion l = new lion();
        d.sound();l.sound();
    }
}
abstract class animal {
    animal(){
        System.out.println("constructor called...!");
    }
    public abstract void sound();
}
class dog extends animal{
    dog(){
        super(); //call super class constructor
    }
    public void sound(){
        System.out.println("dog barks");
    }
}
class lion extends animal{
    lion(){
        super();
    }
    public void sound(){
        System.out.println("dog roar");
    }
}
// constructor called...!
// constructor called...!
// dog barks
// dog roar