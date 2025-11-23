package Oops;

public class simple_inheritence {
    public static void main(String[] args) {
        aryan r = new aryan();//obj of sub
        r.input();
        r.display();
    }
}
class student {//super
    String name;
    int roll,marks;
    void input(){ // private void input() : this will give error bcz private only accesible in there class only but if we use protected it can be accesible to that class and class it inherit
        System.out.println("enter details: ");
    }
}
class aryan extends student{//sub
    void display(){
        roll=18; name="aryan"; marks=95;
        System.out.println(name+" "+roll+" "+marks);
    }
}


// enter details: 
// aryan 18 95
