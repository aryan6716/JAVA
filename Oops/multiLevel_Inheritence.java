package Oops;

public class multiLevel_Inheritence {
    
    public static void main(String args[]){
        dog d = new dog  ();
        d.eat();  // this will internally print "yes"
        d.legs = 4;
        System.out.print("\n"+d.legs);
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
        int legs;
        }

    class dog extends mammals{
        String breed;
        }
    
