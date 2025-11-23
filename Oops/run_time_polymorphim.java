package Oops;

public class run_time_polymorphim {
    public static void main(String[] args) {
        A shape = new B();
        shape.draw();
    }
    
}
class A { 
    void draw(){
        System.out.println("anything ");
    }
}
class B extends A {
    @Override  //only represent that method is overridden
    void draw() {//if this method not present in parent it will give compilation error
        System.out.println("circle ");
    }
}
//output: circle ; bcz this method is overridden and it will always call the method of subclass if not overridden it will always call parent class method

// In overriding, the method name, parameters, and return type are all same as the parent class method,
// but it shows different behavior in the child class.