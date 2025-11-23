package Oops;

public class InterfaceMethods {
    public static void main(String[] args) {
        // raj r = new raj(); //error: raj is abstract; cannot be instantiated
        raju r = new raju(); 
        r.design(); r.develop();
    }
}
interface client{
    void design();
    void develop();
}
abstract class raj implements client{
    @Override
    public void design(){
        System.out.println("green , top menu , slidebar");
    }
}
class raju extends raj{
    @Override
    public void develop(){
        System.out.println("Development: using Java and MySQL database");
    }
}
// green , top menu , slidebar
// Development: using Java and MySQL database 

/*
 Question 1: What is this program demonstrating?
👉 This program demonstrates interface implementation using abstract and concrete classes in Java.

🔹 Question 4: Why is raj class declared as abstract?
👉 Because raj implements only one method (design()) from the client interface,
the other (develop()) remains unimplemented — so it must be declared abstract.

🔹 Question 7: Why can’t we create an object of raj?
👉 Because raj is an abstract class, and abstract classes cannot be instantiated.
 */